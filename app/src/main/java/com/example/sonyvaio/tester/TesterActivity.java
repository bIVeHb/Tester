package com.example.sonyvaio.tester;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.HashSet;

import static com.example.sonyvaio.tester.ArraysWords.actions;

/**
 * Created by SonyVaio on 26.10.2017.
 */

public class TesterActivity extends Activity implements ImageView.OnClickListener{

    ImageView imageView0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    Integer[] myArray = {};

    public int number = 20;
    public int answer = 0;

    final String TAG = " answer";
    final String TAG_ANSWER = " button";

    // Может статическое поле убрать?
    public HashSet<Integer> testerSet = new HashSet<Integer>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester);

        imageView0 = (ImageView) findViewById(R.id.imageView0);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);

        imageView0.setOnClickListener(this);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);

        final ImageView[] imagesView = {imageView0, imageView1, imageView2, imageView3};

        loopTester(myArray, imagesView);
    }


    public void loopTester(Integer[] myArray, ImageView[] imagesView) {


        for (int k = 0; k < number; k++) {

            ArraysWords.fillHashSet(testerSet, actions.length);
            myArray = testerSet.toArray(new Integer[testerSet.size()]);
            answer = ArraysWords.randomInt(myArray.length);
            Log.i(TAG, "k = " + k + ", answer = " + answer);

            for (int i = 0; i < imagesView.length; i++) {
                //imagesView[i].setTranslationX(-1000f);
                imagesView[i].setBackgroundResource(actions[myArray[i]].getPicture());
                //imagesView[i].animate().translationXBy(1000f).setDuration(300);
            }
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.imageView0:
                if (answer == 0) {
                    Log.i(TAG_ANSWER + " 0 ", "imageView0 clicked " + "Вы ответили правильно");
                    break;
                }
            case R.id.imageView1:
                if (answer == 1) {
                    Log.i(TAG_ANSWER + " 1 ", "imageView1 clicked " + "Вы ответили правильно");
                    break;
                }
            case R.id.imageView2:
                if (answer == 2) {
                    Log.i(TAG_ANSWER + " 2 ", "imageView2 clicked " + "Вы ответили правильно");
                    break;
                }
            case R.id.imageView3:
                if (answer == 3) {
                    Log.i(TAG_ANSWER + " 3 ", "imageView3 clicked " + "Вы ответили правильно");
                    break;
                }
            default:
                break;
        }

    }

    @Override
    public void onBackPressed() {
        // code here to show dialog
        super.onBackPressed();  // optional depending on your needs
        //testerSet = new HashSet<Integer>();
        finish();
    }
}
