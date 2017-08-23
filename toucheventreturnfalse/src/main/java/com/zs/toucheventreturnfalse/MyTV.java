package com.zs.toucheventreturnfalse;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * User: ZhengShuai
 * Date: 2017-02-21
 * Time: 10:03
 * desc:
 */
public class MyTV extends LinearLayout {
    public MyTV(Context context) {
        super(context);
    }

    public MyTV(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTV(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                getParent().requestDisallowInterceptTouchEvent(true);
//                Toast.makeText(getContext(), "Down", Toast.LENGTH_SHORT).show();
                Log.e("zhengshuai","MyButton.onTouchEvent,Down");
                break;
            case MotionEvent.ACTION_MOVE:
                getParent().requestDisallowInterceptTouchEvent(true);
//                Toast.makeText(getContext(), "Down", Toast.LENGTH_SHORT).show();
                Log.e("zhengshuai","MyButton.onTouchEvent,Move");
                break;
            case MotionEvent.ACTION_UP:
//                Toast.makeText(getContext(), "Up", Toast.LENGTH_SHORT).show();
                Log.e("zhengshuai","MyButton.onTouchEvent,Up");
                getParent().requestDisallowInterceptTouchEvent(false);
                break;
            default:
                break;
        }
        return true;
    }
}