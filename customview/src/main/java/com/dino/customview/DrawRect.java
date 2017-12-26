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

public class DrawRect extends View {
    public DrawRect(Context context) {
        super(context);
    }

    public DrawRect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawRect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int screenWidth =canvas.getWidth();
        int gap = 20;
        Paint paint = new Paint();
        canvas.drawRect(gap,gap,screenWidth/2-gap,screenWidth/2-gap,paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(screenWidth/2+gap,gap,screenWidth-gap,screenWidth/2-gap,paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawRect(gap,screenWidth/2+gap,screenWidth/2-gap,screenWidth-gap,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
//        canvas.drawRect(screenWidth/2+gap,screenWidth/2+gap,screenWidth-gap,screenWidth-gap,paint);

        Rect rect = new Rect();
        rect.left = screenWidth/2+gap;
        rect.top = screenWidth/2+gap;
        rect.right = screenWidth-gap;
        rect.bottom = screenWidth-gap;
        canvas.drawRect(rect,paint);
    }
}
