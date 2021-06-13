package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Community extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        //뉴스버튼 눌렀을 시
        ImageButton news_d = (ImageButton)findViewById(R.id.news_d)
        news_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Community.this,NewsHome.class);
                startActivity(myintent1);
                finish();
            }
        });

        //정보버튼을 눌렀을 시
        ImageButton information_d = (ImageButton)findViewById(R.id.information_d);
        information_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Community.this,NewsHome.class);
                startActivity(myintent1);
                finish();
            }
        });

        //지도버튼을 눌렀을 시
        ImageButton map_d = (ImageButton)findViewById(R.id.map_d);
        map_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Community.this,NewsHome.class);
                startActivity(myintent1);
                finish();
            }
        });

        //게시판버튼 눌렀을 시
        ImageButton community_d = (ImageButton)findViewById(R.id.community_d);
        community_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Community.this,NewsHome.class);
                startActivity(myintent1);
                finish();
            }
        });

    }
}