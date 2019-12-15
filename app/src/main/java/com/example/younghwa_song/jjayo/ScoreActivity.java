package com.example.younghwa_song.jjayo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    Intent intent1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_score);


        TextView scoreText = findViewById(R.id.scoreText);
        Button score_Button = findViewById(R.id.returnStage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기 버튼 생성
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_white); // 커스텀 뒤로가기
        getSupportActionBar().setDisplayShowTitleEnabled(false);


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

        toolbar.findViewById(R.id.home_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home: { //toolbar의 back키 눌렀을 때 동작
                finish();
                return true;
            }
            case R.id.bgOff :
                Intent musicIntent1 = new Intent(getApplicationContext(), MusicService.class);
                stopService(musicIntent1);
                break;
            case R.id.bgOn :

                Intent musicIntent = new Intent(getApplicationContext(), MusicService.class);
                startService(musicIntent);

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        startActivity(intent1);
    }

}
