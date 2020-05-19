package com.example.week5_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
    private EditText message1;
    private Button sendButton1;
    private TextView textView1;
    private TextView textView2;


    public static final String MESSAGE1 = "message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        message1 = findViewById(R.id.message1);
        sendButton1 = findViewById(R.id.buttonSend1);
        textView1 = findViewById(R.id.textview1);
        textView2 = findViewById(R.id.textview2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(Activity2.MESSAGE2);
            textView1.setText(R.string.reply_received);
            textView2.setText(message);
        }
    }

    public void sendMessage1OnClick(View view) {
        Intent intent = new Intent(Activity1.this, Activity2.class);
        if (message1.getText().toString().length() > 0) {
            intent.putExtra(MESSAGE1, message1.getText().toString());
        } else {
            intent.putExtra(MESSAGE1, ":)");
        }
        startActivity(intent);
    }
}
