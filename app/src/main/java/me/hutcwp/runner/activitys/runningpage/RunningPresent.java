package me.hutcwp.runner.activitys.runningpage;

import android.app.Activity;

import me.hutcwp.runner.other.Impl.PlayMusicBySystem;
import me.hutcwp.runner.other.Impl.TakePhotoByScale;
import me.hutcwp.runner.other.clazz.Music;
import me.hutcwp.runner.other.clazz.Potho;
import me.hutcwp.runner.other.interfaces.IPlayMusic;
import me.hutcwp.runner.other.interfaces.ITakePhoto;


/**
 * Created by Adminis on 2017/3/29.
 */

public class RunningPresent implements RuningContract.Presenter {


    private IPlayMusic mIPlayMusic;
    private ITakePhoto mITakePhoto;

    private Potho mPhoto;
    private Music mMusic;

    private RuningContract.View view;

    private Activity activity;

    public RunningPresent(RuningContract.View view,Activity activity) {
        this.view = view;
        this.activity = activity;
        this.view.setPresenter(this);
        initData();

    }


    private void initData() {

        mPhoto = new Potho(activity);
        mMusic = new Music(activity);

        mIPlayMusic = new PlayMusicBySystem();
        mITakePhoto = new TakePhotoByScale();

        mMusic.setiPlayMusic(mIPlayMusic);
        mPhoto.setmITakePhoto(mITakePhoto);

    }



    @Override
    public void stopRunning() {


    }

    @Override
    public void starRunning() {

    }

    @Override
    public void pauseRunning() {

    }

    @Override
    public void playMusic() {

        mMusic.playMusic();
    }

    @Override
    public void takePhoto() {
        mPhoto.takePhoto();
    }

    @Override
    public void openAblum() {
        mPhoto.checkPhoto();
    }



}
