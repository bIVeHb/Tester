package com.example.sonyvaio.tester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sonyvaio.tester.adapter.RVWordsAdapter;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.presenter.WordsPresenter;
import com.example.sonyvaio.tester.view.WordsView;

public class WordsActivity extends AppCompatActivity implements WordsView {

    private WordsPresenter presenter;
    private RecyclerView recyclerView;
    static Word[] words = new Word[]{};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        presenter = new WordsPresenter(this, this);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewWords);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        //recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setHasFixedSize(true);

        RVWordsAdapter adapter = new RVWordsAdapter(words);
        recyclerView.setAdapter(adapter);
    }

}



