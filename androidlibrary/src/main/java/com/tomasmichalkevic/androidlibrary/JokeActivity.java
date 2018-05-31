package com.tomasmichalkevic.androidlibrary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends Activity {

    private TextView joke_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        joke_tv = findViewById(R.id.joke_tv);

        Intent intent = getIntent();

        if(intent.hasExtra("joke")){
            joke_tv.setText(intent.getStringExtra("joke"));
        }

    }
}
