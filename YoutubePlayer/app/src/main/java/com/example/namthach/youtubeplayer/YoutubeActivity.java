package com.example.namthach.youtubeplayer;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by namthach on 7/7/15.
 */
public class YoutubeActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    public static final String GOOGLE_API_KEY = "AIzaSyAJfVspCmDWgIX3clrAg5RNqwkEA09rulI";

    public static final String YOUTUBE_VIDEO_ID = "iP39Bqvrhiw";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube);
        YouTubePlayerView youTubePlayView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayView.initialize(GOOGLE_API_KEY, this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);

        if(!wasRestored){
            player.cueVideo(YOUTUBE_VIDEO_ID);
        }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult result) {
            Toast.makeText(this, "Cannot initialize Youtube player", Toast.LENGTH_LONG).show();
    }

    private PlaybackEventListener playbackEventListener = new PlaybackEventListener(){
        public void onBuffering(boolean arg0){

        }

        public void onPaused(){

        }

        public void onPlaying(){

        }

        public void onSeekTo(int arg0){

        }

        public void onStopped(){

        }
    };

    private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener(){
        public void onAdStarted(){

        }

        public void onError(YouTubePlayer.ErrorReason arg0){

        }

        public void onLoading(){

        }

        public void onLoaded(String arg0){

        }

        public void onVideoStarted(){

        }

        public void onVideoEnded(){

        }
    };
}