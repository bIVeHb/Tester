package com.example.sonyvaio.tester.repository;

import android.support.annotation.NonNull;

import com.example.sonyvaio.tester.repository.tester.TesterRepository;

import java.util.HashSet;

/**
 * Created by SonyVaio on 11.12.2017.
 */

public class RepositoryProvider {

    private static TesterRepository sTesterRepository;
    private static HashSet<Integer> mTesterSet;

    private RepositoryProvider() {
        //Not implemented
    }

    @NonNull
    public static TesterRepository provideTesterRepository(HashSet<Integer> testerSet) {

        mTesterSet = testerSet;

        if (sTesterRepository == null) {
            sTesterRepository = new TesterRepository(mTesterSet);
        }
        return sTesterRepository;
    }
}
