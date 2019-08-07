package com.example.maryam.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Me", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Me", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Me", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Me", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Me", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Me", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Me", "onRestart");

    }
}
