package com.example.sonyvaio.tester;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sonyvaio.tester.model.Word;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SonyVaio on 04.12.2017.
 */

public class RVThemesAdapter extends RecyclerView.Adapter<RVThemesAdapter.ThemesViewHolder> {


    public static class ThemesViewHolder extends RecyclerView.ViewHolder {
        CardView cardViewThemes;
        TextView nameTheme;
        ImageView pictureTheme;

        ThemesViewHolder(View itemThemesView) {
            super(itemThemesView);
            cardViewThemes = (CardView) itemThemesView.findViewById(R.id.cardViewThemes);
            nameTheme = (TextView) itemThemesView.findViewById(R.id.nameTheme);
            pictureTheme = (ImageView) itemThemesView.findViewById(R.id.pictureTheme);
        }

        public interface ThemeClickListener {
            void onThemeClick(@NonNull Word[] word);
        }

        // Передаем сюда модель из адаптера
        public void bindView(@NonNull final Word[] word, final ThemeClickListener mThemeClickListener, Context context) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mThemeClickListener != null){
                        mThemeClickListener.onThemeClick(word);
                    }
                }
            });
        }

    }

    //private ArrayList<Word[]> themes;
    private ArrayList<Map.Entry<String, Word[]>> themes;

    private Context mContext;

    @Nullable
    private ThemesViewHolder.ThemeClickListener mThemeClickListener;

    public RVThemesAdapter(ArrayList<Map.Entry<String, Word[]>> themes) {
        this.themes = themes;
    }

    @Override
    public ThemesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemthemes, parent, false);
        ThemesViewHolder themesViewHolder = new ThemesViewHolder(v);
        return themesViewHolder;
    }

    @Override
    public void onBindViewHolder(ThemesViewHolder holder, int position) {
        Word[] array = themes.get(position).getValue();
        holder.nameTheme.setText(themes.get(position).getKey());
        holder.pictureTheme.setImageResource(array[ArraysWords.randomInt(array.length)].getPicture());
        //(ThemesViewHolder) holder.bindView(themes.get(position).getValue(), mThemeClickListener, mContext);
        holder.bindView(array, mThemeClickListener, mContext);
    }

    public void setThemeClickListener(@Nullable ThemesViewHolder.ThemeClickListener themeCLickListener) {
        mThemeClickListener = themeCLickListener;
    }

    @Override
    public int getItemCount() {
        return themes.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}


