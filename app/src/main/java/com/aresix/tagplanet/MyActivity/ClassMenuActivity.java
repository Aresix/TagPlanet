package com.aresix.tagplanet.MyActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.aresix.tagplanet.R;

public class ClassMenuActivity extends AppCompatActivity {

    private Button mKidPlanet;//mReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_menu);

        mKidPlanet = findViewById(R.id.kidPlanet);
        mKidPlanet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassMenuActivity.this, KidListActivity.class);
                startActivity(intent);
            }
        });
/*
        mReturn=findViewById(R.id.return_Btn_ClassMenu);
        mReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassMenuActivity.this, MainLoginInActivity.class);
                startActivity(intent);
            }
        }); */
    }
/*
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK && event.getRepeatCount()==0){
            Intent intent = new Intent(ClassMenuActivity.this, MainLoginInActivity.class);
            startActivity(intent);
            return true;
        }
        return false;
    }*/
}