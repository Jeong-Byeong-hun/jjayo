package com.example.younghwa_song.jjayo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;

public class hskWordActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hsk_word);

        final DBHelper dbHelper = new DBHelper(getApplicationContext(), "TEST3.db", null, 1);
        TextView titleText = (TextView) findViewById(R.id.hsk_word_text);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기 버튼 생성
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_white); // 커스텀 뒤로가기
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        toolbar.findViewById(R.id.home_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



        titleText.setText(hskActivity.hskTitle);
        // 리사이클러뷰에 LinearLayoutManager 객체 지정.
        RecyclerView recyclerView = findViewById(R.id.recycle_hsk) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this)) ;

        // 리사이클러뷰에 recyclerviewAdapter 객체 지정.
        recyclerviewAdapter adapter = new recyclerviewAdapter(dbHelper.getHskWordData(hskActivity.hsk_Index)) ;
        recyclerView.setAdapter(adapter) ;
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
