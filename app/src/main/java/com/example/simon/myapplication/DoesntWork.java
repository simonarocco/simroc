package com.example.simon.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoesntWork extends AppCompatActivity {

    private Button IHave;
    private Button INeed;
    private Button Browse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doesnt_work);

        IHave= findViewById(R.id.iHave);
        INeed= findViewById(R.id.iNeed);
        Browse= findViewById(R.id.Browse);

        IHave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoesntWork.this, IHave.class);
                startActivity(intent);
            }
        });

        INeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoesntWork.this, INeed.class);
                startActivity(intent);
            }
        });

        Browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoesntWork.this, BrowseRecipe.class);
                startActivity(intent);
            }
        });
   }
}
