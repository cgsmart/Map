package com.example.chenshuai.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(MainActivity.this,"This is a Toast!",Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"This is a Toast3!",Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"This is a Toast4",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
        Uri uri = Uri.parse("content://com.example.app.provider/table1");
    }
}
