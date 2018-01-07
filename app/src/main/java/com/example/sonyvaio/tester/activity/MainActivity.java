package com.example.sonyvaio.tester.activity;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.sonyvaio.tester.ArrayTransferEvent;
import com.example.sonyvaio.tester.data.ArraysWords;
import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.presenter.MainPresenter;
import com.example.sonyvaio.tester.routers.MainRouter;
import com.example.sonyvaio.tester.view.MainView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;


public class MainActivity extends AppCompatActivity implements MainView{

    private MainPresenter presenter;
    private MainRouter mRouter;

    @OnClick(R.id.btnVocabulary)
    public void OnBtnVocabularyClick(){
        startActivity(VocabularyActivity.startIntent(this));
    }

    @OnClick(R.id.btnTester)
    public void OnBtnTesterClick(){
        mRouter.showTesterActivity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainPresenter(this, this);
        mRouter = new MainRouter(this);

    }

    @Override
    public void loadInfo() {
        Timber.i("LoadInfo");
        Log.i("TEST", "LoadInfo");
    }
}
