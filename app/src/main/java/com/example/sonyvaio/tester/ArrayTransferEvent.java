package com.example.sonyvaio.tester;

import com.example.sonyvaio.tester.model.Word;

import java.util.ArrayList;

/**
 * Created by SonyVaio on 25.12.2017.
 */

public class ArrayTransferEvent {

    private ArrayList<Word> mWords;


    public ArrayList<Word> getWords() {
        return mWords;
    }

    public void setWords(ArrayList<Word> words) {
        this.mWords = words;
    }
}
