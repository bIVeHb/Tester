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

public class VocabularyActivity extends AppCompatActivity implements ThemesViewHolder.ThemeClickListener, VocabularyView{

    private VocabularyPresenter presenter;
    private RecyclerView mRecyclerViewVocabulary;
    //static ArrayList<Word[]> arrayList = new ArrayList<Word[]>();
    private int COLUMN_PORTRAIT = 2;

    public static Intent startIntent(@NonNull Context context) {
        return new Intent(context, VocabularyActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

        presenter = new VocabularyPresenter(this, this);
        ArraysWords arraysWords = new ArraysWords();

        mRecyclerViewVocabulary = (RecyclerView) findViewById(R.id.recyclerViewVocabulary);



        /*LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerViewVocabulary.setLayoutManager(linearLayoutManager);*/
        mRecyclerViewVocabulary.setLayoutManager(new GridLayoutManager(this, 2));
        //mRecyclerViewVocabulary.setLayoutManager(new StaggeredGridLayoutManager(COLUMN_PORTRAIT, StaggeredGridLayoutManager.VERTICAL));
        mRecyclerViewVocabulary.setHasFixedSize(true);

        RVThemesAdapter adapter = new RVThemesAdapter(ArraysWords.themesList2);
        mRecyclerViewVocabulary.setAdapter(adapter);
        adapter.setThemeClickListener(this);
    }

    @Override
    public void onThemeClick(@NonNull Word[] word) {

        Intent intent = new Intent(VocabularyActivity.this, WordsActivity.class);
        WordsActivity.words = word;
        startActivity(intent);
    }
}




