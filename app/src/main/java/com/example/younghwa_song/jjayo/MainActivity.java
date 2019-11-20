package com.example.younghwa_song.jjayo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static  int index;
    ArrayList<Button> buttons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Intent musicIntent = new Intent(getApplicationContext(), MusicService.class);
        startService(musicIntent);

        buttons.add((Button) findViewById(R.id.Stage1));
        buttons.add((Button) findViewById(R.id.Stage2));
        buttons.add((Button) findViewById(R.id.Stage3));
        buttons.add((Button) findViewById(R.id.Stage4));
        buttons.add((Button) findViewById(R.id.Stage5));
        buttons.add((Button) findViewById(R.id.Stage6));
        buttons.add((Button) findViewById(R.id.Stage7));
        buttons.add((Button) findViewById(R.id.Stage8));
        buttons.add((Button) findViewById(R.id.Stage9));
        buttons.add((Button) findViewById(R.id.Stage10));
        buttons.add((Button) findViewById(R.id.Stage11));
        buttons.add((Button) findViewById(R.id.Stage12));


        initializeButtons();

       Button hskButton = (Button) findViewById(R.id.hsk);

       hskButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              Intent hskIntent = new Intent(getApplicationContext(), hskActivity.class);
              startActivity(hskIntent);
           }
       });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    //툴바의 뒤로가기
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

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


    public void onClick(View v) {
        initializeButtons(); // 모든 버튼 초기화.

        Intent intent = new Intent(getApplicationContext(), StageStartActivity.class);
        switch (v.getId()) {
            case R.id.Stage1:
                index = 1; // 인덱스 번호는 이렇게 관리하면 안 되고, 앱 실행 시 진행한 스테이지 중 가장 높은 스테이지 번호를 인덱스 번호로 함.
                break;
            case R.id.Stage2:
                index = 2;
                break;
            case R.id.Stage3:
                index = 3;
                break;
            case R.id.Stage4:
                index = 4;
                break;
            case R.id.Stage5:
                index = 5;
                break;
            case R.id.Stage6:
                index = 6;
                break;
            case R.id.Stage7:
                index = 7;
                break;
            case R.id.Stage8:
                index = 8;
                break;
            case R.id.Stage9:
                index = 9;
                break;
            case R.id.Stage10:
                index = 10;
                break;
            case R.id.Stage11:
                index = 11;
                break;
            case R.id.Stage12:
                index = 12;
                break;
        }
        activateButton(); // 버튼 활성화.
        startActivity(intent);
    }

    private void activateButton() {
        buttons.get(index - 1).setBackgroundResource(R.drawable.airplane);
        buttons.get(index - 1).setTextColor(Color.argb(0, 0, 0, 0));
    }

    private void initializeButtons() {
        for (Button button : buttons) {
            button.setBackgroundResource(R.drawable.cloud);
            button.setTextColor(Color.BLACK);
        }
    }
}
