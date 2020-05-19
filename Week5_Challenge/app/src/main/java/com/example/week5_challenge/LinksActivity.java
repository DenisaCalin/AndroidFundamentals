package com.example.week5_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinksActivity extends AppCompatActivity {

    EditText editTextWebsite, editTextLocation, editTextShare, editTextCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);

        editTextWebsite = findViewById(R.id.editTextWebsite);
        editTextLocation = findViewById(R.id.editTextLocation);
        editTextShare = findViewById(R.id.editTextShare);
        editTextCall = findViewById(R.id.editTextCall);
    }

    public void linkOnClick(View view) {
        switch (view.getId()) {
            case R.id.openWebsiteButton:
                Intent intentWebsite = new Intent(Intent.ACTION_VIEW);
                intentWebsite.setData(Uri.parse(editTextWebsite.getText().toString()));
                startActivity(intentWebsite);
                break;
            case R.id.openLocationButton:
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + editTextLocation.getText().toString());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;
            case R.id.shareTextButton:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, editTextShare.getText().toString());
                sendIntent.setType("text/plain");
                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
                break;
            case R.id.callButton:
                Intent callImplicitIntent = new Intent(Intent.ACTION_DIAL);
                callImplicitIntent.setData(Uri.parse("tel:" + editTextCall.getText().toString()));
                if (callImplicitIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callImplicitIntent);
                }
                break;
        }
    }
}
