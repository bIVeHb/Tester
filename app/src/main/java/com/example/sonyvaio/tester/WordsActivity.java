package com.example.sonyvaio.tester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sonyvaio.tester.adapters.RVWordsAdapter;
import com.example.sonyvaio.tester.model.Word;

public class WordsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    static Word[] words = new Word[]{};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewWords);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        //recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setHasFixedSize(false);
        recyclerView.setNestedScrollingEnabled(false);


        RVWordsAdapter adapter = new RVWordsAdapter(words);
        recyclerView.setAdapter(adapter);
    }

}


