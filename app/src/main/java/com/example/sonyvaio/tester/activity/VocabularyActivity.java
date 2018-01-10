package com.example.sonyvaio.tester.activity;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sonyvaio.tester.data.ArraysWords;
import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.adapter.RVThemesAdapter;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.adapter.viewholder.ThemesViewHolder;
import com.example.sonyvaio.tester.presenter.VocabularyPresenter;
import com.example.sonyvaio.tester.view.VocabularyView;

import java.util.ArrayList;
import java.util.Collections;

public class VocabularyActivity extends AppCompatActivity implements ThemesViewHolder.ThemeClickListener, VocabularyView {

    private VocabularyPresenter presenter;
    private RecyclerView mRecyclerViewVocabulary;
    private int COLUMN_PORTRAIT = 2;
    private ArrayList<String> mThemes = new ArrayList<>();


    public static Intent startIntent(@NonNull Context context) {
        return new Intent(context, VocabularyActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

        mThemes.add("Глаголы");
        mThemes.add("Алфавит");
        mThemes.add("Части тела животных");
        mThemes.add("Животные");
        mThemes.add("Птицы");
        mThemes.add("Насекомые");
        mThemes.add("Школьные предметы");
        mThemes.add("Одежда");
        mThemes.add("Цвета");
        mThemes.add("Описание");
        mThemes.add("Ежедневные предметы");
        mThemes.add("Сказка");
        mThemes.add("Семья");
        mThemes.add("Чувства");
        mThemes.add("Еда");
        mThemes.add("Мебель");
        mThemes.add("Дом");
        mThemes.add("Домашние предметы");
        mThemes.add("Части тела человека");
        mThemes.add("Природа");
        mThemes.add("Числа");
        mThemes.add("Места");
        mThemes.add("Предлоги");
        mThemes.add("Фигуры");
        mThemes.add("Транспорт");
        mThemes.add("Погода");
        Collections.sort(mThemes);

        presenter = new VocabularyPresenter(this, this);

/*        if (arraysWords == null)
            arraysWords = new ArraysWords();*/

        mRecyclerViewVocabulary = (RecyclerView) findViewById(R.id.recyclerViewVocabulary);



        /*LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerViewVocabulary.setLayoutManager(linearLayoutManager);*/
        mRecyclerViewVocabulary.setLayoutManager(new GridLayoutManager(this, 2));
        //mRecyclerViewVocabulary.setLayoutManager(new StaggeredGridLayoutManager(COLUMN_PORTRAIT, StaggeredGridLayoutManager.VERTICAL));
        mRecyclerViewVocabulary.setHasFixedSize(true);

        RVThemesAdapter adapter = new RVThemesAdapter(mThemes);
        mRecyclerViewVocabulary.setAdapter(adapter);
        adapter.setThemeClickListener(this);
    }

    @Override
    public void onThemeClick(@NonNull ArrayList<Word> word) {

        Intent intent = new Intent(VocabularyActivity.this, WordsActivity.class);
        WordsActivity.words = word;
        startActivity(intent);
    }

}




