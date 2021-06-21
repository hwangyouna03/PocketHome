package kr.hs.emirim.s2019s40.pockethome1.Map2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import kr.hs.emirim.s2019s40.pockethome1.Information_word;
import kr.hs.emirim.s2019s40.pockethome1.MainActivity;
import kr.hs.emirim.s2019s40.pockethome1.MainMap;
import kr.hs.emirim.s2019s40.pockethome1.R;

public class Monthly23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monthly_23);

        //뉴스 버튼 클릭 시
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Monthly23.this, MainActivity.class);
                startActivity(myintent1);

                finish();
            }
        });

        //지도 버튼 클릭 시
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Monthly23.this, MainMap.class);
                startActivity(myintent1);

                finish();
            }
        });

        // 버튼 클릭 시
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Monthly23.this, Information_word.class);
                startActivity(myintent1);

                finish();
            }
        });

    }
}