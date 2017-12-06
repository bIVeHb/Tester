package com.example.sonyvaio.tester;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sonyvaio.tester.model.Word;

import java.util.Map;

import static android.widget.GridLayout.*;

/**
 * Created by SonyVaio on 26.10.2017.
 */

public class VocabularyActivity extends Activity {

    GridLayout gridLayoutVocabulary;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

        gridLayoutVocabulary = (GridLayout) findViewById(R.id.gridLayoutVocabulary);

        ArraysWords arraysWords = new ArraysWords();

        Display display = getWindowManager().getDefaultDisplay();
        int width = (int) ((display.getWidth())/2.5);
        int height = (int) ((display.getWidth())/2.5);
        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(width,height);
        int id = 0;


        for(Map.Entry<String, Word[]> entry : ArraysWords.themesMap.entrySet())
        {
            //lButtonParams.gravity = Gravity.CENTER;
            //lButtonParams.gravity = Gravity.FILL;
            ImageButton imageButton = new ImageButton(this);
            //imageView.setGravity(Gravity.FILL);
            imageButton.setLayoutParams(parms);
            imageButton.setId(id);
            final Word[] array = entry.getValue();
            imageButton.setBackgroundResource(array[ArraysWords.randomInt(array.length)].getPicture());
            imageButton.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(VocabularyActivity.this, RecyclerViewActivity.class);
                    RecyclerViewActivity.words = array;
                    startActivity(intent);
                }
            });



            TextView textView = new TextView(this);
            textView.setGravity(Gravity.CENTER);
            textView.setId(id);
            textView.setText(entry.getKey());
            //btn.setLayoutParams(lButtonParams);
            //btn.setOnClickListener(this);

            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setGravity(Gravity.FILL_HORIZONTAL);
            linearLayout.setPadding(35, 35, 35, 35);
            //linearLayout.setGravity(Gravity.CENTER_HORIZONTAL);
            linearLayout.setOrientation(LinearLayout.VERTICAL);
            linearLayout.addView(imageButton);
            linearLayout.addView(textView);

            gridLayoutVocabulary.addView(linearLayout);
            id++;
        }

    }
}
