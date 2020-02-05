package com.aresix.tagplanet.MyActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

import com.aresix.tagplanet.R;
import com.aresix.tagplanet.Util.CircleImageView;

public class TagResActivity extends AppCompatActivity {

    private ImageView mreturnBtn, mShow, mType;
    private ImageView mLeft, mRight;
    private ImageView mLarge;
    int clickNum = 0;
    int[] drawables = {R.drawable.testcat9, R.drawable.testcat8, R.drawable.testcat7, R.drawable.testcat6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_res);

        mLarge = findViewById(R.id.pic_show_large);
        mLarge.setVisibility(View.INVISIBLE);

        mType = findViewById(R.id.Pic);
        Resources res = getResources();
        Bitmap bmp = BitmapFactory.decodeResource(res, R.drawable.testpicturedemo);
        bmp = CircleImageView.work(bmp);
        mType.setImageBitmap(bmp);


        mreturnBtn = findViewById(R.id.return_Btn_res);
        mreturnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TagResActivity.this, PlanetCategoryActivity.class);
                startActivity(intent);
            }
        });

        mLeft = findViewById(R.id.left_arrow);
        mRight = findViewById(R.id.right_arrow);
        mShow = findViewById(R.id.pic_show_detail);
        res = getResources();
        bmp = BitmapFactory.decodeResource(res, drawables[clickNum]);
        bmp = CircleImageView.work(bmp);
        mShow.setImageBitmap(bmp);

        mRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNum++;
                clickNum %= drawables.length;
                Resources res = getResources();
                Bitmap bmp = BitmapFactory.decodeResource(res, drawables[clickNum]);
                bmp = CircleImageView.work(bmp);
                mShow.setImageBitmap(bmp);
            }
        });

        mLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNum--;
                clickNum = clickNum < 0 ? drawables.length - 1 : clickNum;
                clickNum %= drawables.length;
                Resources res = getResources();
                Bitmap bmp = BitmapFactory.decodeResource(res, drawables[clickNum]);
                Log.d("王一博", clickNum + "肖战");
                bmp = CircleImageView.work(bmp);
                mShow.setImageBitmap(bmp);
            }
        });

        mShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLarge.setImageResource(drawables[clickNum]);
                mLarge.setVisibility(View.VISIBLE);
            }
        });

        mLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLarge.setVisibility(View.INVISIBLE);
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            Intent intent = new Intent(TagResActivity.this, KidMainActivity.class);
            startActivity(intent);
            return true;
        }
        return false;
    }
}
