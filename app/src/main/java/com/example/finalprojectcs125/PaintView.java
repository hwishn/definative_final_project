package com.example.finalprojectcs125;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
// class created with help from https://code.tutsplus.com/tutorials/android-sdk-create-a-drawing-app-touch-interaction--mobile-19202
public class PaintView  extends View {
    private Paint mPaint;
    private Canvas mCanvas;
    private Bitmap myBitmap;
    private Paint canvasPaint = new Paint(Paint.DITHER_FLAG);
    private Path currentPath;

    public PaintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUpDrawing();
    }

    @Override
    public void onSizeChanged(int h, int w, int oh, int ow) {
        super.onSizeChanged(h, w, oh, ow);
        myBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(myBitmap);
    }

    public void setUpDrawing() {
        currentPath = new Path();
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(20);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(myBitmap, 0, 0, canvasPaint);
        canvas.drawPath(currentPath, mPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                currentPath.moveTo(x,y);
                break;
            case MotionEvent.ACTION_MOVE:
                currentPath.lineTo(x,y);
                break;
            case MotionEvent.ACTION_UP:
                mCanvas.drawPath(currentPath, mPaint);
                currentPath.reset();
                break;
        }
        invalidate();
        return true;
    }

    public void setColor(int num) {
        mPaint.setColor(num);
    }

    public void clearCanvas() {
        mCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        invalidate();
    }
}
