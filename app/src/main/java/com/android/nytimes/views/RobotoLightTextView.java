package com.android.nytimes.views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;


public class RobotoLightTextView extends android.support.v7.widget.AppCompatTextView {
    public RobotoLightTextView(Context context) {
        super(context);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "Roboto_Light.ttf");
        this.setTypeface(face);
    }

    public RobotoLightTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "Roboto_Light.ttf");
        this.setTypeface(face);
    }

    public RobotoLightTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "Roboto_Light.ttf");
        this.setTypeface(face);
    }
}
