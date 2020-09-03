package com.example.newfrist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;


public class MyView extends View {
    //Point p=new Point();
    Paint p=new Paint();
    public  float currentX=50;
    public  float currentY=50;
    public int textColor;

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        //获取资源里面的属性,把资源放在资源文件里
        TypedArray array =context.obtainStyledAttributes(attrs,R.styleable.myView);
        textColor=array.getColor(R.styleable.myView_TextColor, Color.BLACK);
        array.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔颜色为蓝色
        p.setColor(Color.BLUE);
        //绘制圆心的X,Y坐标,半径,画笔
        canvas.drawCircle(currentX,currentY,60,p);
        //设置文字和颜色
        p.setColor(textColor);
        canvas.drawText("BY finch",currentX,currentY+100,p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        currentX=event.getX();
        currentY=event.getY();
        invalidate();//重新绘制图形
        return true;
    }
}
