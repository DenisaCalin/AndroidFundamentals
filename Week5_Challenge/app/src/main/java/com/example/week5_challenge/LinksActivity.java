package com.example.week5_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinksActivity extends AppCompatActivity {

    Button buttonWebsite, buttonLocation, buttonShare, buttonCall;
    EditText editTextWebsite, editTextLocation, editTextShare, editTextCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);

        buttonWebsite = findViewById(R.id.openWebsiteButton);
        buttonLocation = findViewById(R.id.openLocationButton);
        buttonShare = findViewById(R.id.shareTextButton);
        buttonCall = findViewById(R.id.callButton);
    }

    public void linkOnClick(View view) {
    }
}
