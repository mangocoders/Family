package com.example.android.family;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mySound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound=MediaPlayer.create(this,R.raw.got);

        mySound.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() {
            @Override
            public void onSeekComplete(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
                playSong=1;
            }
        });

    }
    protected void onDestroy()
    {
        if(mySound!=null &&mySound.isPlaying()) {
            mySound.stop();
            mySound.release();

        }
        super.onDestroy();
    }

        int playSong=1;
        public void playSound(View view) {
            try {
                if (playSong % 2 == 1) {
                    mySound.start();

                    playSong++;
                } else {
                    mySound.pause();
                    playSong++;
                }

            }
            catch (Exception e)
            {

            }
        }

    public void tywinLanister(View view) {
        ImageButton imageButton1 =(ImageButton) findViewById(R.id.tywinLanister);
        startActivity(new Intent(this, tywinLanisterActivity.class));
    }

    public  void joanaLanister(View view)
    {
        ImageButton imageButton2=(ImageButton) findViewById(R.id.joanaLanisterr);
        startActivity(new Intent(this,joanaLanisterActivity.class));

    }
    public  void jaimeLanister(View view)
    {
        ImageButton imageButton2=(ImageButton) findViewById(R.id.jaimeLanister);
        startActivity(new Intent(this,jaimeLanisterActivity.class));

    }
    public  void cerseiLanister(View view)
    {
        ImageButton imageButton2=(ImageButton) findViewById(R.id.cerseiLanister);
        startActivity(new Intent(this,cerseiLannisterActivity.class));

    }
    public void tyrionLanister(View view)
    {
        ImageButton imageButton3=(ImageButton) findViewById(R.id.tyrionLanister);
        startActivity(new Intent(this,tyrionLanisterActivity.class));
    }

}
