# ClickableWebView
Simple WebView for Detect click on an image

# Demo
![alt tag](https://raw.githubusercontent.com/AhmadNemati/ClickableWebView/test/art/webview.gif)
# Setup
# Step 1 :Add it as a dependency in your app's build.gradle file

```gradle
compile 'com.ahmadnemati.clickablewebview:clickablewebview:1.1.1'
```
# Step 2 :Add it to your layout
```xml
  <com.ahmadnemati.clickablewebview.ClickableWebView
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      android:id="@+id/clickable_webview"/>
```
# Step 3 :Initialize WebView and setOnWebViewClickListener interface
```java
        ClickableWebView clickableWebView;
        clickableWebView= (ClickableWebView) findViewById(R.id.clickable_webview);
        clickableWebView.setOnWebViewClickListener(new OnWebViewClicked() {
            @Override
            public void onClick(String url) {
                //just use url
            }
        });
```

