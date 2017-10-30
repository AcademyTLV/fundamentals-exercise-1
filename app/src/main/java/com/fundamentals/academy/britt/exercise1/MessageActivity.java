package com.fundamentals.academy.britt.exercise1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    private static final String KEY_MESSAGE = "KEY_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textview);

        String message = getIntent().getStringExtra(KEY_MESSAGE);
        textView.setText(message);
    }

    public static void start(Context context, String message) {
        Intent intent = new Intent(context, MessageActivity.class);
        intent.putExtra(KEY_MESSAGE, message);
        context.startActivity(intent);
    }
}
