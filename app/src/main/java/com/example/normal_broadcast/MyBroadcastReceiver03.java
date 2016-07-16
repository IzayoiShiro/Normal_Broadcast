package com.example.normal_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by 杨天宇 on 2016/7/16.
 */
public class MyBroadcastReceiver03 extends BroadcastReceiver {
    private static final String TAG = "MyBroadcastReceiver03";
    @Override
    public void onReceive(Context context, Intent intent) {
//        Log.i(TAG, "onReceive: 自定义的广播接收者03，接收到了自定义的广播事件");
        Log.i(TAG, "onReceive: 我是广播接受者03，虽然广播接收者02拦截了有序广播，我还是发出来了");
    }
}
