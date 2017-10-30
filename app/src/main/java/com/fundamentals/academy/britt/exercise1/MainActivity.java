package com.fundamentals.academy.britt.exercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);

    }

    public void openActivity(View view) {
        MessageActivity.start(this, editText.getText().toString());
    }

    public void openEmail(View view) {
    }
}
