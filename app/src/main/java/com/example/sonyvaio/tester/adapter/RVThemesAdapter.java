package com.example.sonyvaio.tester.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sonyvaio.tester.data.ArraysWords;
import com.example.sonyvaio.tester.R;
import com.example.sonyvaio.tester.model.Word;
import com.example.sonyvaio.tester.adapter.viewholder.ThemesViewHolder;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by SonyVaio on 04.12.2017.
 */

public class RVThemesAdapter extends RecyclerView.Adapter<ThemesViewHolder> {


    ArraysWords arraysWords = new ArraysWords();


    //private ArrayList<Word[]> themes;
    //private ArrayList<Map.Entry<String, ArrayList<Word>>> mThemes;
    private ArrayList<String> mThemes = new ArrayList<>();

    private Context mContext;

    @Nullable
    private ThemesViewHolder.ThemeClickListener mThemeClickListener;

    public RVThemesAdapter(ArrayList<String> themes) {
        mThemes.clear();
        this.mThemes = themes;
    }

    @Override
    public ThemesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemthemes, parent, false);
        ThemesViewHolder themesViewHolder = new ThemesViewHolder(v);
        return themesViewHolder;
    }

    @Override
    public void onBindViewHolder(ThemesViewHolder holder, int position) {
        //ArrayList<Word> array = mThemes.get(position).getValue();
        ArrayList<Word> array = getWordsByKey(mThemes.get(position));
        holder.nameTheme.setText(mThemes.get(position));
        holder.pictureTheme.setImageResource(array.get(ArraysWords.randomInt(array.size())).getPicture());
        //(ThemesViewHolder) holder.bindView(themes.get(position).getValue(), mThemeClickListener, mContext);
        holder.bindView(array, mThemeClickListener, mContext);
    }

    public void setThemeClickListener(@Nullable ThemesViewHolder.ThemeClickListener themeCLickListener) {
        mThemeClickListener = themeCLickListener;
    }

    @Override
    public int getItemCount() {
        return mThemes.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // По ключу находим значение
    public ArrayList<Word> getWordsByKey(String someKey) {
        for (Map.Entry<String, ArrayList<Word>> entry : ArraysWords.mThemesMap.entrySet()) {
            if (entry.getKey().equals(String.valueOf(someKey)))
                return entry.getValue();
        }
        return null;
    }
}


