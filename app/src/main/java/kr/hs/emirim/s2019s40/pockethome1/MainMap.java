package kr.hs.emirim.s2019s40.pockethome1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly1;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly10;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly11;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly12;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly13;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly14;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly15;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly16;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly17;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly18;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly19;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly2;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly20;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly21;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly22;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly23;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly24;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly3;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly4;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly5;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly6;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly7;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly8;
import kr.hs.emirim.s2019s40.pockethome1.Map2.Monthly9;

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
                Intent myintent1 = new Intent(MainMap.this, MainMap.class);
                startActivity(myintent1);

                finish();
            }
        });

        //매매 버튼 클릭 시
        ImageButton aoao_button = (ImageButton)findViewById(R.id.aoao_button);
        aoao_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(MainMap.this, MainMap2.class);
                startActivity(myintent1);

                finish();
            }
        });

        //뉴스 버튼 클릭 시
        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(MainMap.this, MainActivity.class);
                startActivity(myintent1);

                finish();
            }
        });

        //지도 버튼 클릭 시
        ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(MainMap.this, MainMap.class);
                startActivity(myintent1);

                finish();
            }
        });

        // 버튼 클릭 시
        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Information_word.class);
                startActivity(myintent1);

                finish();
            }
        });


        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly1.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text2 = (TextView) findViewById(R.id.text2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly2.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this,  Monthly3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text4 = (TextView) findViewById(R.id.text4);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly4.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text5 = (TextView) findViewById(R.id.text5);
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly5.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text6 = (TextView) findViewById(R.id.text6);
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent (MainMap.this, Monthly6.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text7 = (TextView) findViewById(R.id.text7);
        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this,  Monthly7.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text8 = (TextView) findViewById(R.id.text8);
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly8.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text9 = (TextView) findViewById(R.id.text9);
        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly9.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text10 = (TextView) findViewById(R.id.text10);
        text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(MainMap.this, Monthly10.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text11 = (TextView) findViewById(R.id.text11);
        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly11.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text12 = (TextView) findViewById(R.id.text12);
        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(MainMap.this, Monthly12.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text13 = (TextView) findViewById(R.id.text13);
        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly13.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text14 = (TextView) findViewById(R.id.text14);
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly14.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text15 = (TextView) findViewById(R.id.text15);
        text15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly15.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text16 = (TextView) findViewById(R.id.text16);
        text16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly16.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text17 = (TextView) findViewById(R.id.text17);
        text17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly17.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text18 = (TextView) findViewById(R.id.text18);
        text18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly18.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text19 = (TextView) findViewById(R.id.text19);
        text19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(MainMap.this, Monthly19.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text20 = (TextView) findViewById(R.id.text20);
        text20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent (MainMap.this, Monthly20.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text21 = (TextView) findViewById(R.id.text21);
        text21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly21.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text22 = (TextView) findViewById(R.id.text22);
        text22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this, Monthly22.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text23 = (TextView) findViewById(R.id.text23);
        text23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( MainMap.this,  Monthly23.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text24 = (TextView) findViewById(R.id.text24);
        text24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(MainMap.this, Monthly24.class);
                startActivity(myintent1);

                finish();
            }
        });

    }
}