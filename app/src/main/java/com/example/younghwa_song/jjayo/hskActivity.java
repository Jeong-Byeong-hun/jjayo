package com.example.younghwa_song.jjayo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;

public class hskActivity extends AppCompatActivity {
    static int hsk_Index = 0;
    ArrayList<Button> hskButtons = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hsk);

        hskButtons.add((Button) findViewById(R.id.hsk_first));
        hskButtons.add((Button) findViewById(R.id.hsk_second));
        hskButtons.add((Button) findViewById(R.id.hsk_third));
        hskButtons.add((Button) findViewById(R.id.hsk_fourth));
        hskButtons.add((Button) findViewById(R.id.hsk_fifth));
        hskButtons.add((Button) findViewById(R.id.hsk_sixth));

        initializeButtons();


    }
    public void onClick(View v) {
        initializeButtons(); // 모든 버튼 초기화.

        Intent intent = new Intent(getApplicationContext(), hskWordActivity.class);
        switch (v.getId()) {
            case R.id.hsk_first:
                hsk_Index = 1;
                break;
            case R.id.hsk_second:
                hsk_Index = 2;
                break;
            case R.id.hsk_third:
                hsk_Index = 3;
                break;
            case R.id.hsk_fourth:
                hsk_Index = 4;
                break;
            case R.id.hsk_fifth:
                hsk_Index = 5;
                break;
            case R.id.hsk_sixth:
                hsk_Index = 6;
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
}
