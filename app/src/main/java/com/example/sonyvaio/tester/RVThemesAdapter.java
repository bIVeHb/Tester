package com.example.sonyvaio.tester;

import android.content.Intent;
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

    }

    //private ArrayList<Word[]> themes;
    private ArrayList<Map.Entry<String, Word[]>> themes;

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


