package com.example.younghwa_song.jjayo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;

public class hskActivity extends AppCompatActivity {
    static int hsk_Index = 0;
    static String hskTitle = null;
    ArrayList<Button> hskButtons = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hsk);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기 버튼 생성
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_white); // 커스텀 뒤로가기
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        hskButtons.add((Button) findViewById(R.id.hsk_first));
        hskButtons.add((Button) findViewById(R.id.hsk_second));
        hskButtons.add((Button) findViewById(R.id.hsk_third));
        hskButtons.add((Button) findViewById(R.id.hsk_fourth));
        hskButtons.add((Button) findViewById(R.id.hsk_fifth));
        hskButtons.add((Button) findViewById(R.id.hsk_sixth));

        initializeButtons();

        toolbar.findViewById(R.id.home_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
    public void onClick(View v) {
        initializeButtons(); // 모든 버튼 초기화.

        Intent intent = new Intent(getApplicationContext(), hskWordActivity.class);
        switch (v.getId()) {
            case R.id.hsk_first:
                hsk_Index = 1;
                hskTitle = "HSK 단어 1 ~ 100";
                break;
            case R.id.hsk_second:
                hsk_Index = 2;
                hskTitle = "HSK 단어 101 ~ 200";
                break;
            case R.id.hsk_third:
                hsk_Index = 3;
                hskTitle = "HSK 단어 201 ~ 300";
                break;
            case R.id.hsk_fourth:
                hsk_Index = 4;
                hskTitle = "HSK 단어 301 ~ 400";
                break;
            case R.id.hsk_fifth:
                hsk_Index = 5;
                hskTitle = "HSK 단어 401 ~ 500";
                break;
            case R.id.hsk_sixth:
                hsk_Index = 6;
                hskTitle = "HSK 단어 501 ~ 600";
                break;
        }
        activateButton(); // 버튼 활성화.
        startActivity(intent);
    }

    private void activateButton() {
        hskButtons.get(hsk_Index - 1).setBackgroundResource(R.drawable.airplane);
        hskButtons.get(hsk_Index - 1).setTextColor(Color.argb(0, 0, 0, 0));
    }

    private void initializeButtons() {
        for (Button button : hskButtons) {
            button.setBackgroundResource(R.drawable.cloud);
            button.setTextColor(Color.BLACK);
        }
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
}
