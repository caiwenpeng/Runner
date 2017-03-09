package com.hut.cwp.runner.cwp.clazz;

import android.app.Activity;

import com.hut.cwp.runner.cwp.Impl.PlayMusicBySystem;
import com.hut.cwp.runner.cwp.interfaces.IPlayMusic;

/**
 * Created by Adminis on 2017/3/2.
 */

public class Music {

    private Activity activity;
    private IPlayMusic iPlayMusic = new PlayMusicBySystem();

    public Music(Activity activity) {
        this.activity = activity;
    }

    public void setiPlayMusic(IPlayMusic iPlayMusic) {
        this.iPlayMusic = iPlayMusic;
    }

    public void playMusic() {

        iPlayMusic.playMusic(activity);
    }
}
