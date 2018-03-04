package com.example.cesargenatios.loginscreen;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Emma on 2018-03-03.
 */


public class StaticListViewFragment extends Fragment{
    private static String[] FOODS = {"food1, food2, food3"};

    public static StaticListViewFragment
    newInstance() {
        Bundle args = new Bundle();
        StaticListViewFragment fragment = new StaticListViewFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.staticlistviewmain, container, false);
        ListView listView = mainView.findViewById(R.id.listView);

        listView.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, FOODS));
        return mainView;
    }
}
