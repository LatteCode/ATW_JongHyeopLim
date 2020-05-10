package com.example.myassignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = (WebView)findViewById(R.id.webView);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("https://antsthatwander.github.io/");
        myWebView.setWebChromeClient(new WebChromeClient());

        }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()){
            myWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class WebViewClientClass extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            Log.d("check URL",url);
            view.loadUrl(url);
            return true;
        }

    }
}
