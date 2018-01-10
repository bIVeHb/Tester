package com.example.sonyvaio.tester.repository;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.repository.tester.TesterRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by SonyVaio on 11.12.2017.
 */

public class RepositoryProvider {

    private static TesterRepository sTesterRepository;
    private static ArrayList<Word> mArrayWords;

    private RepositoryProvider() {
        //Not implemented
    }

    @NonNull
    public static TesterRepository provideTesterRepository(ArrayList<Word> arrayWords) {

        mArrayWords = arrayWords;
        Log.i(" Provider array = ", String.valueOf(mArrayWords.size()));

        //if (sTesterRepository == null) {
            sTesterRepository = new TesterRepository(mArrayWords);
        //}
        return sTesterRepository;
    }
}
