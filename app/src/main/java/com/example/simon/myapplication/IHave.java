package com.example.simon.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class IHave extends AppCompatActivity {
    EditText et;
    Button bt;
    ListView lv;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setContentView(R.layout.activity_ihave);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ihave);

        et = findViewById(R.id.add);
        bt = findViewById(R.id.buttonAdd);
        lv = findViewById(R.id.list);

        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(IHave.this,android.R.layout.simple_list_item_1, arrayList);
        lv.setAdapter(adapter);



        onBtnClick();

    }

    public void onBtnClick(){
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result= et.getText().toString();
                arrayList.add(result);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
