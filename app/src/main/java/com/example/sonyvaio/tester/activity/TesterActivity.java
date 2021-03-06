package com.example.sonyvaio.tester.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.sonyvaio.tester.admob.Ads;
import com.example.sonyvaio.tester.data.ArraysWords;
import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.presenter.TesterPresenter;
import com.example.sonyvaio.tester.view.TesterView;

import java.util.ArrayList;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

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
    //@BindView(R.id.pointsTextView)
    //TextView pointsTextView;
    @BindView(R.id.textViewQuestion)
    TextView textViewQuestion;
    @BindView(R.id.textViewPBar)
    TextView textViewProgressBar;
    @BindView(R.id.hintTextView)
    TextView textViewHint;

    @BindView(R.id.gridLayoutTester)
    GridLayout gridLayoutTester;
    @BindView(R.id.gridLayoutBackground)
    GridLayout gridLayoutBackground;

    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;


    private static final String TAG = "TesterActivity";
    private TesterPresenter presenter;

    private int mLocationOfCorrectAnswer = 0;
    private int score = 0;
    private int numberOfQuestions = 0;

    private ArrayList<Word> mTesterWords = new ArrayList<>();

    public static Intent startIntent(@NonNull Context context) {
        return new Intent(context, TesterActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester);
        ButterKnife.bind(this);

        mProgressBar.setProgress(0);
        mProgressBar.setMax(100);

        Bundle extras = getIntent().getExtras();
        ArrayList<Word> testerWords = new ArrayList<Word>();
        testerWords = extras.getParcelableArrayList("words");
        mTesterWords.clear();
        mTesterWords.addAll(testerWords);

        presenter = new TesterPresenter(this, this);

        Ads.showBanner(this);

        play();

    }

    public void play() {

        score = 0;
        numberOfQuestions = 0;

        resultTextView.setText("");
        textViewHint.setText("");

        generateQuestion();

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
            textViewHint.setVisibility(View.VISIBLE);

        }

        numberOfQuestions++;
        //pointsTextView.setText(Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));


        // получаем текущее значение ProgressBar
        int progressValue = (int) ((double)(Double.valueOf(score)/Double.valueOf(numberOfQuestions)) * 100);
        mProgressBar.setProgress(progressValue);

        // Зададим цвет индикатора ProgressBar
        Resources res = getResources();
        if (progressValue >= 75) {
            mProgressBar.setProgressDrawable(res.getDrawable(R.drawable.progressbar_green));
        }else if (progressValue > 25 && progressValue < 75){
            mProgressBar.setProgressDrawable(res.getDrawable(R.drawable.progressbar_yellow));
        }else if (progressValue <= 25){
            mProgressBar.setProgressDrawable(res.getDrawable(R.drawable.progressbar_red));
        }

        textViewProgressBar.setText(String.valueOf(progressValue) + "%" + " (" + Integer.toString(score) + "/" + Integer.toString(numberOfQuestions) + ")");


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
        textViewHint.setText("");

        presenter.dispatchGenerateQuestion(mTesterWords);
    }


    @Override
    public void showAnswer(ArrayList<Integer> myArray, ArrayList<Word> arrayWords) {

        Log.i(" TesterAct array = ", String.valueOf(arrayWords.size()));

        mLocationOfCorrectAnswer = ArraysWords.randomInt(myArray.size());

        ImageView[] imagesView = {imageView0, imageView1, imageView2, imageView3};

        textViewQuestion.setTranslationX(-1000f);
        textViewQuestion.setText(arrayWords.get(myArray.get(mLocationOfCorrectAnswer)).getWord());
        textViewQuestion.animate().translationXBy(1000f).setDuration(300);
        // Подсказка
        textViewHint.setVisibility(View.INVISIBLE);
        textViewHint.setText("Правильный ответ: " + arrayWords.get(myArray.get(mLocationOfCorrectAnswer)).getTranslatedWord());

        for (int i = 0; i < imagesView.length; i++) {
            imagesView[i].setTranslationX(-1000f);
            imagesView[i].setBackgroundResource(arrayWords.get(myArray.get(i)).getPicture());
            imagesView[i].animate().translationXBy(1000f).setDuration(300);
        }
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
