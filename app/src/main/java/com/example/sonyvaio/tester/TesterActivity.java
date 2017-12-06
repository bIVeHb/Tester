package com.example.sonyvaio.tester;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import static com.example.sonyvaio.tester.ArraysWords.actions;

/**
 * Created by SonyVaio on 26.10.2017.
 */

public class TesterActivity extends Activity {

    ImageView imageView0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    TextView resultTextView;
    TextView pointsTextView;
    TextView timerTextView;
    TextView textViewQuestion;

    GridLayout gridLayoutTester;

    Integer[] myArray = {};

    public int locationOfCorrectAnswer = 0;
    public int score = 0;
    public int numberOfQuestions = 0;

    public HashSet<Integer> testerSet = new HashSet<Integer>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester);

        imageView0 = (ImageView) findViewById(R.id.imageView0);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);

        resultTextView = (TextView) findViewById(R.id.resultTextView);
        pointsTextView = (TextView) findViewById(R.id.pointsTextView);
        timerTextView = (TextView) findViewById(R.id.timerTextView);
        textViewQuestion = (TextView) findViewById(R.id.textViewQuestion);

        gridLayoutTester = (GridLayout) findViewById(R.id.gridLayoutTester);

        play();

    }

    public void play() {

        score = 0;
        numberOfQuestions = 0;

        timerTextView.setText("30s");
        pointsTextView.setText("0/0");
        resultTextView.setText("");

        generateQuestion();

        new CountDownTimer(30100, 1000) {

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
        }.start();


    }

    public void chooseAnswer(View view) {
        if (view.getTag().toString().equals(Integer.toString(locationOfCorrectAnswer))) {
            score++;
            resultTextView.setText("Правильный ответ!");
        } else {
            resultTextView.setText("Неправильный ответ!");
        }

        numberOfQuestions++;
        pointsTextView.setText(Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));
        generateQuestion();
    }

    private void generateQuestion() {

        ImageView[] imagesView = {imageView0, imageView1, imageView2, imageView3};

        ArraysWords.fillHashSet(testerSet, actions.length);
        myArray = testerSet.toArray(new Integer[testerSet.size()]);
        locationOfCorrectAnswer = ArraysWords.randomInt(myArray.length);

        textViewQuestion.setText("Что означает слово " + "\n" + actions[myArray[locationOfCorrectAnswer]].getWord());

        for (int i = 0; i < imagesView.length; i++) {
            imagesView[i].setTranslationX(-1000f);
            imagesView[i].setBackgroundResource(actions[myArray[i]].getPicture());
            imagesView[i].animate().translationXBy(1000f).setDuration(300);
        }

        testerSet.clear();
    }


    @Override
    public void onBackPressed() {
        // code here to show dialog
        super.onBackPressed();  // optional depending on your needs
        //testerSet = new HashSet<Integer>();
        finish();
    }
}
