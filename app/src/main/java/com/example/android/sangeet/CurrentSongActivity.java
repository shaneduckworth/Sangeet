package com.example.android.sangeet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CurrentSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_song);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        // Help for the below provided by https://stackoverflow.com/questions/4233873/how-do-i-get-extra-data-from-intent-on-android
        // particularly from "Phi" in the post entitled "Add Up"
        String title;
        String artist;
        String length;
        Bundle bundle = getIntent().getExtras();
        title = bundle.getString("title");
        artist = bundle.getString("artist");
        length = bundle.getString("length");

        TextView titleView = (TextView) findViewById(R.id.title);
        TextView artistView = (TextView) findViewById(R.id.artist);
        TextView lengthView = (TextView) findViewById(R.id.length);
        titleView.setText(title);
        artistView.setText(artist);
        lengthView.setText(length);

    }


}
