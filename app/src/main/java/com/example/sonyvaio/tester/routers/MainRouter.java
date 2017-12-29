package com.example.sonyvaio.tester.routers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;

import com.example.sonyvaio.tester.activity.TesterActivity;
import com.example.sonyvaio.tester.data.ArraysWords;
import com.example.sonyvaio.tester.model.Word;

import java.util.ArrayList;

/**
 * Created by SonyVaio on 17.12.2017.
 */

public class MainRouter {

    @NonNull
    private final FragmentActivity mActivity;

    public MainRouter(@NonNull FragmentActivity activity) {
        mActivity = activity;
        setup();
    }

    private void setup() {

    }

    public void showTesterActivity(){
        Intent i = new Intent(mActivity, TesterActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("words", new ArrayList<Word>(ArraysWords.arrays));
        i.putExtras(bundle);
        mActivity.startActivity(i);

    }
}
