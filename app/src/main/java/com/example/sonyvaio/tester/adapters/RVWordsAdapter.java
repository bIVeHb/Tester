package com.example.sonyvaio.tester.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.model.Word;

/**
 * Created by SonyVaio on 20.11.2017.
 */

public class RVWordsAdapter extends RecyclerView.Adapter<RVWordsAdapter.WordViewHolder> {

    public static class WordViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView word;
        TextView translatedWord;
        TextView transription;
        ImageView picture;

        WordViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardView);
            word = (TextView) itemView.findViewById(R.id.word);
            translatedWord = (TextView) itemView.findViewById(R.id.translatedWord);
            transription = (TextView) itemView.findViewById(R.id.transcription);
            picture = (ImageView) itemView.findViewById(R.id.picture);
        }
    }

    private Word[] words;

    public RVWordsAdapter(Word[] words) {
        this.words = words;
    }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemword, parent, false);
        WordViewHolder wordViewHolder = new WordViewHolder(v);
        return wordViewHolder;
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        holder.word.setText(words[position].getWord());
        holder.translatedWord.setText(words[position].getTranslatedWord());
        holder.transription.setText(words[position].getTranscription());
        holder.picture.setImageResource(words[position].getPicture());
    }

    @Override
    public int getItemCount() {
        return words.length;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
