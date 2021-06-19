package kr.hs.emirim.s2019s40.pockethome1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Community extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        //뉴스버튼 눌렀을 시
        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.Community.this,NewsHome.class);
                startActivity(myintent1);
                finish();
            }
        });

        //정보버튼을 눌렀을 시
        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.Community.this,Information.class);
                startActivity(myintent1);
                finish();
            }
        });

        //지도버튼을 눌렀을 시
        ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.Community.this,MainMap.class);
                startActivity(myintent1);
                finish();
            }
        });

        //게시판버튼 눌렀을 시
        ImageButton imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(com.example.myapplication.Community.this, com.example.myapplication.Community.class);
                startActivity(myintent1);
                finish();
            }
        });

    }
}