package com.aresix.tagplanet.MyActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aresix.tagplanet.R;

public class KidMainActivity extends AppCompatActivity {

    private Button mUpload,mTake,mPlanet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid_main);

        mUpload=findViewById(R.id.uploadPic);
        mTake=findViewById(R.id.takePhoto);
        mPlanet=findViewById(R.id.tagPlanet);

        mUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //上传照片
                //有单独界面
//                Intent intent = new Intent(KidMainActivity.this,TagActivity.class);
//                startActivity(intent);
            }
        });

        mTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //前往拍照界面
                // Intent intent = new Intent(KidMainActivity.this,KidTakePhotoActivity.class);
                // startActivity(intent);
            }
        });

        mPlanet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //去标签星球
                Intent intent = new Intent(KidMainActivity.this,TagActivity.class);
                startActivity(intent);
            }
        });
    }
}
