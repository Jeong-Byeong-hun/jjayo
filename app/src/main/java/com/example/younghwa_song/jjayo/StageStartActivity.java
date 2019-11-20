package com.example.younghwa_song.jjayo;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class StageStartActivity extends AppCompatActivity {

    TextView stage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_stage_start);

        stage = findViewById(R.id.stage);

        stage.setText("Stage " + MainActivity.index);


        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(2000);
                startActivity(new Intent(getApplicationContext(), VideoPlayActivity.class));
                finish();
            }
        }).start();
    }
}
