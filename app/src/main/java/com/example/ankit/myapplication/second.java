package com.example.ankit.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Ankit on 2018-03-03.
 */

public class second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
    }
}
