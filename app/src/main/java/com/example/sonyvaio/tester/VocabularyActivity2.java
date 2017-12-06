package com.example.sonyvaio.tester;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.sonyvaio.tester.model.Word;

import java.util.ArrayList;
import java.util.Map;

public class VocabularyActivity2 extends AppCompatActivity implements RVThemesAdapter.ThemesViewHolder.ThemeClickListener{

    private RecyclerView recyclerViewVocabulary;
    //static ArrayList<Word[]> arrayList = new ArrayList<Word[]>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary2);

        ArraysWords arraysWords = new ArraysWords();

        recyclerViewVocabulary = (RecyclerView) findViewById(R.id.recyclerViewVocabulary);



        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewVocabulary.setLayoutManager(linearLayoutManager);
        //recyclerViewVocabulary.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerViewVocabulary.setHasFixedSize(false);
        recyclerViewVocabulary.setNestedScrollingEnabled(false);

        RVThemesAdapter adapter = new RVThemesAdapter(ArraysWords.themesList2);
        recyclerViewVocabulary.setAdapter(adapter);
        adapter.setThemeClickListener(this);
    }

    @Override
    public void onThemeClick(@NonNull Word[] word) {

        Intent intent = new Intent(VocabularyActivity2.this, RecyclerViewActivity.class);
        RecyclerViewActivity.words = word;
        startActivity(intent);
    }
}




