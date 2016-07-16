package com.example.normal_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by 杨天宇 on 2016/7/16.
 */
public class MyBroadcastReceiver02 extends BroadcastReceiver {
    private static final String TAG = "MyBroadcastReceiver02";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive: 自定义的广播接收者02，接收到了自定义的广播事件");
        abortBroadcast(); //拦截有序广播
        Log.i(TAG, "onReceive: 我是广播接受者02，广播被我终结了");
    }
}
