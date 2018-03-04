package com.example.simon.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class CustomListView extends ArrayAdapter<String> {


    private String[] foodnames;
    private String[] description;
    private Integer[] imgid;
    private Activity context;

    public CustomListView(Activity context, String[] foodnames, String[] description,
                          Integer[] imgid) {
        super(context, R.layout.listview_layout, foodnames);

        this.context = context;
        this.foodnames = foodnames;
        this.description = description;
        this.imgid = imgid;
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.listview_layout, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else
        {
            viewHolder= (ViewHolder) r.getTag();

        }
        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(foodnames[position]);
        viewHolder.tvw2.setText(description[position]);

        return r;
    }


    class ViewHolder
    {
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;

        ViewHolder(View v)
        {
           tvw1 = (TextView) v.findViewById(R.id.foodnames);
           tvw2 = (TextView)  v.findViewById(R.id.description);
           ivw = v.findViewById(R.id.image);

        }
    }
}

