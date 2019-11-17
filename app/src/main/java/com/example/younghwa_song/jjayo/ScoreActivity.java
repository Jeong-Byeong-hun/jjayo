package com.example.younghwa_song.jjayo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TextView scoreText = findViewById(R.id.scoreText);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score",0);
        scoreText.setText(score +"점 입니다 ! \n 합격!");


    }

    public void onClick(View view){
        Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent1);
    }

}
