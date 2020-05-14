package com.example.androidfundamentals_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String messageFromActivity = bundle.getString(SecondActivity.ECHO);
            if(messageFromActivity != null && messageFromActivity.length() >= 3){
                String response = "yes, yes...I am here";
                Intent intent = new Intent();
                intent.putExtra(SecondActivity.RESPONSE_ECHO, response);
                setResult(RESULT_OK, intent);

                //close current activity
                finish();
            }
        }
    }
}
