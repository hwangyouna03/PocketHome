package kr.hs.emirim.s2019s40.pockethome1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;


import java.util.ArrayList;

import kr.hs.emirim.s2019s40.pockethome1.contract.Information_contractActivity;


public class Information_word extends AppCompatActivity {
    //private FragmentPagerAdapter fragmentPagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_word);

        //viewpager setting
        /*ViewPager viewPager = findViewById(R.id.viewpager);
        ViewPager viewPager1 = findViewById(R.id.viewpager1);
        fragmentPagerAdapter = new ViewpagerAdapter(getSupportFragmentManager());

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager1.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager1);*/


        
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