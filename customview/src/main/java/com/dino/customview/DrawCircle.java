package com.dino.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Dino on 2017/12/26.
 */

public class DrawCircle extends View {
    public DrawCircle(Context context) {
        super(context);
    }

    public DrawCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int screenWidth =canvas.getWidth();
        Paint paint = new Paint();
        canvas.drawCircle(screenWidth/4,screenWidth/4,screenWidth/4 -30,paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(screenWidth*3/4,screenWidth/4,screenWidth/4 -30,paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(screenWidth/4,screenWidth*3/4,screenWidth/4 -30,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(screenWidth*3/4,screenWidth*3/4,screenWidth/4 -30,paint);

    }
}
