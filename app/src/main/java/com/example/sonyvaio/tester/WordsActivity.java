package com.example.sonyvaio.tester;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.sonyvaio.tester.adapter.RVWordsAdapter;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.presenter.WordsPresenter;
import com.example.sonyvaio.tester.view.WordsView;

public class WordsActivity extends AppCompatActivity implements WordsView {

    private WordsPresenter presenter;
    private RecyclerView mRecyclerViewWords;
    static Word[] words = new Word[]{};
    private FloatingActionButton mFloatingActionButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        presenter = new WordsPresenter(this, this);
        mRecyclerViewWords = (RecyclerView) findViewById(R.id.recyclerViewWords);
        mFloatingActionButton = (FloatingActionButton) findViewById(R.id.fabBtnWords);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerViewWords.setLayoutManager(linearLayoutManager);
        //recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mRecyclerViewWords.setHasFixedSize(true);

        RVWordsAdapter adapter = new RVWordsAdapter(words);
        mRecyclerViewWords.setAdapter(adapter);

        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TesterActivity.mTesterWords = words;
                Intent intent = new Intent(WordsActivity.this, TesterActivity.class);
                startActivity(intent);
            }
        });
    }

}



