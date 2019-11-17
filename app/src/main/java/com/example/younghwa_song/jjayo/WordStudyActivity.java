package com.example.younghwa_song.jjayo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import me.relex.circleindicator.CircleIndicator;

public class WordStudyActivity extends AppCompatActivity {

    FragmentStatePagerAdapter fragmentStatePagerAdapter;
    static  ImageView word;
    TextView word_page_num;
    private int NUM_ITEMS = 6;
    Button next_btn;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_study);

        final DBHelper dbHelper = new DBHelper(getApplicationContext(), "TEST3.db", null, 1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기 버튼 생성
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_white); // 커스텀 뒤로가기
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        next_btn = (Button) findViewById(R.id.next_btn);
        word_page_num = (TextView) findViewById(R.id.word_page_num);
        word_page_num.setText(1 + " / " + NUM_ITEMS);

//홈버튼
        toolbar.findViewById(R.id.home_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        LinearLayout drawLayout = (LinearLayout) findViewById(R.id.draw_layout);
        final MyView m = new MyView(this);
        drawLayout.addView(m);

        fragmentStatePagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        ViewPager vPager = (ViewPager) findViewById(R.id.vpPager);
        vPager.setAdapter(fragmentStatePagerAdapter);


        //전체 지우기
        Button clear_Drawlayout = (Button) findViewById(R.id.clear_btn);
        clear_Drawlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m.points.clear();
                m.invalidate();
            }
        });


        //next 버튼
        final Button next_btn = (Button) findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuizStartActivity.class);
                startActivity(intent);
            }
        });



        //gif 설정하는 부분
        word = (ImageView) findViewById(R.id.word_gif);

        GlideDrawableImageViewTarget gifImage = new GlideDrawableImageViewTarget(word);
        Glide.with(this).load(R.drawable.pai).into(gifImage);

        vPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                GlideDrawableImageViewTarget gif = new GlideDrawableImageViewTarget(word);
                switch (i){
                    case 0 :
                        Glide.with(getApplicationContext()).load(dbHelper.getImageRoute(MainActivity.index,0)).into(gif);
                        ChangeNextButton(i);
                        ChangeWordPage(i);
                        break;
                    case 1 :
                        Glide.with(getApplicationContext()).load(dbHelper.getImageRoute(MainActivity.index,1)).into(gif);
                        ChangeNextButton(i);
                        ChangeWordPage(i);
                        break;
                    case 2 :
                        Glide.with(getApplicationContext()).load(dbHelper.getImageRoute(MainActivity.index,2)).into(gif);
                        ChangeNextButton(i);
                        ChangeWordPage(i);
                        break;
                    case 3 :
                        Glide.with(getApplicationContext()).load(dbHelper.getImageRoute(MainActivity.index,3)).into(gif);
                        ChangeNextButton(i);
                        ChangeWordPage(i);
                        break;
                    case 4 :
                        Glide.with(getApplicationContext()).load(dbHelper.getImageRoute(MainActivity.index,4)).into(gif);
                        ChangeNextButton(i);
                        ChangeWordPage(i);
                        break;
                    case 5 :
                        Glide.with(getApplicationContext()).load(dbHelper.getImageRoute(MainActivity.index,5)).into(gif);
                        ChangeNextButton(i);
                        ChangeWordPage(i);
                        break;
                    case 6 :
                        Glide.with(getApplicationContext()).load(dbHelper.getImageRoute(MainActivity.index,6)).into(gif);
                        ChangeNextButton(i);
                        ChangeWordPage(i);
                        break;
                    case 7 :
                        Glide.with(getApplicationContext()).load(dbHelper.getImageRoute(MainActivity.index,7)).into(gif);
                        ChangeNextButton(i);
                        ChangeWordPage(i);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


    }
    public void ChangeNextButton(int number){
        if(NUM_ITEMS <= number + 1) {
            next_btn.setVisibility(View.VISIBLE);
        }
        else {
            next_btn.setVisibility(View.INVISIBLE);
        }
    }

    public void ChangeWordPage(int number){
        word_page_num.setText(number + 1 + " / " + NUM_ITEMS);
    }


    public class MyPagerAdapter extends FragmentStatePagerAdapter {

        final DBHelper dbHelper = new DBHelper(getApplicationContext(), "TEST3.db", null, 1);

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        public Fragment getItem(int position) {
            Bundle bundle = new Bundle(6); // 액티비티와 프래그먼트 간 데이터를 주고 받기 위함
            WordFragment wf = new WordFragment();

            switch (position) {
                case 0:
                    bundle.putString("word", dbHelper.getCharacter(MainActivity.index,0));
                    bundle.putString("speak", dbHelper.getPronunciation(MainActivity.index,0) + "  ");
                    bundle.putString("mean", dbHelper.getMeaning(MainActivity.index,0)+ "   ");
                    wf.setArguments(bundle);
                    return wf;
                case 1:
                    bundle.putString("word", dbHelper.getCharacter(MainActivity.index,1));
                    bundle.putString("speak", dbHelper.getPronunciation(MainActivity.index,1) + "  ");
                    bundle.putString("mean", dbHelper.getMeaning(MainActivity.index,1)+ "   ");
                    wf.setArguments(bundle);
                    return wf;
                case 2:
                    bundle.putString("word", dbHelper.getCharacter(MainActivity.index,2));
                    bundle.putString("speak", dbHelper.getPronunciation(MainActivity.index,2) + "  ");
                    bundle.putString("mean", dbHelper.getMeaning(MainActivity.index,2)+ "   ");
                    wf.setArguments(bundle);
                    return wf;
                case 3 :
                    bundle.putString("word", dbHelper.getCharacter(MainActivity.index,3));
                    bundle.putString("speak", dbHelper.getPronunciation(MainActivity.index,3) + "  ");
                    bundle.putString("mean", dbHelper.getMeaning(MainActivity.index,3)+ "   ");
                    wf.setArguments(bundle);
                    return wf;
                case 4 :
                    bundle.putString("word", dbHelper.getCharacter(MainActivity.index,4));
                    bundle.putString("speak", dbHelper.getPronunciation(MainActivity.index,4) + "  ");
                    bundle.putString("mean", dbHelper.getMeaning(MainActivity.index,4)+ "   ");
                    wf.setArguments(bundle);
                    return wf;
                case 5 :
                    bundle.putString("word", dbHelper.getCharacter(MainActivity.index,5));
                    bundle.putString("speak", dbHelper.getPronunciation(MainActivity.index,5) + "  ");
                    bundle.putString("mean", dbHelper.getMeaning(MainActivity.index,5)+ "   ");
                    wf.setArguments(bundle);
                    return wf;
                case 6 :
                    bundle.putString("word", dbHelper.getCharacter(MainActivity.index,6));
                    bundle.putString("speak", dbHelper.getPronunciation(MainActivity.index,6) + "  ");
                    bundle.putString("mean", dbHelper.getMeaning(MainActivity.index,6)+ "   ");
                    wf.setArguments(bundle);
                    return wf;
                case 7 :
                    bundle.putString("word", dbHelper.getCharacter(MainActivity.index,7));
                    bundle.putString("speak", dbHelper.getPronunciation(MainActivity.index,7) + "  ");
                    bundle.putString("mean", dbHelper.getMeaning(MainActivity.index,7)+ "   ");
                    wf.setArguments(bundle);
                    return wf;
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator 없어도 됨
        @Override
        public CharSequence getPageTitle(int position) {

            return position + "";
        }

    }



}