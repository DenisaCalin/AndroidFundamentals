package com.example.week4_challenge;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.week4_challenge.RecyclerViewActivity.MoviesActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void frameLayoutActivityOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
        startActivity(intent);
    }

    public void recyclerViewActivityOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, MoviesActivity.class);
        startActivity(intent);
    }

    public void constraintLayoutActivityOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, ConstraintLayoutActivity.class);
        startActivity(intent);
    }
}
