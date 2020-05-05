package com.example.week3_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    // LOGIN
    private EditText emailAddressEditText;
    private EditText phoneEditText;
    private CheckBox termsCheckBox;

    // SPINNER
    private Spinner spinner;
    private List<String> versions;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // SCROLL VIEW
        setContentView(R.layout.activity_scroll);

        // FRAME LAYOUT
        setContentView(R.layout.activity_frame);

        // LOGIN
        setContentView(R.layout.activity_login);
        emailAddressEditText = findViewById(R.id.emailEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        termsCheckBox = findViewById(R.id.termsCheckBox);


        // SPINNER
        spinner = findViewById(R.id.spinnerExample);
        setSpinnerSource();
        spinner.setAdapter(getSpinnerAdapter());
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item = spinner.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    // LOGIN
    public void loginOnClick(View view) {
        String email = emailAddressEditText.getText().toString();
        String phone = phoneEditText.getText().toString();

        if(email.isEmpty()) {
            emailAddressEditText.setError(getString(R.string.empty_email_error));
        }

        if (!isEmailValid(email) && !email.isEmpty()) {
            emailAddressEditText.setError(getString(R.string.invalid_email_error));
        }

            if(phone.isEmpty()) {
            phoneEditText.setError(getString(R.string.phone_error));
        }

        if(!termsCheckBox.isChecked()){
            Toast.makeText(this, R.string.t_and_c_error, Toast.LENGTH_LONG).show();
        }
        if(!email.isEmpty() && isEmailValid(email) && !phone.isEmpty() && termsCheckBox.isChecked()) {
            Toast.makeText(this, email + " " + phone, Toast.LENGTH_LONG).show();
        }
    }

    private boolean isEmailValid(String email) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(email).matches();
    }

    // SPINNER
    private void setSpinnerSource(){
        versions = new ArrayList<>();
        versions.add("Cupcake");
        versions.add("Donut");
        versions.add("Eclair");
        versions.add("KitKat");
        versions.add("Pie");
    }

    private ArrayAdapter<String> getSpinnerAdapter() {
        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, versions);
    }
}
