package com.example.sonyvaio.tester.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sonyvaio.tester.ArrayTransferEvent;
import com.example.sonyvaio.tester.admob.Ads;
import com.example.sonyvaio.tester.data.ArraysWords;
import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.presenter.TesterPresenter;
import com.example.sonyvaio.tester.view.TesterView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

/**
 * Created by SonyVaio on 26.10.2017.
 */

public class TesterActivity extends Activity implements TesterView {

    @BindView(R.id.imageView0)
    ImageView imageView0;
    @BindView(R.id.imageView1)
    ImageView imageView1;
    @BindView(R.id.imageView2)
    ImageView imageView2;
    @BindView(R.id.imageView3)
    ImageView imageView3;


    @BindView(R.id.viewBackground0)
    View view0;
    @BindView(R.id.viewBackground1)
    View view1;
    @BindView(R.id.viewBackground2)
    View view2;
    @BindView(R.id.viewBackground3)
    View view3;

    @BindView(R.id.resultTextView)
    TextView resultTextView;
    @BindView(R.id.pointsTextView)
    TextView pointsTextView;
    @BindView(R.id.textViewQuestion)
    TextView textViewQuestion;

    @BindView(R.id.gridLayoutTester)
    GridLayout gridLayoutTester;
    @BindView(R.id.gridLayoutBackground)
    GridLayout gridLayoutBackground;

    private static final String TAG = "TesterActivity";
    private TesterPresenter presenter;

    private int mLocationOfCorrectAnswer = 0;
    private int score = 0;
    private int numberOfQuestions = 0;

    public HashSet<Integer> mTesterSet = new HashSet<Integer>();
    private ArrayList<Word> mTesterWords = new ArrayList<Word>();

    public static Intent startIntent(@NonNull Context context) {
        return new Intent(context, TesterActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester);

        //ArraysWords arraysWords = new ArraysWords();

        presenter = new TesterPresenter(this, this);

/*        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }*/
        //EventBus.getDefault().register(this);

        Ads.showBanner(this);


        Bundle extras = getIntent().getExtras();
        mTesterWords = new ArrayList<>();
        mTesterWords = extras.getParcelableArrayList("words");
        // mTesterWords.clear();
        //mTesterWords = new ArrayList<Word>(getIntent().getParcelableArrayListExtra("words"));
/*        Intent intent = getIntent();
        //mNameWords = intent.getStringExtra("words");
        mTesterWords = intent.getParcelableArrayListExtra("words");*/

        presenter.dispatchCreate(savedInstanceState);

        play();

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.getParcelableArrayList("words");
    }

/*    @Subscribe()
    public void onEvent(ArrayTransferEvent event){
        Log.i("TesterActivity ArraySize = ", String.valueOf(event.getWords().size()));
        mTesterWords = event.getWords();
    }*/

    public void play() {

        score = 0;
        numberOfQuestions = 0;


        //timerTextView.setText("30s");
        pointsTextView.setText("0/0");
        resultTextView.setText("");

        generateQuestion();

        /*new CountDownTimer(30100, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {

                timerTextView.setText(String.valueOf(millisUntilFinished / 1000) + "s");

            }

            @Override
            public void onFinish() {

                timerTextView.setText("0s");
                resultTextView.setText("Количество правильных ответов: " + Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));
                gridLayoutTester.setVisibility(View.INVISIBLE);
            }
        }.start();*/


    }

    public void chooseAnswer(final View view) {

        final View[] views = {view0, view1, view2, view3};

        if (view.getTag().toString().equals(Integer.toString(mLocationOfCorrectAnswer))) {
            views[mLocationOfCorrectAnswer].setBackgroundColor(ContextCompat.getColor(this, R.color.colorRightAnswer));
            views[mLocationOfCorrectAnswer].setVisibility(View.VISIBLE);
            score++;
            resultTextView.setTextColor(getResources().getColor(R.color.colorMyGreen));
            resultTextView.setText(R.string.rightAnswer);
        } else {
            views[Integer.parseInt(view.getTag().toString())].setBackgroundColor(ContextCompat.getColor(this, R.color.colorWrongAnswer));
            views[Integer.parseInt(view.getTag().toString())].setVisibility(View.VISIBLE);
            resultTextView.setTextColor(Color.RED);
            resultTextView.setText(R.string.wrongAnswer);

        }

        numberOfQuestions++;
        pointsTextView.setText(Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                for (int i = 0; i < views.length; i++) {
                    views[i].setVisibility(View.INVISIBLE);
                }
                generateQuestion();
            }
        }, 1200);

    }


    private void generateQuestion() {

        resultTextView.setText("");


        presenter.dispatchGenerateQuestion(mTesterSet, mTesterWords);
    }


    @Override
    protected void onStart() {
        //EventBus.getDefault().register(this);//Register
        super.onStart();


/*        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStart()");*/
    }

    @Override
    protected void onResume() {
        //EventBus.getDefault().register(this);
        super.onResume();


/*        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onResume()");*/
    }

    @Override
    protected void onPause() {
        //EventBus.getDefault().unregister(this);
        super.onPause();

/*        Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onPause()");*/

    }

    @Override
    protected void onStop() {
        //EventBus.getDefault().unregister(this);//unregister
        super.onStop();

/*
        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStop()");*/
    }

    @Override
    protected void onRestart() {
        super.onRestart();

/*        Toast.makeText(getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onRestart()");*/
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        mTesterWords = new ArrayList<>();
        mTesterSet.clear();
        //EventBus.getDefault().unregister(this);

        //Toast.makeText(getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void showAnswer(Integer[] myArray, List<Word> arrayWords) {

        mLocationOfCorrectAnswer = ArraysWords.randomInt(myArray.length);

        ImageView[] imagesView = {imageView0, imageView1, imageView2, imageView3};

        textViewQuestion.setText(arrayWords.get(myArray[mLocationOfCorrectAnswer]).getWord());

        for (int i = 0; i < imagesView.length; i++) {
            imagesView[i].setTranslationX(-1000f);
            imagesView[i].setBackgroundResource(arrayWords.get(myArray[i]).getPicture());
            imagesView[i].animate().translationXBy(1000f).setDuration(300);
        }
        mTesterSet.clear();
    }

    // По ключу находим значение
    public ArrayList<Word> getWordsByKey(String someKey) {
        for (Map.Entry<String, ArrayList<Word>> entry : ArraysWords.mThemesMap.entrySet()) {
            if (entry.getKey().equals(String.valueOf(someKey)))
                return entry.getValue();
        }
        return null;
    }
}
