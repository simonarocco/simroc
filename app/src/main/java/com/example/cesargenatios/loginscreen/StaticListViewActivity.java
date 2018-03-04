package com.example.cesargenatios.loginscreen;

import android.app.ActionBar;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.ActionBarActivity;

/**
 * Created by Emma on 2018-03-03.
 */

public class StaticListViewActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager = getSupportFragmentmanager();
        if (fragmentManager.findFragmentById(android.R.id.content) == null) {
            StaticListViewFragment fragment = StaticListViewFragment.newInstance();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(android.R.id.content, fragment);
            ft.commit();
        }
        ((ActionBarActivity)this).getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
