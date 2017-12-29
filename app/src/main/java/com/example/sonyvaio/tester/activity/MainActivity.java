package com.example.sonyvaio.tester.activity;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.sonyvaio.tester.ArrayTransferEvent;
import com.example.sonyvaio.tester.data.ArraysWords;
import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.presenter.MainPresenter;
import com.example.sonyvaio.tester.routers.MainRouter;
import com.example.sonyvaio.tester.view.MainView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, MainView{

    private MainPresenter presenter;
    private MainRouter mRouter;

    Button btnVocabulary;
    Button btnTester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this, this);
        mRouter = new MainRouter(this);

        ArraysWords arraysWords = new ArraysWords();

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

                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("words", new ArrayList<Word>(ArraysWords.arrays));
                //ArrayList<Word> testing = new ArrayList<Word>(ArraysWords.arrays);
                intent.putExtras(bundle);
/*                ArrayTransferEvent event = new ArrayTransferEvent();
                event.setWords(ArraysWords.arrays);
                EventBus.getDefault().post(event);*/
                //Log.i("MainActivity ArraySize = ", String.valueOf(event.getWords().size()));
                startActivity(intent);
                //mRouter.showTesterActivity();
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
