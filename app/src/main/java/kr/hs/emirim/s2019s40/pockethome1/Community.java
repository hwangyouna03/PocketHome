package kr.hs.emirim.s2019s40.pockethome1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;

public class Community extends AppCompatActivity {
    private static final String TAG = "Community";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);


        //전월세 버튼 클릭 시
        ImageButton wjsdnjftp_button = (ImageButton)findViewById(R.id.wjsdnjftp_button);
        wjsdnjftp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Community.this, MainMap.class);
                startActivity(myintent1);

                finish();
            }
        });

        //매매 버튼 클릭 시
        ImageButton aoao_button = (ImageButton)findViewById(R.id.aoao_button);
        aoao_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Community.this, MainMap2.class);
                startActivity(myintent1);

                finish();
            }
        });

        //뉴스 버튼 클릭 시
        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Community.this, MainNews.class);
                startActivity(myintent1);

                finish();
            }
        });

        //지도 버튼 클릭 시
        ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Community.this, MainMap.class);
                startActivity(myintent1);

                finish();
            }
        });

        // 버튼 클릭 시
        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent( Community.this, Main.class);
                startActivity(myintent1);

                finish();
            }
        });

        // 게시판 버튼 클릭 시
        ImageButton imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 = new Intent(Community.this, Community.class);
                startActivity(myintent1);

                finish();
            }
        });

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.post_button:
                    profileUpdate();
                    myStartActivity(MainActivity.class);
                    break;

            }
        }
    };

    private void uploader(PostInfo postInfo) {  // 파이어베이스 업로드
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("review").add(postInfo)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {  // 성공했을 경우, 회원 아이디 출력
                        Log.d(TAG, "DocumentSnapshot written with ID: " + documentReference.);
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) { // 실패했을 경우, 에러메세지 출력
                        Log.d(TAG, "Error adding document", e);
                    }
                });

    }
}