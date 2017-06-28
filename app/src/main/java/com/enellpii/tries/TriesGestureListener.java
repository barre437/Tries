package com.enellpii.tries;

import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by melissa on 6/27/17.
 */

public class TriesGestureListener extends GestureDetector.SimpleOnGestureListener {
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY){
        return true;
    }
}
