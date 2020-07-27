package com.fab.sleepwake.alarm;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import com.fab.sleepwake.R;

public class RingtonePlayingService extends Service{

    private MediaPlayer mPlayer = null;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Log.d("slog", "onStart()");
        super.onStart(intent, startId);
        mPlayer = MediaPlayer.create(this, R.raw.alarm_example);
        mPlayer.start();
        // mPlayer.setLooping(true);
    }

    @Override
    public void onDestroy() {
        Log.d("slog", "onDestroy()");
        mPlayer.stop();
        super.onDestroy();
    }
}