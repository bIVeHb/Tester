package com.example.sonyvaio.tester.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.sonyvaio.tester.ArrayTransferEvent;
import com.example.sonyvaio.tester.data.ArraysWords;
import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.adapter.RVWordsAdapter;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.presenter.WordsPresenter;
import com.example.sonyvaio.tester.view.WordsView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordsActivity extends AppCompatActivity implements WordsView {

    private WordsPresenter presenter;
    private RecyclerView mRecyclerViewWords;
    public static ArrayList<Word> words;
    private FloatingActionButton mFloatingActionButton;
    private String mNameWords;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArraysWords arraysWords = new ArraysWords();

        presenter = new WordsPresenter(this, this);
        mRecyclerViewWords = (RecyclerView) findViewById(R.id.recyclerViewWords);
        mFloatingActionButton = (FloatingActionButton) findViewById(R.id.fabBtnWords);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerViewWords.setLayoutManager(linearLayoutManager);
        //recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mRecyclerViewWords.setHasFixedSize(true);

        //mNameWords = getKeyByWords(ArraysWords.mThemesMap, words);
        //Toast.makeText(this, mNameWords, Toast.LENGTH_SHORT).show();

        RVWordsAdapter adapter = new RVWordsAdapter(words);
        mRecyclerViewWords.setAdapter(adapter);

        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WordsActivity.this, TesterActivity.class);
                //intent.putExtra("words", mNameWords);

                //ArrayTransferEvent event = new ArrayTransferEvent();
                //event.setWords(new ArrayList<Word>(words));
                EventBus.getDefault().post(new ArrayTransferEvent(words));
                //Log.i("WordsActivity ArraySize = ", String.valueOf(event.getWords().size()));
                startActivity(intent);
            }
        });
    }

    // По значению находим название массива на русском
    public String getKeyByWords(HashMap<String, ArrayList<Word>> map , ArrayList<Word> someValue){
        for(Map.Entry<String, ArrayList<Word>> entry : map.entrySet()) {
            if (entry.getValue().equals(someValue))
                return entry.getKey();
        }
        return null;
    }
}



