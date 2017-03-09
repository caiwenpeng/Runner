package com.hut.cwp.runner.cwp.clazz;

import android.app.Activity;
import android.content.Intent;

import com.hut.cwp.runner.cwp.Impl.CheckPhotoBySystem;
import com.hut.cwp.runner.cwp.Impl.TakePhotoByScale;
import com.hut.cwp.runner.cwp.interfaces.ICheckPhoto;
import com.hut.cwp.runner.cwp.interfaces.ISavePhoto;
import com.hut.cwp.runner.cwp.interfaces.ITakePhoto;

/**
 * Created by Adminis on 2017/3/2.
 */

public class Potho {

    private Activity activity;


    ISavePhoto mISavePhoto = new SavePhoto();
    ITakePhoto mITakePhoto = new TakePhotoByScale();
    ICheckPhoto mICheckPhoto = new CheckPhotoBySystem();


    public Potho(Activity activity) {
        this.activity = activity;
    }

    /**
     * takePotho 拍照
     */


    public void takePhoto() {

        mITakePhoto.takePhoto(activity);

    }


    public void setmITakePhoto(ITakePhoto mITakePhoto) {

        this.mITakePhoto = mITakePhoto;
    }


    public void savePhoto(int requestCode, int resultCode, Intent data) {

        mISavePhoto.savePhoto(requestCode,resultCode,data);
    }

    /**
     * openPotho 查看照片
     */
    public void checkPhoto() {

        mICheckPhoto.checkPhoto(activity);

    }


}
