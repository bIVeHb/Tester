package com.example.sonyvaio.tester.model;

import android.os.Parcelable;

/**
 * Created by SonyVaio on 09.11.2017.
 */

public class Word {

    private String word;
    private String translatedWord;
    private String transcription;
    private int picture;

    public Word(String word, String translatedWord, String transcription, int picture) {
        this.word = word;
        this.translatedWord = translatedWord;
        this.transcription = transcription;
        this.picture = picture;
    }

    public String getWord() {
        return word;
    }

    public String getTranslatedWord() {
        return translatedWord;
    }

    public String getTranscription() {
        return transcription;
    }

    public int getPicture() {
        return picture;
    }
}
