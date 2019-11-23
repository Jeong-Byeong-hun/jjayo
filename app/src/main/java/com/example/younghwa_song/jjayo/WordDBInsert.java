package com.example.younghwa_song.jjayo;

import android.content.Context;

public class WordDBInsert {
    private Context mContext = null;

    public WordDBInsert(Context context){
        this.mContext = context;
        mContext.getResources();
    }

    public void wordInsert(){
        final DBHelper dbHelper = new DBHelper(mContext, "TEST3.db", null, 1);

        dbHelper.insert("排", "열", "pái", 1, (int) R.drawable.pai);
        dbHelper.insert("座", "좌석", "zuò", 1, (int) R.drawable.zuo);
        dbHelper.insert("您", "당신, 2인칭 존칭", "nín", 1, (int) R.drawable.nin);
        dbHelper.insert("的", "~의", "de", 1, (int) R.drawable.de);
        dbHelper.insert("座位", "좌석", "zuò‧wèi", 1, (int) R.drawable.zuowei);
        dbHelper.insert("是", "~이다 = be동사", "shì", 1, R.drawable.shi);


    }

    public void hskWordInsert(){

        //스테이지 100개씩 끊어서
        final DBHelper dbHelper = new DBHelper(mContext, "TEST3.db", null, 1);

        dbHelper.hsk_insert("阿姨","이모, 아주머니","āyí",1);
        dbHelper.hsk_insert("啊","문장 끝에 쓰여 어기를 도움(감탄)","a",1);
        dbHelper.hsk_insert("矮","(키)작다, (높이)낮다","ǎi",1);

    }
}
