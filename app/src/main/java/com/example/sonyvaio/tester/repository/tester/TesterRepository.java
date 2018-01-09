package com.example.sonyvaio.tester.repository.tester;

import android.util.Log;

import com.example.sonyvaio.tester.data.ArraysWords;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.repository.BaseRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by SonyVaio on 11.12.2017.
 */

public class TesterRepository extends BaseRepository{

    //private HashSet<Integer> mTesterSet = new HashSet<Integer>();
    private ArrayList<Word> mArrayWords = new ArrayList<Word>();

    public TesterRepository(ArrayList<Word> arrayWords) {
        mArrayWords.clear();
        mArrayWords.addAll(arrayWords);
        //mArrayWords = arrayWords;
    }

    public ArrayList<Integer> getQuestions(){

        Log.i(" TRepository array = ", String.valueOf(mArrayWords.size()));

        HashSet<Integer> testerSet = new HashSet<Integer>();
        ArraysWords.fillHashSet(testerSet, mArrayWords.size());
        return new ArrayList<Integer>(testerSet);
        //return mTesterSet.toArray(new Integer[mTesterSet.size()]);
    }

}
