package com.example.week5_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewParagraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewParagraph = findViewById(R.id.textViewParagraph);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(FirstActivity.MESSAGE);
            textViewParagraph.setText(message);
        }

    }
}
