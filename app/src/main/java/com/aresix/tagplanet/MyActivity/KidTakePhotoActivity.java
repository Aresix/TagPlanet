package com.aresix.tagplanet.MyActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.aresix.tagplanet.GlobalVariable.PhotoUsrInfo;
import com.aresix.tagplanet.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class KidTakePhotoActivity extends AppCompatActivity {

    public static final int TAKE_PHOTO=1;
    //请求码
    private ImageView picture;
    private Uri imageUri;

    private PhotoUsrInfo usr1 = new PhotoUsrInfo(1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid_take_photo);

        Button takephoto=findViewById(R.id.takePhotoBtn);
        picture=findViewById(R.id.photoPic);
        takephoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int photoID=usr1.getPhotoNum();
                File outputImage=new File(getExternalCacheDir(),"AR_Photo"+ photoID +".jpg");
                usr1.setPhotoNum(photoID+1);

                try//判断图片是否存在，存在则删除在创建，不存在则直接创建
                {
                    if(outputImage.exists())
                        outputImage.delete();
                    outputImage.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if(Build.VERSION.SDK_INT>=24){
                    imageUri= FileProvider.getUriForFile(KidTakePhotoActivity.this,
                            "com.aresix.tagplanet.Activity.fileprovider",outputImage);
                }else{
                    imageUri=Uri.fromFile(outputImage);
                }

                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra(MediaStore.EXTRA_OUTPUT,imageUri);
                startActivityForResult(intent,TAKE_PHOTO);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        switch (requestCode){
            case TAKE_PHOTO:
                if(resultCode==RESULT_OK && data!=null){
                    try{
                        Bitmap bitmap= BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri));
                        picture.setImageBitmap(bitmap);
                    }catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                }
                break;
            default:
                break;
        }
    }
}
