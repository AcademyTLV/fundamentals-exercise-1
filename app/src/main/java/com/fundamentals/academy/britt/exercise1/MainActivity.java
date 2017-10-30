package com.fundamentals.academy.britt.exercise1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String YOUR_EMAIL = null; //TODO: Optionally add your email
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);

    }

    public void openActivity(View view) {
        String message = editText.getText().toString();
        MessageActivity.start(this, message);
    }

    public void openEmail(View view) {
        String message = editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"))
                .putExtra(Intent.EXTRA_EMAIL, YOUR_EMAIL)
                .putExtra(Intent.EXTRA_SUBJECT, getString(R.string.email_subject))
                .putExtra(Intent.EXTRA_TEXT, message);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Toast.makeText(this, "No email clients were found on the device", Toast.LENGTH_LONG).show();
        }
    }
}
