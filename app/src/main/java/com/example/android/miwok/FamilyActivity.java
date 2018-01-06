package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father", "Epә"));
        words.add(new Word("Mother", "Eṭa"));
        words.add(new Word("Son", "Sngsi"));
        words.add(new Word("Daughter", "Tune"));
        words.add(new Word("Older Brother", "Taachi"));
        words.add(new Word("Younger Brother", "Chalitti"));
        words.add(new Word("Older Sister", "Teṭe"));
        words.add(new Word("Younger Sister", "Kolliti"));
        words.add(new Word("Grandmother", "Ama"));
        words.add(new Word("Grandfather", "Paapa"));

        WordAdopter itemsAdapter = new WordAdopter(this,R.layout.list_text_view, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}