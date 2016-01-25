package com.example.caden.motivationbutton;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer motivationButtonMP = MediaPlayer.create(this, R.raw.motivationbutton);

        Button pressme = (Button) this.findViewById(R.id.pressme);

        pressme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                motivationButtonMP.start();

            }
        });
    }

}









