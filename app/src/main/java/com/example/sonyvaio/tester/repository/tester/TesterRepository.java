package com.example.sonyvaio.tester.repository.tester;

import com.example.sonyvaio.tester.ArraysWords;
import com.example.sonyvaio.tester.TesterActivity;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.repository.BaseRepository;

import java.util.HashSet;

import static com.example.sonyvaio.tester.ArraysWords.actions;
import static com.example.sonyvaio.tester.ArraysWords.allArrays;

/**
 * Created by SonyVaio on 11.12.2017.
 */

public class TesterRepository extends BaseRepository{

    private HashSet<Integer> mTesterSet;
    private Word[] mArrayWords;

    public TesterRepository(HashSet<Integer> testerSet, Word[] arrayWords) {
        mTesterSet = testerSet;
        mArrayWords = arrayWords;
    }

    public Integer[] getQuestions(){

        ArraysWords.fillHashSet(mTesterSet, mArrayWords.length);
        return mTesterSet.toArray(new Integer[mTesterSet.size()]);
    }

    public Word[] getArrayWords()
    {
        return mArrayWords;
    }
}
