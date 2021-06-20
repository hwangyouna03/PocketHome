package kr.hs.emirim.s2019s40.pockethome1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.database.FirebaseDatabase;

public class TestActivity<FirebaseDatabase> extends AppCompatActivity{
    private Button sendbt;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
}