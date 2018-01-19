package com.example.sonyvaio.tester.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.activity.WordsActivity;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.adapter.viewholder.WordViewHolder;

import java.util.ArrayList;

/**
 * Created by SonyVaio on 20.11.2017.
 */

public class RVWordsAdapter extends RecyclerView.Adapter<WordViewHolder> {

/*    public static class WordViewHolder extends RecyclerView.ViewHolder {

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
    }*/
    private Context mContext;
    private ArrayList<Word> mWords;

    public RVWordsAdapter(Context context, ArrayList<Word> words) {
        mContext = context;
        this.mWords = words;
    }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemword, parent, false);
        WordViewHolder wordViewHolder = new WordViewHolder(v);
        return wordViewHolder;
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        holder.word.setText(mWords.get(position).getWord());
        holder.translatedWord.setText(mWords.get(position).getTranslatedWord());
        holder.transription.setText(mWords.get(position).getTranscription());
        holder.picture.setImageResource(mWords.get(position).getPicture());
        holder.btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(mContext, mWords.get(position).getSound());
                mp.start();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mWords.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
