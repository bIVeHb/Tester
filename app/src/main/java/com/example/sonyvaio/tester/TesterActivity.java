package com.example.sonyvaio.tester;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sonyvaio.tester.presenter.TesterPresenter;
import com.example.sonyvaio.tester.view.TesterView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import static com.example.sonyvaio.tester.ArraysWords.actions;

/**
 * Created by SonyVaio on 26.10.2017.
 */

public class TesterActivity extends Activity implements TesterView {

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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester);

        presenter = new TesterPresenter(this, this);

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

        presenter.dispatchCreate(savedInstanceState);

        play();

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
            views[mLocationOfCorrectAnswer].setVisibility(View.VISIBLE);
            score++;
            resultTextView.setText("Правильный ответ!");
        } else {
            resultTextView.setText("Неправильный ответ!");

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
        }, 2000);



    }

/*    public void chooseAnswerBackGround(View view){

        final View[] views = {view0, view1, view2, view3};

        if (view.getTag().toString().equals(Integer.toString(mLocationOfCorrectAnswer))) {
            views[mLocationOfCorrectAnswer].setVisibility(View.VISIBLE);

        } else {
            views[mLocationOfCorrectAnswer].setVisibility(View.VISIBLE);
        }
    }*/

    private void generateQuestion() {

        presenter.dispatchGenerateQuestion(mTesterSet);

    }


    @Override
    public void onBackPressed() {
        // code here to show dialog
        super.onBackPressed();  // optional depending on your needs
        //testerSet = new HashSet<Integer>();
        finish();
    }

    @Override
    public void showAnswer(Integer[] myArray) {

        mLocationOfCorrectAnswer = ArraysWords.randomInt(myArray.length);

        ImageView[] imagesView = {imageView0, imageView1, imageView2, imageView3};

        textViewQuestion.setText(actions[myArray[mLocationOfCorrectAnswer]].getWord());

        for (int i = 0; i < imagesView.length; i++) {
            imagesView[i].setTranslationX(-1000f);
            imagesView[i].setBackgroundResource(actions[myArray[i]].getPicture());
            imagesView[i].animate().translationXBy(1000f).setDuration(300);
        }

        mTesterSet.clear();

    }
}
