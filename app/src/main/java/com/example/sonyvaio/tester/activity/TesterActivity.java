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
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sonyvaio.tester.admob.Ads;
import com.example.sonyvaio.tester.data.ArraysWords;
import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.presenter.TesterPresenter;
import com.example.sonyvaio.tester.view.TesterView;

import java.util.HashSet;
import java.util.Map;

/**
 * Created by SonyVaio on 26.10.2017.
 */

public class TesterActivity extends Activity implements TesterView {

    private static final String TAG = "TesterActivity";
    private TesterPresenter presenter;

    ImageView imageView0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    View view0;
    View view1;
    View view2;
    View view3;

    private TextView resultTextView;
    private TextView pointsTextView;
    //private TextView timerTextView;
    private TextView textViewQuestion;

    private GridLayout gridLayoutTester;
    private GridLayout gridLayoutBackground;

    //Integer[] myArray = {};

    private int mLocationOfCorrectAnswer = 0;
    private int score = 0;
    private int numberOfQuestions = 0;

    public HashSet<Integer> mTesterSet = new HashSet<Integer>();
    private String mNameWords;
    private Word[] mTesterWords;

    public static Intent startIntent(@NonNull Context context) {
        return new Intent(context, TesterActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester);

        presenter = new TesterPresenter(this, this);

        Ads.showBanner(this);

        imageView0 = (ImageView) findViewById(R.id.imageView0);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);

        view0 = (View) findViewById(R.id.viewBackground0);
        view1 = (View) findViewById(R.id.viewBackground1);
        view2 = (View) findViewById(R.id.viewBackground2);
        view3 = (View) findViewById(R.id.viewBackground3);

        resultTextView = (TextView) findViewById(R.id.resultTextView);
        pointsTextView = (TextView) findViewById(R.id.pointsTextView);
        //timerTextView = (TextView) findViewById(R.id.timerTextView);
        textViewQuestion = (TextView) findViewById(R.id.textViewQuestion);

        gridLayoutTester = (GridLayout) findViewById(R.id.gridLayoutTester);
        gridLayoutBackground = (GridLayout) findViewById(R.id.gridLayoutBackground);

        ArraysWords arraysWords = new ArraysWords();

        Intent intent = getIntent();
        mNameWords = intent.getStringExtra("words");
        mTesterWords = new Word[getWordsByKey(mNameWords).length];
        mTesterWords = getWordsByKey(mNameWords);

        Toast.makeText(this, mNameWords, Toast.LENGTH_SHORT).show();

        presenter.dispatchCreate(savedInstanceState);

        play();

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

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
        mTesterSet.clear();
    }


/*    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onRestart()");
    }*/

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onDestroy() {
        //sTesterWords = null;

        super.onDestroy();

        Toast.makeText(getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void showAnswer(Integer[] myArray, Word[] arrayWords) {

        mLocationOfCorrectAnswer = ArraysWords.randomInt(myArray.length);

        ImageView[] imagesView = {imageView0, imageView1, imageView2, imageView3};

        textViewQuestion.setText(arrayWords[myArray[mLocationOfCorrectAnswer]].getWord());

        for (int i = 0; i < imagesView.length; i++) {
            imagesView[i].setTranslationX(-1000f);
            imagesView[i].setBackgroundResource(arrayWords[myArray[i]].getPicture());
            imagesView[i].animate().translationXBy(1000f).setDuration(300);
        }

    }

    // По ключу находим значение
    public Word[] getWordsByKey(String someKey) {
        for (Map.Entry<String, Word[]> entry : ArraysWords.mThemesMap.entrySet()) {
            if (entry.getKey().equals(String.valueOf(someKey)))
                return entry.getValue();
        }
        return null;
    }
}
