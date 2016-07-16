package com.example.normal_broadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyBroadcastReceiver01 receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        receiver = new MyBroadcastReceiver01();
//        receiver.
//        String action = "www.itcast.cn";
//        IntentFilter filter = new IntentFilter(action);
//        filter.setPriority(1000);
//        registerReceiver(receiver, filter);
    }

    public void send(View view) {
        Intent intent = new Intent();
        intent.setAction("www.itcast.cn");
//        sendOrderedBroadcast(intent, null);
        MyBroadcastReceiver03 receiver03 = new MyBroadcastReceiver03();
        sendOrderedBroadcast(intent,null,receiver03,null,0,null,null);
    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        unregisterReceiver(receiver);
//    }
}
