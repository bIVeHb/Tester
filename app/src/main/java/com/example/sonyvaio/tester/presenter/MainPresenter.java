package com.example.sonyvaio.tester.presenter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.sonyvaio.tester.view.MainView;

/**
 * Created by SonyVaio on 11.12.2017.
 */

public class MainPresenter {

    @NonNull
    private final MainView mView;

    public MainPresenter(@NonNull Context context, @NonNull MainView view){
        mView = view;

    }

    public void dispatchCreate(@Nullable Bundle savedInstanceState){
        if (savedInstanceState != null){

        }
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
        handleResponse();
    }

    private void handleResponse(){
        mView.loadInfo();
    }


}
