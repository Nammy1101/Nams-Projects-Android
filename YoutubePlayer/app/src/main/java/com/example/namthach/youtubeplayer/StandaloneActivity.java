package com.example.namthach.youtubeplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by namthach on 7/7/15.
 */

public class StandaloneActivity extends Activity implements View.OnClickListener {

    public static final String GOOGLE_API_KEY = "AIzaSyAJfVspCmDWgIX3clrAg5RNqwkEA09rulI";

    public static final String YOUTUBE_VIDEO_ID = "iP39Bqvrhiw";
    public static final String YOUTUBE_PLAYLIST_ID = "";

    private Button btnPlay;
    private Button btnPlaylist;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standalone);

        btnPlay = (Button) findViewById(R.id.btnStart);
        btnPlaylist = (Button) findViewById(R.id.btnPlaylist);

        btnPlay.setOnClickListener(this);
        btnPlaylist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if(v == btnPlay){
            //play a single video
            intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_VIDEO_ID);
        }else if (v == btnPlaylist){
            //play the playlist
            intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_ID);
        }

        if(intent != null){
            startActivityForResult(intent, 0);
        }
    }
}

