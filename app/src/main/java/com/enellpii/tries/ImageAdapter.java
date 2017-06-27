package com.enellpii.tries;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * Created by melissa on 6/20/17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return letterMap.size() - 1;
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
        char ch = (char) (r + 97);

        imageView.setImageResource(letterMap.get(String.valueOf(ch)));
        return imageView;
    }

    private static HashMap<String, Integer> letterMap;
    static {
        letterMap = new HashMap<String, Integer>();
        letterMap.put("a", R.drawable.a); letterMap.put("b", R.drawable.b);
        letterMap.put("c", R.drawable.c); letterMap.put("d", R.drawable.d);
        letterMap.put("e", R.drawable.e); letterMap.put("f", R.drawable.f);
        letterMap.put("g", R.drawable.g); letterMap.put("h", R.drawable.h);
        letterMap.put("i", R.drawable.i); letterMap.put("j", R.drawable.j);
        letterMap.put("k", R.drawable.k); letterMap.put("l", R.drawable.l);
        letterMap.put("m", R.drawable.m); letterMap.put("n", R.drawable.n);
        letterMap.put("o", R.drawable.o); letterMap.put("p", R.drawable.p);
        letterMap.put("q", R.drawable.q); letterMap.put("r", R.drawable.r);
        letterMap.put("s", R.drawable.s); letterMap.put("t", R.drawable.t);
        letterMap.put("u", R.drawable.u); letterMap.put("v", R.drawable.v);
        letterMap.put("w", R.drawable.w); letterMap.put("x", R.drawable.x);
        letterMap.put("y", R.drawable.y); letterMap.put("z", R.drawable.z);
    }
}