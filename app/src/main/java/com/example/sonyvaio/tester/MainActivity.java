package com.example.sonyvaio.tester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button btnVocabulary;
    Button btnTester;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVocabulary = (Button) findViewById(R.id.btnVocabulary);
        btnTester = (Button) findViewById(R.id.btnTester);

        btnVocabulary.setOnClickListener(this);
        btnTester.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId())
        {
            case R.id.btnVocabulary:
                intent = new Intent(MainActivity.this, VocabularyActivity.class);
                startActivity(intent);
                break;

            case R.id.btnTester:
                intent = new Intent(MainActivity.this, TesterActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }
    }
}
