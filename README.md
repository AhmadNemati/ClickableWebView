# ClickableWebView
Simple WebView for Detect click on an image

# Demo
![alt tag](https://raw.githubusercontent.com/AhmadNemati/ClickableWebView/test/art/webview.gif)
# Setup
# Step 1 :Add it as a dependency in your app's build.gradle file

```gradle
compile 'com.ahmadnemati.clickablewebview:clickablewebview:1.1.1'    //jcenter()
```
# Step 2 :Add it to your layout
```xml
  <com.ahmadnemati.clickablewebview.ClickableWebView
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      android:id="@+id/clickable_webview"/>
```
# Step 3 :Initialize WebView and setOnWebViewClickListener Method
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
#Developed By

* Ahmad Nemati 
 * [mikepenz.com](http://mikepenz.com) - <nematiprog@gmail.com>


#License



  Copyright (c) 2016 Ahmad Nemati

   Permission is hereby granted, free of charge, to any person obtaining a copy
   of this software and associated documentation files (the "Software"), to deal
   in the Software without restriction, including without limitation the rights
   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
   copies of the Software, and to permit persons to whom the Software is
   furnished to do so, subject to the following conditions:

   The above copyright notice and this permission notice shall be included in all
   copies or substantial portions of the Software.

   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
   SOFTWARE.


