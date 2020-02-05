package com.aresix.tagplanet.GlobalVariable;

public class PhotoUsrInfo {
    public static int kidID = 1;
    public static int photoNum = 0;


    public PhotoUsrInfo() {
        kidID=1;
        photoNum=0;
    }

    public PhotoUsrInfo(int id){
        kidID=id;
        photoNum=0;
    }

    public PhotoUsrInfo(int id,int num){
        kidID=id;
        photoNum=num;
    }

    public int getKidID() {
        return kidID;
    }

    public void setKidID(int kidID) {
        PhotoUsrInfo.kidID = kidID;
    }

    public int getPhotoNum() {
        return photoNum;
    }

    public void setPhotoNum(int photoNum) {
        PhotoUsrInfo.photoNum = photoNum;
    }
}
