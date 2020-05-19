package com.example.week5_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    private TextView textview3;
    private TextView textview4;
    private EditText message2;

    public static final String MESSAGE2 = "message2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textview3 = findViewById(R.id.textview3);
        textview4 = findViewById(R.id.textview4);
        message2 = findViewById(R.id.message2);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(Activity1.MESSAGE1);
            textview3.setText("Message received");
            textview4.setText(message);
        }
    }

    public void sendMessage2OnClick(View view) {
        Intent intent = new Intent(Activity2.this, Activity1.class);
        if(message2.getText().toString().length() > 0) {
            intent.putExtra(MESSAGE2, message2.getText().toString());
        }
        else {
            intent.putExtra(MESSAGE2, ":)");
        }
        startActivity(intent);
        finish();
    }
}
