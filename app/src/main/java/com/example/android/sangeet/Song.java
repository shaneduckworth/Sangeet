package com.example.android.sangeet;

public class Song {

    // String value - Song Title
    private String mValueTitle;

    // String value - Song Artist
    private String mValueArtist;

    // String value - Song Length
    private String mValueLength;

    // Integer resource value - Song Image
    private int mValueImage;

    /**
     * Constructs a new Song object with title, artist, length, and artwork
     */
    public Song(String title, String artist, String length, int image) {
        mValueTitle = title;
        mValueArtist = artist;
        mValueLength = length;
        mValueImage = image;
    }

    /**
     * Sets the string value in the TextView, if the user wishes to change it for some reason.
     *
     * @param title  is the Song Title
     * @param artist is the Song Artist
     * @param length is the song length
     * @param image  is the integer resource id for the image associated with the song
     */
    public void setText(String title, String artist, String length, int image) {
        mValueTitle = title;
        mValueArtist = artist;
        mValueLength = length;
        mValueImage = image;
    }

    /**
     * @return the song title.
     */
    public String getTitle() {
        return mValueTitle;
    }

    /**
     * @return the song artist.
     */
    public String getArtist() {
        return mValueArtist;
    }

    /**
     * @return the song title.
     */
    public String getLength() {
        return mValueLength;
    }

    /**
     * @return the song image.
     */
    public int getImage() {
        return mValueImage;
    }
}
