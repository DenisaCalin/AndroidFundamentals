package com.example.androidfundamentals_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
    }

    public void callOnClick(View view) {
        //implicit intent
        Intent callImplicitIntent = new Intent(Intent.ACTION_DIAL);

        callImplicitIntent.setData(Uri.parse("tel:0723817182"));
        if(callImplicitIntent.resolveActivity(getPackageManager())!=null){
            startActivity(callImplicitIntent);
        }

    }

    public void openLinkOnClick(View view) {
        // implicit intent to open iurl inside of a browser
        Intent openUrlImplicitIntent = new Intent(Intent.ACTION_VIEW);
        openUrlImplicitIntent.setData(Uri.parse("https://www.facebook.com/"));
        startActivity(openUrlImplicitIntent);
    }

    public void openSecondActivityOnClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
