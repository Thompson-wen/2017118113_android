package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.net.Uri;

public class HelloWorldActivity extends AppCompatActivity {

    private static final String TAG = "HelloWorldActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("I am activity1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Button Hello1=(Button)findViewById((R.id.Hello1));
        Hello1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HelloWorldActivity.this, HelloWorldActivity.class);
                startActivity(intent);
            }
        });

        Button Hello2=(Button )findViewById((R.id.Hello2));
        Hello2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.hstc.edu.cn"));
                startActivity(intent);
            }
        });

        Button Hello3=(Button )findViewById((R.id.Hello3));
        Hello3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HelloWorldActivity.this, activity3.class);
                startActivity(intent);
            }
        });
        Log.d(TAG, "onCreate execute");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
