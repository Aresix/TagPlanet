package com.aresix.tagplanet.MyActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aresix.tagplanet.R;

public class TeacherMainActivity extends AppCompatActivity {

    private Button mClassRes,mMyClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_main);
        mClassRes=findViewById(R.id.courseRes);
        mMyClass=findViewById(R.id.MyClass);

        mClassRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherMainActivity.this,ResRecommendActivity.class);
                startActivity(intent);
            }
        });
        mMyClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(TeacherMainActivity.this,ClassMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
