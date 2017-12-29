package com.example.sonyvaio.tester.repository.tester;

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

    private HashSet<Integer> mTesterSet;
    private List<Word> mArrayWords;

    public TesterRepository(HashSet<Integer> testerSet, List<Word> arrayWords) {
        mTesterSet = testerSet;
        mArrayWords = arrayWords;
    }

    public Integer[] getQuestions(){

        ArraysWords.fillHashSet(mTesterSet, mArrayWords.size());
        return mTesterSet.toArray(new Integer[mTesterSet.size()]);
    }

}
