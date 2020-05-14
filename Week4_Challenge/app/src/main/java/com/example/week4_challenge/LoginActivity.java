package com.example.androidfundamentals_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText emailAddressEditText;
    private EditText phoneEditText;
    private CheckBox termsCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailAddressEditText = findViewById(R.id.emailEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        termsCheckBox = findViewById(R.id.termsCheckBox);


    }

    public void loginOnClick(View view) {
        String email = emailAddressEditText.getText().toString();
        String phone = phoneEditText.getText().toString();

        if(email.isEmpty()) {
            emailAddressEditText.setError("Please fill the email address");
        }
        if(phone.isEmpty()) {
            phoneEditText.setError("Please fill the phone number");
        }

        if(termsCheckBox.isChecked() == false){
            Toast.makeText(this, R.string.accept_terms_error, Toast.LENGTH_LONG).show();
        }
        if(!email.isEmpty() && !phone.isEmpty() && termsCheckBox.isChecked()) {
            Toast.makeText(this, email + " " + phone, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LoginActivity.this, EventsActivity.class);
            startActivity(intent);
        }


    }
}
