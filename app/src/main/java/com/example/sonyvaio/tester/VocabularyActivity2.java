package com.example.sonyvaio.tester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.sonyvaio.tester.model.Word;

import java.util.ArrayList;

public class VocabularyActivity2 extends AppCompatActivity {

    private RecyclerView recyclerViewVocabulary;
    //static ArrayList<Word[]> arrayList = new ArrayList<Word[]>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary2);

        ArraysWords arraysWords = new ArraysWords();

        recyclerViewVocabulary = (RecyclerView) findViewById(R.id.recyclerViewVocabulary);


        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //recyclerViewVocabulary.setLayoutManager(linearLayoutManager);
        recyclerViewVocabulary.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerViewVocabulary.setHasFixedSize(false);
        recyclerViewVocabulary.setNestedScrollingEnabled(false);


        RVThemesAdapter adapter = new RVThemesAdapter(ArraysWords.themesList2);
        recyclerViewVocabulary.setAdapter(adapter);
    }

}



