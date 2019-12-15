package com.example.younghwa_song.jjayo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MyControllerView extends LinearLayout {
    Context context;
    Button btn_full,btn_play,btn_forward,btn_backward;
    SeekBar seekBar;
    TextView now_time;

    boolean isFullScreen = false;

    MyControllerView(Context context){
        super(context);
        this.context = context;
        init();
    }

    MyControllerView(Context context, AttributeSet attrs){
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_mediacontroller,this,true);

        btn_full = view.findViewById(R.id.full_btn);
        btn_play = view.findViewById(R.id.play_btn);
        btn_forward = view.findViewById(R.id.forward_btn);
        btn_backward = view.findViewById(R.id.backward_btn);
        seekBar = view.findViewById(R.id.play_seek);
        now_time = view.findViewById(R.id.now_time);

    }




}
