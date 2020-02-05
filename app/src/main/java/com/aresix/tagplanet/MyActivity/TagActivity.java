package com.aresix.tagplanet.MyActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.aresix.tagplanet.R;

public class TagActivity extends AppCompatActivity {

    public static final String TAG_TYPE = "TagType";
    //private RecyclerView mRecyclerView;
    private Button mBtnReturn;
    private ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        mBtnReturn=findViewById(R.id.return_Btn1);
        mBtnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TagActivity.this,KidMainActivity.class);
                startActivity(intent);
            }
        });
//        btn[7]=findViewById(R.id.btn7);
//        btn[8]=findViewById(R.id.btn8);


        setListeners();

    }

    private void setListeners(){
        OnClick onClick=new OnClick();

        btn1.setOnClickListener(onClick);
        btn2.setOnClickListener(onClick);
        btn3.setOnClickListener(onClick);
        btn4.setOnClickListener(onClick);
        btn5.setOnClickListener(onClick);
        btn6.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(TagActivity.this, PlanetCategoryActivity.class);

            switch (view.getId()) {
                case R.id.btn1:
                    intent.putExtra(TAG_TYPE,"1");
                    break;
                case R.id.btn2:
                    intent.putExtra(TAG_TYPE,"2");
                    break;
                case R.id.btn3:
                    intent.putExtra(TAG_TYPE,"3");
                    break;
                case R.id.btn4:
                    intent.putExtra(TAG_TYPE,"4");
                    break;
                case R.id.btn5:
                    intent.putExtra(TAG_TYPE,"5");
                    break;
                case R.id.btn6:
                    intent.putExtra(TAG_TYPE,"6");
                    break;
//                case R.id.btn7:
//                case R.id.btn8:
            }

            startActivity(intent);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK && event.getRepeatCount()==0){
            Intent intent = new Intent(TagActivity.this, KidMainActivity.class);
            startActivity(intent);
            return true;
        }
        return false;
    }

}
