package com.example.deepak.tyroapp;

public class   MusicGetterSetter {

    private String Title;
    private int Thumbnail;

    public MusicGetterSetter() {
    }

    public MusicGetterSetter(String title, int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }


    //Getter

    public String getTitle() {
        return Title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    //Setter

    public void setTitle(String title) {
        Title = title;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
