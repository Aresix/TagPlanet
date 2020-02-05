package com.aresix.tagplanet.MyActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.aresix.tagplanet.Adapter.PlanetTypeAdapter;
import com.aresix.tagplanet.R;

public class PlanetCategoryActivity extends AppCompatActivity {

    private RecyclerView mRvGrid;
    private ImageView mIvReturn;
    private ImageView mIvPlayer;
    private ImageView mIvTagIcon;
    private MediaPlayer mPlayer;
    private AudioManager mManager;
    private boolean isPlay = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_category);

        //获取标签种类
        //1-植物 2-工具 3-动物 4-锤子 5-游戏 6-自定义
        Intent intent = getIntent();
        String tagType=null;
        if(intent!=null){
            tagType = intent.getStringExtra(TagActivity.TAG_TYPE);
//            Toast.makeText(PlanetCategoryActivity.this,tagType,Toast.LENGTH_LONG).show();
        }

        //设置标题图片
        mIvTagIcon=findViewById(R.id.tag_icon);
        setTitlePic(tagType);

        mManager = (AudioManager) getSystemService(Service.AUDIO_SERVICE);
        mPlayer = MediaPlayer.create(PlanetCategoryActivity.this, R.raw.wwx0test);
        mPlayer.setLooping(false);

        mIvReturn = findViewById(R.id.return_Btn2);
        mIvReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlanetCategoryActivity.this, TagActivity.class);
                startActivity(intent);
            }
        });

        mIvPlayer = findViewById(R.id.playIntro);
        mIvPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isPlay) mPlayer.start();
                else mPlayer.pause();

                isPlay = !isPlay;
            }
        });

        mRvGrid = findViewById(R.id.tag_list);
        mRvGrid.setLayoutManager(new GridLayoutManager(PlanetCategoryActivity.this, 2));
        mRvGrid.setAdapter(new PlanetTypeAdapter(PlanetCategoryActivity.this, new PlanetTypeAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                if (pos == 0) {
                    Intent intent = new Intent(PlanetCategoryActivity.this, TagResActivity.class);
                    startActivity(intent);
                } else
                    Toast.makeText(PlanetCategoryActivity.this, "图片" + pos + "\n羡羡！ お疲れ様です", Toast.LENGTH_LONG).show();
            }
        }));
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK && event.getRepeatCount()==0){
            Intent intent = new Intent(PlanetCategoryActivity.this, TagActivity.class);
            startActivity(intent);
            return true;
        }
        return false;
    }

    private void setTitlePic(String tag){
        switch (tag){
            case "1":
                mIvTagIcon.setImageResource(R.drawable.tag1);
                break;
            case "2":
                mIvTagIcon.setImageResource(R.drawable.tag2);
                break;
            case "3":
                mIvTagIcon.setImageResource(R.drawable.tag5);
                break;
            case "4":
                mIvTagIcon.setImageResource(R.drawable.tag4);
                break;
            case "5":
                mIvTagIcon.setImageResource(R.drawable.tag3);
                break;
            case "6":
                mIvTagIcon.setImageResource(R.drawable.tag6);
                break;
        }
    }
}
