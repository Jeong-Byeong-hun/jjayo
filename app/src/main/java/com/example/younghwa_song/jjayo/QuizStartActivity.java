package com.example.younghwa_song.jjayo;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizStartActivity extends AppCompatActivity {

    TextView stage;
    Button start_btn, study_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_start);

        start_btn = (Button) findViewById(R.id.start_btn);
        study_btn = (Button) findViewById(R.id.study_btn);

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoadingActivity.class);
                startActivity(intent);
                finish();
            }
        });

        study_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), WordStudyActivity.class);
                startActivity(intent2);
                finish();
            }
        });
    }
}