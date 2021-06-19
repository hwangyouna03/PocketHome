package kr.hs.emirim.s2019s40.pockethome1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_map);

        //전월세 버튼 클릭 시
        ImageButton wjsdnjftp_button = (ImageButton)findViewById(R.id.wjsdnjftp_button);
        wjsdnjftp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.MainMap.class);
                startActivity(myintent1);

                finish();
            }
        });

        //매매 버튼 클릭 시
        ImageButton aoao_button = (ImageButton)findViewById(R.id.aoao_button);
        aoao_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.MainMap2.class);
                startActivity(myintent1);

                finish();
            }
        });

        //뉴스 버튼 클릭 시
        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, MainNews.class);
                startActivity(myintent1);

                finish();
            }
        });

        //지도 버튼 클릭 시
        ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.MainMap.class);
                startActivity(myintent1);

                finish();
            }
        });

        // 버튼 클릭 시
        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, Main.class);
                startActivity(myintent1);

                finish();
            }
        });

        // 게시판 버튼 클릭 시
        ImageButton imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Community.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly1.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text2 = (TextView) findViewById(R.id.text2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly2.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text4 = (TextView) findViewById(R.id.text4);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly4.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text5 = (TextView) findViewById(R.id.text5);
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly5.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text6 = (TextView) findViewById(R.id.text6);
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly6.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text7 = (TextView) findViewById(R.id.text7);
        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly7.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text8 = (TextView) findViewById(R.id.text8);
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly8.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text9 = (TextView) findViewById(R.id.text9);
        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly9.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text10 = (TextView) findViewById(R.id.text10);
        text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly10.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text11 = (TextView) findViewById(R.id.text11);
        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly11.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text12 = (TextView) findViewById(R.id.text12);
        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly12.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text13 = (TextView) findViewById(R.id.text13);
        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly13.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text14 = (TextView) findViewById(R.id.text14);
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly14.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text15 = (TextView) findViewById(R.id.text15);
        text15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly15.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text16 = (TextView) findViewById(R.id.text16);
        text16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly16.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text17 = (TextView) findViewById(R.id.text17);
        text17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly17.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text18 = (TextView) findViewById(R.id.text18);
        text18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly18.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text19 = (TextView) findViewById(R.id.text19);
        text19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly19.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text20 = (TextView) findViewById(R.id.text20);
        text20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly20.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text21 = (TextView) findViewById(R.id.text21);
        text21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly21.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text22 = (TextView) findViewById(R.id.text22);
        text22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly22.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text23 = (TextView) findViewById(R.id.text23);
        text23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly23.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text24 = (TextView) findViewById(R.id.text24);
        text24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap.this, com.example.myapplication.Monthly24.class);
                startActivity(myintent1);

                finish();
            }
        });

    }
}