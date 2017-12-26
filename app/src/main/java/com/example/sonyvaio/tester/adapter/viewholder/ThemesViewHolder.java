package com.example.sonyvaio.tester.adapter.viewholder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.model.Word;

import java.util.ArrayList;

/**
 * Created by SonyVaio on 10.12.2017.
 */

public class ThemesViewHolder extends RecyclerView.ViewHolder {

    CardView cardViewThemes;
    public TextView nameTheme;
    public ImageView pictureTheme;

    public ThemesViewHolder(View itemThemesView) {
        super(itemThemesView);
        cardViewThemes = (CardView) itemThemesView.findViewById(R.id.cardViewThemes);
        nameTheme = (TextView) itemThemesView.findViewById(R.id.nameTheme);
        pictureTheme = (ImageView) itemThemesView.findViewById(R.id.pictureTheme);
    }

    public interface ThemeClickListener {
        void onThemeClick(@NonNull ArrayList<Word> word);
    }

    // Передаем сюда модель из адаптера
    public void bindView(@NonNull final ArrayList<Word> word, final ThemeClickListener mThemeClickListener, Context context) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mThemeClickListener != null) {
                    mThemeClickListener.onThemeClick(word);
                }
            }
        });
    }

}
