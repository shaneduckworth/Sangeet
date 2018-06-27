package com.example.android.sangeet;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> arrayListSongs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, arrayListSongs);
    }

    //The below comes from:  https://github.com/udacity/ud839_CustomAdapter_Example/blob/master/app/src/main/java/com/example/android/flavor/AndroidFlavorAdapter.java
    //With modifications.  Per the license agreement, the original copyright and license notice is posted below.

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

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the song_item.xml layout with the ID title_text_view
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the song title from the current Song object and
        // set this text on the title TextView in the song_item.xml file
        titleTextView.setText(currentSong.getTitle());

        // Find the TextView in the song_item.xml layout with the ID artist_text_view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the song artist from the current Song object and
        // set this text on the artist TextView in the song_item.xml file
        artistTextView.setText(currentSong.getArtist());

        // Find the ImageView in the song_item.xml layout with the ID image_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.song_image_view);
        // Get the image resource ID from the current Song object and
        // set the image on the imageview in the song_item.xml file
        iconView.setImageResource(currentSong.getImage());

        // Find the TextView in the song_item.xml layout with the ID length_text_view
        TextView lengthTextView = (TextView) listItemView.findViewById(R.id.length_text_view);
        // Get the song length from the current Song object and
        // set this text on the length TextView in the song_item.xml file
        lengthTextView.setText(currentSong.getLength());

        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

