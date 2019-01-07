package com.example.atanu.listview_flag;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
//import android.app.FragmentManager;


public class MyAdapter extends BaseAdapter {
    String[] myCountry;
    int[] myImages;
    Context ctx;
    LayoutInflater layoutInflater;

    public MyAdapter(String[] myCountry, int[] myImages, Context ctx) {
        this.myCountry = myCountry;
        this.myImages = myImages;
        this.ctx = ctx;

        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return myCountry.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        final View view = layoutInflater.inflate(R.layout.item_layout,null);

        TextView textView = view.findViewById(R.id.tv_country);
        ImageView imageView = view.findViewById(R.id.iv_map);

        ConstraintLayout constraintLayout = view.findViewById(R.id.myContrastinLayout);

        textView.setText(myCountry[position]);
        imageView.setImageResource(myImages[position]);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(ctx, "Country Selected " + myCountry[position], Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                String message = "you have selected " + myCountry[position];
                bundle.putString("key", message);
                fragment myFragment = new fragment();
                myFragment.setArguments(bundle);

               // FragmentManager fm = getFra




            }
        });
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "Country Layout Selected " + myCountry[position], Toast.LENGTH_SHORT).show();

            }
        });
        return view;


    }
}
