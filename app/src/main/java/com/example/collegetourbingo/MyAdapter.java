package com.example.collegetourbingo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private final  int images[];
    private final String name[];

    private ImageView imageView;
    private TextView textView;

    private LayoutInflater layoutInflater;

    public MyAdapter(Context context, int[] images, String[] name) {
        this.context = context;
        this.images = images;
        this.name = name;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=layoutInflater.inflate(R.layout.bingo_box,null);
        imageView=(ImageView)convertView.findViewById(R.id.imageview);
        textView=(TextView)convertView.findViewById(R.id.textview);

        imageView.setImageResource(images[position]);
        textView.setText(name[position]);
        return convertView;
    }
}
