/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the numbers category
        TextView numbersView = (TextView) findViewById(R.id.numbers);

        //Set a click listener on that view
        numbersView.setOnClickListener(
                new OnClickListener() {
                    //The code in this is executed when the numbers category is clicked
                    public void onClick (View view) {
                        Intent numbersIntent = new Intent(MainActivity.this, NumberActivity.class);
                        startActivity(numbersIntent);
                    }
                });

        //Find the view that shows the family members category
        TextView familyMembersView = (TextView) findViewById(R.id.family);

        //Set a click listener on that family members view
        familyMembersView.setOnClickListener(
                new OnClickListener() {
                    //The code in this is executed when the family members category is clicked
                    @Override
                    public void onClick(View view) {
                        Intent familyMembersIntent = new Intent(MainActivity.this, FamilyActivity.class);
                        startActivity(familyMembersIntent);
                    }
                });


        //Find the view that shows the colors category
        TextView colorsView = (TextView) findViewById(R.id.colors);

        //Set a click listener on that colors view
        colorsView.setOnClickListener(
                new OnClickListener() {
                    //The code in this is executed when the colors category is clicked
                    @Override
                    public void onClick(View view) {
                        Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                        startActivity(colorsIntent);
                    }
                });

        //Find the view that shows the phrases category
        TextView phrasesView = (TextView) findViewById(R.id.phrases);

        phrasesView.setOnClickListener(
                new OnClickListener() {
                    //The code in this is executed when the phrases category is clicked
                    @Override
                    public void onClick(View view) {
                        Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                        startActivity(phrasesIntent);
                    }
                });



    }
}
