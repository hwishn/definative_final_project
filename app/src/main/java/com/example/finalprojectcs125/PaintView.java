package com.example.finalprojectcs125;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class PaintView  extends View {
    private Paint mPaint;
    public PaintView(Context context) {
        super(context);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setXfermode(null);
        mPaint.setAlpha(0xff);
    }
    public void initialize() {
        //to implement later
    }
}
