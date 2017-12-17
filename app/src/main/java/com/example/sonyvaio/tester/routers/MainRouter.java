package com.example.sonyvaio.tester.routers;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;

import com.example.sonyvaio.tester.ArraysWords;
import com.example.sonyvaio.tester.TesterActivity;
import com.example.sonyvaio.tester.model.Word;

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
        mActivity.startActivity(new Intent(mActivity, TesterActivity.class));

    }
}
