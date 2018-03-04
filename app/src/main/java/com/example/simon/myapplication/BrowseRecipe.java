package com.example.simon.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class BrowseRecipe extends AppCompatActivity {

    ListView lst;
    String[] foodnames = {"Pancakes", "Scrambled Eggs", "Grilled Cheese", "Quinoa Salad",
    "Pesto Pasta", "Cookies", "BBQ Dinner", "Soup", "Lentils and Rice"};
    String[] description = {"Martha Stewart Banana Pancakes", "Fluffy Scrambled Eggs",
            "Grilled Cheese with Cheddar", "Garden Vegetable Quinoa Salad", "Creamy Italian Pesto Pasta",
    "Decadent Chocolate Chip Cookies", "Steak and Crispy Potatoes", "Warm Hearty Chicken Noodle Soup",
    "Healthy Lentils and Rice with Spice"};
    Integer[] imgid={R.mipmap.pancake, R.mipmap.eggs, R.mipmap.grilled, R.mipmap.quinoa,
            R.mipmap.pasta, R.mipmap.cookies, R.mipmap.steak, R.mipmap.soup, R.mipmap.lentil};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_recipe);

    lst=findViewById(R.id.listview);
    CustomListView customListView=new CustomListView(this, foodnames, description, imgid);
    lst.setAdapter(customListView);

    }
}
