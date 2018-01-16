package com.example.sonyvaio.tester.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.adapter.RVWordsAdapter;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.presenter.WordsPresenter;
import com.example.sonyvaio.tester.view.WordsView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WordsActivity extends AppCompatActivity implements WordsView {

    @BindView(R.id.recyclerViewWords)
    RecyclerView mRecyclerViewWords;
    @BindView(R.id.fabBtnWords)
    FloatingActionButton mFloatingActionButton;

    private WordsPresenter presenter;
    public static ArrayList<Word> words;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        ButterKnife.bind(this);

        presenter = new WordsPresenter(this, this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerViewWords.setLayoutManager(linearLayoutManager);
        mRecyclerViewWords.setHasFixedSize(true);


        RVWordsAdapter adapter = new RVWordsAdapter(words);
        mRecyclerViewWords.setAdapter(adapter);

        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WordsActivity.this, TesterActivity.class);

                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("words", new ArrayList<Word>(words));
                intent.putExtras(bundle);
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



