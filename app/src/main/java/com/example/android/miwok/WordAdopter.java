package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by janith on 05/03/17.
 */

public class WordAdopter extends ArrayAdapter <Word> {

    public  WordAdopter(Activity context, int list_text_view, ArrayList<Word> words) {
        super(context,0,words);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_text_view,parent,false);
        }


        Word currentWord = getItem(position);

        TextView defaultTransaltionView = (TextView) listItemView.findViewById(R.id.english_text_view);
        defaultTransaltionView.setText(currentWord.getDefaultTranslation());

        TextView miwokTranslationView = (TextView) listItemView.findViewById(R.id.miwork_text_view);
        miwokTranslationView.setText(currentWord.getMiwokTranslation());


        return listItemView;
    }
}
