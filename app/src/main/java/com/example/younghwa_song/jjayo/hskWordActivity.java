package com.example.younghwa_song.jjayo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

        titleText.setText(hskActivity.hskTitle);
        // 리사이클러뷰에 LinearLayoutManager 객체 지정.
        RecyclerView recyclerView = findViewById(R.id.recycle_hsk) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this)) ;

        // 리사이클러뷰에 recyclerviewAdapter 객체 지정.
        recyclerviewAdapter adapter = new recyclerviewAdapter(dbHelper.getHskWordData(hskActivity.hsk_Index)) ;
        recyclerView.setAdapter(adapter) ;
    }
}
