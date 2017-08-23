package com.zs.toucheventreturnfalse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    MyTV tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.inject(this);
        tv = (MyTV) findViewById(R.id.tv);
        tv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        tv.getParent().requestDisallowInterceptTouchEvent(true);
//                Toast.makeText(this, "DownAc", Toast.LENGTH_SHORT).show();
                        Log.e("zhengshuai", "TV.onTouch,Down");
                        break;
                    case MotionEvent.ACTION_UP:
//                Toast.makeText(this, "UpAc", Toast.LENGTH_SHORT).show();
                        Log.e("zhengshuai", "TV.onTouch,Up");
                        break;
                    default:
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
//                Toast.makeText(this, "DownAc", Toast.LENGTH_SHORT).show();
                Log.e("zhengshuai", "MainActivity.onTouchEvent,Down");
                break;
            case MotionEvent.ACTION_UP:
//                Toast.makeText(this, "UpAc", Toast.LENGTH_SHORT).show();
                Log.e("zhengshuai", "MainActivity.onTouchEvent,Up");
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }

}
