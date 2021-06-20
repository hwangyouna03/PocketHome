package kr.hs.emirim.s2019s40.pockethome1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import kr.hs.emirim.s2019s40.pockethome1.Map.Price1;
import kr.hs.emirim.s2019s40.pockethome1.Map.Price4;

public class MainMap2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_map2);

        //전월세 버튼 클릭 시
        ImageButton wjsdnjftp_button = (ImageButton)findViewById(R.id.wjsdnjftp_button);
        wjsdnjftp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, MainMap.class);
                startActivity(myintent1);

                finish();
            }
        });

        //매매 버튼 클릭 시
        ImageButton aoao_button = (ImageButton)findViewById(R.id.aoao_button);
        aoao_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.MainMap2.class);
                startActivity(myintent1);

                finish();
            }
        });

        //뉴스 버튼 클릭 시
        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, MainNews.class);
                startActivity(myintent1);

                finish();
            }
        });

        //지도 버튼 클릭 시
        ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, MainMap.class);
                startActivity(myintent1);

                finish();
            }
        });

        // 버튼 클릭 시
        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, Main.class);
                startActivity(myintent1);

                finish();
            }
        });

        // 게시판 버튼 클릭 시
        ImageButton imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Community.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, Price1.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text2 = (TextView) findViewById(R.id.text2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price2.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text4 = (TextView) findViewById(R.id.text4);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, Price4.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });


        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });


        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.MainMap2.this, com.example.myapplication.Price3.class);
                startActivity(myintent1);

                finish();
            }
        });





    }
}