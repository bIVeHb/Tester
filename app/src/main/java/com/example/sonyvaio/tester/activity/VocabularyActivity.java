package com.example.sonyvaio.tester.activity;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.sonyvaio.tester.data.ArraysWords;
import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.adapter.RVThemesAdapter;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.adapter.viewholder.ThemesViewHolder;
import com.example.sonyvaio.tester.presenter.VocabularyPresenter;
import com.example.sonyvaio.tester.view.VocabularyView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VocabularyActivity extends AppCompatActivity implements ThemesViewHolder.ThemeClickListener, VocabularyView {

    @BindView(R.id.recyclerViewVocabulary)
    RecyclerView mRecyclerViewVocabulary;

    private VocabularyPresenter presenter;
    private ArrayList<String> mThemes = new ArrayList<>();


    public static Intent startIntent(@NonNull Context context) {
        return new Intent(context, VocabularyActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);
        ButterKnife.bind(this);

        mThemes.add("Глаголы");
        mThemes.add("Алфавит");
        mThemes.add("Части тела животных");
        mThemes.add("Животные");
        mThemes.add("Птицы");
        mThemes.add("Насекомые");
        mThemes.add("Школьные предметы");
        mThemes.add("Одежда");
        mThemes.add("Цвета");
        mThemes.add("Прилагательные");
        mThemes.add("Повседневные предметы");
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


        loadJSONFromAsset(RVThemesAdapter.mThemesMap);


        mRecyclerViewVocabulary.setLayoutManager(new GridLayoutManager(this, 2));
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

    public void loadJSONFromAsset(HashMap<String, ArrayList<Word>> themesMap) {

        List<String> themes = Arrays.asList(
                "Глаголы", "Алфавит", "Части тела животных",
                "Животные", "Птицы", "Насекомые", "Школьные предметы", "Одежда", "Цвета",
                "Прилагательные", "Повседневные предметы", "Сказка", "Семья", "Чувства", "Еда",
                "Мебель", "Дом", "Домашние предметы", "Части тела человека", "Природа", "Числа",
                "Места", "Предлоги", "Фигуры", "Транспорт", "Погода");
        Collections.sort(themes);

        String json = "";

        try {
            InputStream is = getAssets().open("words2.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

            // Сначала получаем объект, а потом ищем в нем массивы(списки)
            JSONObject words = new JSONObject(json);

            for (int k = 0; k < themes.size(); k++) {

                JSONArray wordsArray = words.getJSONArray(themes.get(k));
                ArrayList<Word> wordArrayList = new ArrayList<>();

                for (int i = 0; i < wordsArray.length(); i++) {
                    String word = wordsArray.getJSONObject(i).getString("word");
                    String translatedWord = wordsArray.getJSONObject(i).getString("translatedWord");
                    String transcription = wordsArray.getJSONObject(i).getString("transcription");
                    String pictureString = wordsArray.getJSONObject(i).getString("picture");
                    int picture = getResources().getIdentifier(pictureString, null, getPackageName());

                    Word temp = new Word(word, translatedWord, transcription, picture);
                    // adding word to wordlist
                    wordArrayList.add(temp);
                }
                themesMap.put(themes.get(k), wordArrayList);
            }

        } catch (IOException | JSONException ex) {
            ex.printStackTrace();
        }
    }
}




