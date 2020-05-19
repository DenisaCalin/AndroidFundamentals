package com.example.week5_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    private static String TAG = "FirstActivity";
    public static String MESSAGE = "message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    public void openSecondActivityOnClick(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        String text = "";
        switch (view.getId()) {
            case R.id.buttonOne:
                text = getString(R.string.text_one_content);
                break;
            case R.id.buttonTwo:
                text = getString(R.string.text_two_content);
                break;
            case R.id.buttonThree:
                text = getString(R.string.text_three_content);
                break;
            default:
                text = getString(R.string.text_default);
        }
        intent = intent.putExtra(MESSAGE, text);
        startActivity(intent);
    }

    public void goToChatOnClick(View view) {
        Intent intent = new Intent(FirstActivity.this, Activity1.class);
        startActivity(intent);
    }

    public void goToLinksOnClick(View view) {
        Intent intent = new Intent(FirstActivity.this, LinksActivity.class);
        startActivity(intent);
    }
}
