package com.example.atanu.listview_flag;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashScreen extends AppCompatActivity {
    MediaPlayer mp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mp = MediaPlayer.create(this,R.raw.free);
        mp.start();


        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();

                try {
                    sleep(3000);

                    Intent i = new Intent(splashScreen.this,MainActivity.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.release();
        finish();
    }
}
