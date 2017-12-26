package com.dino.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Dino on 2017/12/26.
 */

public class DrawColor2 extends View {
    public DrawColor2(Context context) {
        super(context);
    }

    public DrawColor2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawColor2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.YELLOW);
    }
}
