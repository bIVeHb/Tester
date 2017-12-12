package com.example.sonyvaio.tester.presenter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.sonyvaio.tester.view.VocabularyView;

/**
 * Created by SonyVaio on 12.12.2017.
 */

public class VocabularyPresenter {

    @NonNull
    private final VocabularyView mView;

    public VocabularyPresenter(@NonNull Context context, @NonNull VocabularyView view){
        mView = view;

    }

    public void dispatchCreate(@Nullable Bundle savedInstanceState){
        if (savedInstanceState != null){
        }
    }
}
