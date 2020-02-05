package com.aresix.tagplanet.MyActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aresix.tagplanet.R;

public class MainLoginInActivity extends AppCompatActivity {

    private Button mBtnKid, mBtnTeacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login_in);

        mBtnKid = findViewById(R.id.toKids);
        mBtnTeacher = findViewById(R.id.toTeacher);

        mBtnKid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLoginInActivity.this, KidMainActivity.class);
                startActivity(intent);
            }
        });

        mBtnTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainLoginInActivity.this, TeacherMainActivity.class);
                startActivity(intent);
            }
        });
    }
}
