package com.example.younghwa_song.jjayo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import android.view.WindowManager;


public class IntroActivity extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Boolean isFirst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);
        final DBHelper dbHelper = new DBHelper(getApplicationContext(), "TEST3.db", null, 1);

        final String PREFERENCE = getPackageName();

        pref = getSharedPreferences(PREFERENCE, MODE_PRIVATE);

        isFirst = pref.getBoolean("isFirst", true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (isFirst)  {
                    Log.d("안녕하세여", isFirst + "");
                    dbHelper.insert("排", "열", "pái", 1, (int) R.drawable.pai);
                    dbHelper.insert("座", "좌석", "zuò", 1, (int) R.drawable.zuo);
                    dbHelper.insert("您", "당신, 2인칭 존칭", "nín", 1, (int) R.drawable.nin);
                    dbHelper.insert("的", "~의", "de", 1, (int) R.drawable.de);
                    dbHelper.insert("座位", "좌석", "zuò‧wèi", 1, (int) R.drawable.zuowei);
                    dbHelper.insert("是", "~이다 = be동사", "shì", 1, R.drawable.shi);

                    editor = pref.edit();
                    editor.putBoolean("isFirst", false);
                    editor.commit();

                }
                SystemClock.sleep(2000);
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }).start();
    }


}
