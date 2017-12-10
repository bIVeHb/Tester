package com.example.sonyvaio.tester;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sonyvaio.tester.adapters.RVThemesAdapter;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.viewholders.ThemesViewHolder;

public class VocabularyActivity2 extends AppCompatActivity implements ThemesViewHolder.ThemeClickListener{

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

        Intent intent = new Intent(VocabularyActivity2.this, RVWordsActivity.class);
        RVWordsActivity.words = word;
        startActivity(intent);
    }
}




