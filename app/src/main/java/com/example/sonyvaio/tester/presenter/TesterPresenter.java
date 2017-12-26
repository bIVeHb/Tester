package com.example.sonyvaio.tester.presenter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.repository.RepositoryProvider;
import com.example.sonyvaio.tester.view.TesterView;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by SonyVaio on 11.12.2017.
 */

public class TesterPresenter {

    @NonNull
    private final TesterView mView;
    private HashSet<Integer> mTesterSet;
    private ArrayList<Word> mArrayWords;

    public TesterPresenter(@NonNull Context context, @NonNull TesterView view){
        mView = view;

    }

    public void dispatchCreate(@Nullable Bundle savedInstanceState){
        if (savedInstanceState != null){

        }
    }

    public void dispatchGenerateQuestion(HashSet<Integer> testerSet, ArrayList<Word> arrayWords) {
        mTesterSet = testerSet;
        mArrayWords = arrayWords;
        loadContent();
    }

    public void dispatchStart() {
        //do noting
    }

    public void dispatchStop() {
        //do noting
    }

    public void dispatchDestroy() {
        //do noting
    }

    private void loadContent(){

        Integer[] myArray = RepositoryProvider.provideTesterRepository(mTesterSet, mArrayWords)
                .getQuestions();

        handleResponse(myArray, mArrayWords);
    }

    private void handleResponse(Integer[] myArray, ArrayList<Word> arrayWords){
        mView.showAnswer(myArray, arrayWords);
    }

}
