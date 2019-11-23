package com.example.younghwa_song.jjayo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    Intent intent1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TextView scoreText = findViewById(R.id.scoreText);
        Button score_Button = findViewById(R.id.returnStage);
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        if (score >= 70) {
            scoreText.setText(score + "점 입니다 ! \n"+MainActivity.index +" Stage Clear !");
            score_Button.setText("Stage Choose");
            intent1 = new Intent(getApplicationContext(),MainActivity.class);

        } else {
            scoreText.setText("다시 공부하세요 !");
            score_Button.setText("다시 공부하기");
            intent1 = new Intent(getApplicationContext(), WordStudyActivity.class);
        }


    }

    public void onClick(View view) {
        startActivity(intent1);
    }

}
