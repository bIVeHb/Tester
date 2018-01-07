package com.example.sonyvaio.tester.presenter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.repository.RepositoryProvider;
import com.example.sonyvaio.tester.view.TesterView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Created by SonyVaio on 11.12.2017.
 */

public class TesterPresenter {

    @NonNull
    private final TesterView mView;
    private HashSet<Integer> mTesterSet = new HashSet<>();
    private List<Word> mArrayWords = new ArrayList<Word>();
    private ArrayList<Integer> myArray = new ArrayList<>();

    public TesterPresenter(@NonNull Context context, @NonNull TesterView view) {
        mView = view;

    }

    public void dispatchCreate(@Nullable Bundle savedInstanceState) {
        if (savedInstanceState != null) {

        }
    }

    public void dispatchGenerateQuestion(HashSet<Integer> testerSet, ArrayList<Word> arrayWords) {
        mArrayWords.clear();
        mTesterSet.clear();
        mTesterSet.addAll(testerSet);
        mArrayWords.addAll(arrayWords);
        loadContent();
    }

    public void dispatchStart() {
        //do nothing
    }

    public void dispatchStop() {
        //do nothing
    }

    public void dispatchDestroy() {
        //do nothing
    }

    private void loadContent() {

        myArray.clear();
        myArray = RepositoryProvider.provideTesterRepository(mTesterSet, mArrayWords)
                .getQuestions();
        for (int i = 0; i < myArray.size(); i++) {
            Log.i("myArray = ", String.valueOf(myArray.get(i)));
        }

        handleResponse(myArray, mArrayWords);
    }

    private void handleResponse(ArrayList<Integer> myArray, List<Word> arrayWords) {
        mView.showAnswer(myArray, arrayWords);
    }

}
