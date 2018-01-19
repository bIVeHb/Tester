package com.example.sonyvaio.tester.adapter.viewholder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sonyvaio.tester.R;

/**
 * Created by SonyVaio on 10.12.2017.
 */
public class WordViewHolder extends RecyclerView.ViewHolder {

    CardView cardView;
    public TextView word;
    public TextView translatedWord;
    public TextView transription;
    public ImageView picture;
    public ImageButton btnSound;

    public WordViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.cardView);
        word = (TextView) itemView.findViewById(R.id.word);
        translatedWord = (TextView) itemView.findViewById(R.id.translatedWord);
        transription = (TextView) itemView.findViewById(R.id.transcription);
        picture = (ImageView) itemView.findViewById(R.id.picture);
        btnSound = (ImageButton) itemView.findViewById(R.id.btnPlay);
    }
}
