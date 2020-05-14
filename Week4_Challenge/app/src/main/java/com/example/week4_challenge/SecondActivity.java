package com.example.androidfundamentals_1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public static final String ECHO = "echo";
    public static final int ECHO_CHANNEL = 145;
    public static final String RESPONSE_ECHO = "echo result";

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText = findViewById(R.id.editTextMessage);
    }

    public void sendMessageToActivityOnClick(View view) {
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        intent.putExtra(ECHO, "Are you there?");
        startActivityForResult(intent, ECHO_CHANNEL );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == ECHO_CHANNEL && resultCode == RESULT_OK){
            String resultFromThirdActivity = data.getStringExtra(RESPONSE_ECHO);
            editText.setText(resultFromThirdActivity);

        }
    }
}
