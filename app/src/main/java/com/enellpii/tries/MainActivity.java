package com.enellpii.tries;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements ModelViewPresenterComponents.View{

    private ModelViewPresenterComponents.TriePresenterContract mPresenter;
    public static AssetManager assetManager;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assetManager = getAssets();
        setupModelViewPresenterComponents();

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           public void onItemSelected(AdapterView<?> parent, View v, int position, long id){

           }
           public void onNothingSelected(AdapterView<?> parent) {

           }
        });
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "" + position,
                        Toast.LENGTH_LONG).show();
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
