package com.example.user.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("前田", 25, "旅行");
        human.say();
        human.think();

        Human human2 = new Human("あ", 2, "abc");
        human2.say();
        human2.think();

    }

}