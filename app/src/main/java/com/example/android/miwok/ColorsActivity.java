package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Red", "Weṭeṭṭi"));
        words.add(new Word("Green", "Chokokki"));
        words.add(new Word("Brown", "Takaakki"));
        words.add(new Word("Gray", "Topoppi"));
        words.add(new Word("Black", "Kululli"));
        words.add(new Word("White", "Kelelli"));
        words.add(new Word("Dusty Yellow", "Topiisә"));
        words.add(new Word("Mustard Yellow", "Chiwiiṭә"));

        WordAdopter itemsAdapter = new WordAdopter(this,R.layout.list_text_view, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}