package com.enellpii.tries;

import android.content.res.AssetManager;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements ModelViewPresenterComponents.View{

    private ModelViewPresenterComponents.TriePresenterContract mPresenter;
    public static AssetManager assetManager;
    private static final String TAG = "MainActivity";
    private VelocityTracker mVelocityTracker = null;
    String word = "";
    int prevPos;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assetManager = getAssets();
        setupModelViewPresenterComponents();

        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnTouchListener(new AdapterView.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                int action = MotionEventCompat.getActionMasked(event);
                float currentX = event.getX();
                float currentY = event.getY();
                int position = gridview.pointToPosition((int) currentX, (int) currentY);
                if (prevPos != position){
                    char letter = (char) gridview.getChildAt(position).getId();
                    word = word + String.valueOf(letter);
                    System.out.println(word);
                }

                prevPos = position;
                switch (action) {
                    case (MotionEvent.ACTION_DOWN) :

                        Log.d(TAG, "Action was DOWN");
                        return true;
                    case (MotionEvent.ACTION_MOVE) :

                        Log.d(TAG,"Action was MOVE");
                        return true;
                    case (MotionEvent.ACTION_UP) :
                        if(mPresenter.getTrie().search(word))
                            Log.d(TAG, "TRUE " + word + " is a word.");
                        else
                            Log.d(TAG, "FALSE " + word + " isn't a word.");
                        Log.d(TAG,"Action was UP");
                        word = "";
                        return true;
                    case (MotionEvent.ACTION_CANCEL) :
                        Log.d(TAG,"Action was CANCEL");
                        return true;
                    case (MotionEvent.ACTION_OUTSIDE) :
                        Log.d(TAG,"Movement occurred outside bounds " +
                                "of current screen element");
                        return true;
                    default :
                        return MainActivity.super.onTouchEvent(event);
                }
            }
        });
        /*gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                char letter = (char) gridview.getChildAt(position).getId();
                word = word + String.valueOf(letter);
                System.out.println(word);
            }
        });*/
    }

    public void setupModelViewPresenterComponents(){
        mPresenter = new TriePresenter(this);
    }

    @Override
    public void notifyGridUpdated() {

    }
}
