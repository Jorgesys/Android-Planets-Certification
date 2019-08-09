package com.jorgesys.planetmaster.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

//TODO: This class should be used in the planet list to display danger level
public class OrbitLevelView extends TextView {

    public OrbitLevelView(Context context) {
        super(context);
    }

    public OrbitLevelView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OrbitLevelView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public OrbitLevelView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void setDangerLevel(int dangerLevel) {
        //TODO: Update the view appropriately based on the level input
    }

    public int getDangerLevel() {
        //TODO: Report the current level back as an integer
        return -1;
    }
}
