package com.example.sonyvaio.tester.view;

import com.example.sonyvaio.tester.model.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SonyVaio on 11.12.2017.
 */

public interface TesterView {
    void showAnswer(ArrayList<Integer> myArray, List<Word> arrayWords);
}
