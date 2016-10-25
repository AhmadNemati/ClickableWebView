package com.ahmadnemati.clickablewebview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

import com.ahmadnemati.clickablewebview.listener.OnWebViewClicked;

import java.util.Calendar;

/**
 * Created by Ahmad Nemati on 10/23/2016.
 */

public class ClickableWebView extends WebView implements View.OnClickListener, View.OnTouchListener {
    private OnWebViewClicked listener;
    private static final int MAX_CLICK_DURATION = 200;
    private static final int IMAGE_TYPE = 5;
    private long startClickTime;

    public ClickableWebView(Context context) {
        super(context);
        init();
    }

    public ClickableWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ClickableWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ClickableWebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    public ClickableWebView(Context context, AttributeSet attrs, int defStyleAttr, boolean privateBrowsing) {
        super(context, attrs, defStyleAttr, privateBrowsing);
        init();
    }

    private void init() {
        setOnClickListener(this);
        setOnTouchListener(this);
    }

    public void setOnWebViewClickListener(OnWebViewClicked listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        WebView.HitTestResult hr = getHitTestResult();
        try {
            if (listener != null && hr.getType() == IMAGE_TYPE) {
                listener.onClick(hr.getExtra());
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                startClickTime = Calendar.getInstance().getTimeInMillis();
                break;
            }
            case MotionEvent.ACTION_UP: {
                long clickDuration = Calendar.getInstance().getTimeInMillis() - startClickTime;
                if (clickDuration < MAX_CLICK_DURATION) {
                    performClick();
                }
            }
        }
        return false;
    }
}
