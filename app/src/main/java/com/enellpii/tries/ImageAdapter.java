package com.enellpii.tries;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by melissa on 6/20/17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length - 1;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(295, 395));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(0, 0, 0, 0);
        } else {
            imageView = (ImageView) convertView;
        }
        Random rand = new Random();
        int r = rand.nextInt(26);
        imageView.setImageResource(mThumbIds[r]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.a, R.drawable.b,
            R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.f,
            R.drawable.g, R.drawable.h,
            R.drawable.i, R.drawable.j,
            R.drawable.k, R.drawable.l,
            R.drawable.m, R.drawable.n,
            R.drawable.o, R.drawable.p,
            R.drawable.q, R.drawable.r,
            R.drawable.s, R.drawable.t,
            R.drawable.u, R.drawable.v,
            R.drawable.w, R.drawable.x,
            R.drawable.y, R.drawable.z
    };
}