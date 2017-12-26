package com.dino.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Dino on 2017/12/26.
 */

public class DrawPoint extends View {
    public DrawPoint(Context context) {
        super(context);
    }

    public DrawPoint(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawPoint(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int screenWidth =canvas.getWidth();
        Paint paint = new Paint();
        paint.setStrokeWidth(20);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(screenWidth/2,screenWidth/4,paint);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(screenWidth/2,screenWidth*3/4,paint);
    }
}
