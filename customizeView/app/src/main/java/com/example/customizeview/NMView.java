package com.example.customizeview;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class NMView extends View {

//    public NMView(Context context) {
//        super(context);
//    }
    //定义画笔和初始位置
    Paint p=new Paint();
    public float currentX=50;
    public float currentY=50;
    public  int textColor;

    public NMView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

}
