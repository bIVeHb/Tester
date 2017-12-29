package com.example.sonyvaio.tester.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by SonyVaio on 09.11.2017.
 */

public class Word implements Parcelable{

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

    protected Word(Parcel in) {
        word = in.readString();
        translatedWord = in.readString();
        transcription = in.readString();
        picture = in.readInt();
    }

    public static final Creator<Word> CREATOR = new Creator<Word>() {
        @Override
        public Word createFromParcel(Parcel in) {
            return new Word(in);
        }

        @Override
        public Word[] newArray(int size) {
            return new Word[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(word);
        dest.writeString(translatedWord);
        dest.writeString(transcription);
        dest.writeInt(picture);
    }
}
