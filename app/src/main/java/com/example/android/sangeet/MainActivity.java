package com.example.android.sangeet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize numbers array
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Ghar Se Nikalte Hi", "Armaan Malik", "4:42", R.drawable.apple));
        songs.add(new Song("Min Lengsel", "Filadelfia Kristiansand", "6:11", R.drawable.banana));
        songs.add(new Song("All This Time", "Britt Nicole", "3:23", R.drawable.bat));
        songs.add(new Song("Gold", "Britt Nicole", "2:58", R.drawable.bluetooth));
        songs.add(new Song("Ready or Not", "Britt Nicole", "3:00", R.drawable.camel));
        songs.add(new Song("Real Life", "Lincoln Brewster", "5:19", R.drawable.connect));
        songs.add(new Song("So Good", "Lincoln Brewster", "4:28", R.drawable.checked));
        songs.add(new Song("Live Like That", "Sidewalk Prophets", "3:55", R.drawable.cow));
        songs.add(new Song("Heart's On Fire", "Sidewalk Prophets", "3:39", R.drawable.elephant));
        songs.add(new Song("Dooset Daram", "Sirvan Khosravi", "4:37", R.drawable.fish));
        songs.add(new Song("Tere Mere", "Armaan Malik", "3:56", R.drawable.flamingo));

        SongAdapter playList = new SongAdapter(this, songs);
        ListView songList = (ListView) findViewById(R.id.list);
        songList.setAdapter(playList);
        songList.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String title = songs.get(position).getTitle();
                String artist = songs.get(position).getArtist();
                String length = songs.get(position).getLength();
                Intent playSong = new Intent(MainActivity.this, com.example.android.sangeet.CurrentSongActivity.class);
                playSong.putExtra("title", title);
                playSong.putExtra("artist", artist);
                playSong.putExtra("length", length);
                startActivity(playSong);
            }
        });
    }
}
