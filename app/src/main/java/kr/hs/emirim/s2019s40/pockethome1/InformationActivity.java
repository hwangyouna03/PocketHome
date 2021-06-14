package kr.hs.emirim.s2019s40.pockethome1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import kr.hs.emirim.s2019s40.pockethome1.contract.Contract1;
import kr.hs.emirim.s2019s40.pockethome1.contract.Information_contractActivity;

public class InformationActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView w_result;
    private Spinner spinner2;
    private TextView w_result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        spinner = (Spinner)findViewById(R.id.spinner);
        w_result = (TextView)findViewById(R.id.w_result);

        spinner2 = (Spinner)findViewById(R.id.spinner2);
        w_result2 = (TextView)findViewById(R.id.w_result2);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    w_result.setText(parent.getItemAtPosition(position).toString() + ": 건축면적의 대지면적에 대한 비율");
                }else if(position == 1){
                    w_result.setText(parent.getItemAtPosition(position).toString() + ": 공동주택의 건축면적 중에서 불특정 다수인이 공동으로 사용하는 부분의 바닥 면적");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    w_result2.setText(parent.getItemAtPosition(position).toString() + ": 서울특별시 동북부에 위치한 노원구, 도봉구, 강북구를 지칭하는 말로\n" +
                            "서울에서 상대적으로 집값이 낮은 지역인 동북권을 예시로 생긴 신조어");
                }else if(position == 1){
                    w_result2.setText(parent.getItemAtPosition(position).toString() + ": 기업형 월세 주택 (new stay = 새로운 + 거주하다 = 신 거주 정책)");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}