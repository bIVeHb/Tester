package com.example.sonyvaio.tester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.sonyvaio.tester.presenter.MainPresenter;
import com.example.sonyvaio.tester.view.MainView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MainView{

    private MainPresenter presenter;

    Button btnVocabulary;
    Button btnTester;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this, this);

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
                startActivity(VocabularyActivity.startIntent(this));
                /*intent = new Intent(MainActivity.this, VocabularyActivity.class);
                startActivity(intent);*/
                break;

            case R.id.btnTester:
                intent = new Intent(MainActivity.this, TesterActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }
    }

    @Override
    public void loadInfo() {
        Log.i("TEST", "LoadInfo");
    }
}
