package com.example.namthach.buttonclickcount;

import android.view.View;

/**
 * Created by namthach on 7/7/15.
 */
public class OurOnClickListener implements View.OnClickListener {
    MainActivity caller;
    private int count;

    public OurOnClickListener(MainActivity activity){
        this.caller = activity;
        this.count = 0;
    }

    public void onClick(View view){
        count++;
        caller.theTextView.setText("The button is clicked");
        String tempResult = Integer.toString(count);
        caller.theTextView.setText(tempResult);
    }
}
