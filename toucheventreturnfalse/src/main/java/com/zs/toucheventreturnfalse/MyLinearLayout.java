package com.zs.toucheventreturnfalse;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * User: ZhengShuai
 * Date: 2017-02-22
 * Time: 14:51
 * desc:
 */
public class MyLinearLayout extends LinearLayout {
    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
//                Toast.makeText(this, "DownAc", Toast.LENGTH_SHORT).show();
                Log.e("zhengshuai","LinearLayout.onTouchEvent,Down");
                break;
            case MotionEvent.ACTION_MOVE:
//                Toast.makeText(this, "DownAc", Toast.LENGTH_SHORT).show();
                Log.e("zhengshuai","LinearLayout.onTouchEvent,Move");
                break;
            case MotionEvent.ACTION_UP:
//                Toast.makeText(this, "UpAc", Toast.LENGTH_SHORT).show();
                Log.e("zhengshuai","LinearLayout.onTouchEvent,Up");
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                return false;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                break;
            default:
                break;
        }
        return true;
    }

}