package com.ahmadnemati.clickablewebviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ahmadnemati.clickablewebview.ClickableWebView;
import com.ahmadnemati.clickablewebview.listener.OnWebViewClicked;

public class MainActivity extends AppCompatActivity implements OnWebViewClicked {
    private ClickableWebView clickableWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickableWebView = (ClickableWebView) findViewById(R.id.clickable_webview);
        clickableWebView.setOnWebViewClickListener(this);
        clickableWebView.loadUrl("http://www.ushistory.org/Betsy/flagfact.html");
        clickableWebView.loadUrl("http://www.ushistory.org/Betsy/flagfact.html");
    }

    @Override
    public void onClick(String url) {
        Toast.makeText(MainActivity.this, "Url : " + url, Toast.LENGTH_SHORT).show();
    }
}
