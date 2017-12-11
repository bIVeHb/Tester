package com.example.sonyvaio.tester.repository.tester;

import com.example.sonyvaio.tester.ArraysWords;
import com.example.sonyvaio.tester.repository.BaseRepository;

import java.util.HashSet;

import static com.example.sonyvaio.tester.ArraysWords.actions;

/**
 * Created by SonyVaio on 11.12.2017.
 */

public class TesterRepository extends BaseRepository{

    private HashSet<Integer> mTesterSet;

    public TesterRepository(HashSet<Integer> testerSet) {
        mTesterSet = testerSet;

    }

    public Integer[] getQuestions(){

        ArraysWords.fillHashSet(mTesterSet, actions.length);
        return mTesterSet.toArray(new Integer[mTesterSet.size()]);
    }
}
