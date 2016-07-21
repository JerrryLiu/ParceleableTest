package com.sky.parceleabletest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "LiuDongBing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Person person = extras.getParcelable("person");
        Log.d(TAG, "onCreate: " + "person.getUserName()" + person.getUserName()
                + "\nperson.getPassWord()" + person.getPassWord());
    }

}
