package com.example.younghwa_song.jjayo;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.Formatter;


public class VideoPlayActivity extends AppCompatActivity {
//    TextView now_time;
//    SeekBar seekBar;
//    Button btn_full;
//    Button btn_play;
//    Button btn_forward;
//    Button btn_backward;
//    VideoView videoView;
//    int duration;
//    StringBuilder mFormatBuilder;
//    Formatter mFormatter;

//    MyMediaController controller;
//    MyControllerView controllerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_video_play);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기 버튼 생성
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_white); // 커스텀 뒤로가기
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        TextView video_text = (TextView) findViewById(R.id.video_text1);
        video_text.setText("Stage " + MainActivity.index + " 안내방송을 시작합니다.");

        Button video = (Button) findViewById(R.id.TV);

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YeKAQSbRR8A"));
                startActivity(intent);
            }
        });




        //path 설정
//        String videoPath = "android.resource://" + getPackageName() + "/raw/testmovie";

        //video
//        videoView = (VideoView) findViewById(R.id.TV);
//        videoView.setVideoPath(videoPath);
//        videoView.requestFocus();



//        controller = new MyMediaController(this);

//        controller.setAnchorView(videoView);



//        final MediaController mc = new MediaController(this);
//
//        videoView.setMediaController(mc);
//        videoView.setVideoPath(videoPath);
//        videoView.start();
//
//        videoView.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                mc.show(0);
//                videoView.pause();
//            }
//        }, 100);


//홈버튼
        toolbar.findViewById(R.id.home_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button next_btn = (Button) findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WordStudyActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    //툴바의 뒤로가기
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home: { //toolbar의 back키 눌렀을 때 동작
                finish();
                return true;
            }
            case R.id.bgOff:
                Intent musicIntent1 = new Intent(getApplicationContext(), MusicService.class);
                stopService(musicIntent1);
                break;
            case R.id.bgOn:

                Intent musicIntent = new Intent(getApplicationContext(), MusicService.class);
                startService(musicIntent);

                break;
        }
        return super.onOptionsItemSelected(item);
    }


    //커스텀 미디어컨트롤러

//    class MyMediaController extends MediaController {
//        Context context;
//
//        MyMediaController(Context context, boolean useFastForward) {
//            super(context, useFastForward);
//            this.context = context;
//        }
//
//        MyMediaController(Context context, AttributeSet attrs) {
//            super(context, attrs);
//            this.context = context;
//        }
//
//        MyMediaController(Context context) {
//            super(context);
//            this.context = context;
//        }
//
//
//        @Override
//        public void setAnchorView(View view) {
//            super.setAnchorView(view);
//            View anchor = view;
//
//            removeAllViews();
//
//            //view 셋팅
//            controllerView = new MyControllerView(getApplicationContext());
//
//            now_time = controllerView.now_time;
//            seekBar = controllerView.seekBar;
//            btn_full = controllerView.btn_full;
//            btn_play = controllerView.btn_play;
//            btn_forward = controllerView.btn_forward;
//            btn_backward = controllerView.btn_backward;
//
//            btn_full.setOnClickListener(new OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (controllerView.isFullScreen) {
//                        setOriginalScreen();
//                        controllerView.isFullScreen = false;
//                    } else {
//                        setFullScreen();
//                        controllerView.isFullScreen = true;
//                    }
//                }
//            });
//
//            btn_play.setOnClickListener(new OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (videoView.isPlaying()) {
//                        videoView.pause();
//                    } else {
//                        videoView.start();
//                    }
//                }
//            });
//
//            seekBar.setMax(1000);
//            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//                @Override
//                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//
//                    if (fromUser) {
//                        int where = (progress * duration / seekBar.getMax());
//
//                        videoView.seekTo(where);
//                        now_time.setText(stringForTime(where) + "/" + stringForTime(duration));
//                    }
//                }
//
//                @Override
//                public void onStartTrackingTouch(SeekBar seekBar) {
//
//                }
//
//                @Override
//                public void onStopTrackingTouch(SeekBar seekBar) {
//
//                }
//            });
//
//            Thread thread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        while (true) {
//                            Thread.sleep(100);
//
//                            if (videoView == null || now_time == null || seekBar == null)
//                                continue;
//
//                            setProgress();
//
//                        }
//                    } catch (Exception e) {
//                        Log.e("TAG HI", "ERROR", e);
//                    }
//                }
//            });
//            thread.start();
//
//
//            addView(controllerView);
//
//        }
//
//        @Override
//        public void hide() {
//            show();
//        }
//    }
//
//    public void setFullScreen() {
//        if (videoView == null)
//            return;
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        android.widget.LinearLayout.LayoutParams params = (android.widget.LinearLayout
//                .LayoutParams) videoView.getLayoutParams();
//        params.width = metrics.widthPixels;
//        params.height = metrics.heightPixels;
//        params.leftMargin = 0;
//        videoView.setLayoutParams(params);
//    }
//
//    public void setOriginalScreen() {
//        if (videoView == null)
//            return;
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        android.widget.LinearLayout.LayoutParams params = (android.widget.LinearLayout
//                .LayoutParams) videoView.getLayoutParams();
//        params.width = 300 * metrics.densityDpi; //원하는 사이즈
//        params.height = 300 * metrics.densityDpi; //원하는 사이즈
//        params.leftMargin = 30;
//        videoView.setLayoutParams(params);
//    }
//
//    public String stringForTime(int timeMs) {
//
//        int totalSeconds = timeMs / 1000;
//
//        int seconds = totalSeconds % 60;
//        int minutes = (totalSeconds / 60) % 60;
//        int hours   = totalSeconds / 3600;
//
//        mFormatBuilder.setLength(0);
//
//        if (hours > 0) {
//            return mFormatter.format("%d:%02d:%02d", hours, minutes, seconds).toString();
//        } else {
//            return mFormatter.format("%02d:%02d", minutes, seconds).toString();
//        }
//
//
//    }
//
//    public int setProgress() {
//        //if(videoView == null)
//        //  return 0;
//
//
//        int position = videoView.getCurrentPosition();
//
//        if (duration > 0) {
//            // use long to avoid overflow
//            long pos = 1000L * position / duration;
//            seekBar.setProgress((int) pos);
//        }
//
//        now_time.setText(stringForTime(position) + "/" + stringForTime(duration));
//
//        return position;
//    }

}
