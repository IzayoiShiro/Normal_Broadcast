package com.example.normal_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by 杨天宇 on 2016/7/16.
 */
public class MyBroadcastReceiver01 extends BroadcastReceiver {
    private static final String TAG = "MyBroadcastReceiver01";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive: 自定义的广播接收者01，接收到了自定义的广播事件");
    }
}
