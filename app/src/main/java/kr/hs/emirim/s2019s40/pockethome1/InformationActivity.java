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
                }else if(position == 2){
                    w_result.setText(parent.getItemAtPosition(position).toString() + ": 서울특별시 동북부에 위치한 노원구, 도봉구, 강북구를 지칭하는 말로 서울에서 상대적으로 집값이 낮은 지역인 동북권을 예시로 생긴 신조어");
                }else if(position == 3){
                    w_result.setText(parent.getItemAtPosition(position).toString() + ": 기업형 월세 주택 (new stay = 새로운 + 거주하다 = 신 거주 정책)");
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
                    w_result2.setText(parent.getItemAtPosition(position).toString() + ": 토지나 건물을 나누어 파는 것을 의미");
                }else if(position == 1){
                    w_result2.setText(parent.getItemAtPosition(position).toString() + ": 일정한 내용을 가진 계약을 완료하고 싶다고 의사 표시 하는 것. \n" +
                            "\t- 아파트 청약은 아파트를 분양하는 회사에 해당 아파트를 계약하고 싶다고 의사 표시 하는 것");
                }else if(position == 2){
                    w_result2.setText(parent.getItemAtPosition(position).toString() + ": 아파트 분양을 받기 위해 청약 할 수 있는 자격을 갖추기 위한 통장");
                }else if(position == 3){
                    w_result2.setText(parent.getItemAtPosition(position).toString() + ": 파트와 오피스텔 등 신규 주택에 대해 청약을 할 때, 신청할 수 있는 사이트로 금융결제원이 운영"+"\n"+
                            "(사전에 주택청약통장을 소유하고 있어야 청약을 신청할 수 있다.)");
                }else if(position == 4){
                    w_result2.setText(parent.getItemAtPosition(position).toString() + ": 기본 의미 보증 등 목적으로 맡겨두는 돈");
                }else if(position == 5){
                    w_result2.setText(parent.getItemAtPosition(position).toString()+ ": 1세대가 거주하는 1인 소유 주택");
                }else if(position == 6){
                    w_result2.setText(parent.getItemAtPosition(position).toString() +": 모두 다른 세대들이 각각 소유권이 다른 사람들이 모여서 사는 것. (4층 이하 건물일 때 해당)");
                }else if(position == 7){
                    w_result2.setText(parent.getItemAtPosition(position).toString() + ": 시프트(shift)라고도 하며 서울시와 SH공사가 주변 시세의 80% 이하로 무주택자가 최장년까지 살 수 있도록 마련한 전세주택(전세 기간: 최장 20년)");
                }else if(position == 8){
                    w_result2.setText(parent.getItemAtPosition(position).toString()+ ": 공공의 재정 및 국민주택기금의 재원을 받아 30년 이상 임대할 목적으로 건설 또는 매입되는 주택(일정 소득 수준 이하 무주택 가구주에게 저렴한 임대조건으로 공급)");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}