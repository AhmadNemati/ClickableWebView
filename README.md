[![License Apache 2.0](https://img.shields.io/badge/License-Apache%202.0-blue.svg?style=true)](http://www.apache.org/licenses/LICENSE-2.0)
![minSdkVersion 9](https://img.shields.io/badge/minSdkVersion-9-red.svg?style=true)
![compileSdkVersion 24](https://img.shields.io/badge/compileSdkVersion-24-yellow.svg?style=true)
# ClickableWebView
Simple WebView to Detect click on an image

# Demo
![alt tag](https://raw.githubusercontent.com/AhmadNemati/ClickableWebView/test/art/webview.gif)
# Setup
# Step 1 :Add it as a dependency in your app's build.gradle file

```gradle
compile 'com.ahmadnemati.clickablewebview:clickablewebview:1.1.2'    //jcenter()
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
 * [ahmadnemati.com](http://ahmadnemati.com) - <nematiprog@gmail.com>


#License

    Copyright 2016 Ahmad Nemati

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


