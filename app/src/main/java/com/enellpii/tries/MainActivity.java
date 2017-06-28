package com.enellpii.tries;

import android.content.res.AssetManager;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements ModelViewPresenterComponents.View{

    private ModelViewPresenterComponents.TriePresenterContract mPresenter;
    public static AssetManager assetManager;

    private GestureDetectorCompat mDetector;
    String word = "";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assetManager = getAssets();
        setupModelViewPresenterComponents();

        mDetector = new GestureDetectorCompat(this, new TriesGestureListener());

        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                char letter = (char) gridview.getChildAt(position).getId();
                word = word + String.valueOf(letter);
                System.out.println(word);
            }
        });
    }

    public void setupModelViewPresenterComponents(){
        mPresenter = new TriePresenter(this);
    }

    @Override
    public void notifyGridUpdated() {

    }
}
