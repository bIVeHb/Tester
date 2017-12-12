package com.example.sonyvaio.tester.presenter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.sonyvaio.tester.view.WordsView;

/**
 * Created by SonyVaio on 12.12.2017.
 */

public class WordsPresenter {

    @NonNull
    private final WordsView mView;

    public WordsPresenter(@NonNull Context context, @NonNull WordsView view){
        mView = view;

    }

    public void dispatchCreate(@Nullable Bundle savedInstanceState){
        if (savedInstanceState != null){
        }
    }
}
