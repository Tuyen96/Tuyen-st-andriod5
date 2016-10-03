package com.example.tuyenpham.turn5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import butterknife.BindColor;
import butterknife.ButterKnife;

/**
 * Created by Tuyen Pham on 03/10/2016.
 */

public class CricleView extends View {
    Paint  p = new Paint(Paint.ANTI_ALIAS_FLAG);
    @BindColor(R.color.colorAccent)
    public int colorAccent;
    @BindColor(R.color.colorPrimary)
    public int colorPrimary;
    public CricleView(Context context) {
        super(context);
    }

    public CricleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        ButterKnife.bind(this, this);
    }

    public CricleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        p.setColor(colorAccent);
        canvas.drawCircle(width / 3, height /2 , height /2, p);
        p.setColor(colorPrimary);
        canvas.drawCircle(width * 2 / 3, height /2 , height /2, p);
    }
}
