package kr.hs.emirim.s2019s40.pockethome1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.util.ArrayList;
import java.util.List;

import kr.hs.emirim.s2019s40.pockethome1.contract.Information_contractActivity;


public class Information_word extends AppCompatActivity {
   PagerAdapter pageradapter;
   ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_word);

        //TabLayout tabLayout = findViewById(R.id.tab_layout);
        //tabLayout.addTab((tabLayout.newTab().setText("one")));
        //tabLayout.addTab((tabLayout.newTab().setText("two")));

        List<Fragment> list = new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());

        pager = findViewById(R.id.pager);
        pageradapter = new SlidePagerAdapter(getSupportFragmentManager(),list);
        pager.setAdapter(pageradapter);

        
        //button -> 십계명
        Button btn11 = (Button)findViewById(R.id.button);
        btn11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),infromation_10.class);
                startActivity(intent);
            }
        });

        //button3 -> 계약 팁
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Information_contractActivity.class);
                startActivity(intent);
            }
        });
        //button3 -> 단어
        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InformationActivity.class);
                startActivity(intent);
            }
        });

    }
}