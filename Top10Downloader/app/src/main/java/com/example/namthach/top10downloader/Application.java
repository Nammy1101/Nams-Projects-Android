package com.example.namthach.top10downloader;

/**
 * Created by namthach on 7/7/15.
 */
public class Application {

    private String name;
    private String artists;
    private String releaseDate;

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public String toString(){
        return "Name: " + this.name + "\n" +
                "Artist: " + this.artists + "\n" +
                "Release Date: " + this.releaseDate + "\n";
    }

}
