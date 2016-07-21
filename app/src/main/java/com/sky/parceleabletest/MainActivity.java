package com.sky.parceleabletest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LiuDongBing";
    private Button bundle_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bundle_btn = (Button) findViewById(R.id.button);

        bundle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SecondActivity.class);
                Person person = new Person("LiuDongBing", "abc.1234");
                Bundle bundle = new Bundle();
                bundle.putParcelable("person", person);
                intent.putExtras(bundle);
                Log.d(TAG, "onClick: startActivity(intent)");
                startActivity(intent);
            }
        });
    }
}
