package com.work.tope.alcphase1;

import android.app.ActionBar;
import android.app.Activity;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutAlc extends Activity {

    public WebView andelA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        andelA = (WebView) findViewById(R.id.andelA);
        andelA.setWebViewClient(new WebViewClient()
        {
            @Override public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error)
            {
                handler.proceed();
            }
        });


        andelA.getSettings().getJavaScriptEnabled();
        andelA.loadUrl("https://andela.com/alc/");

    }
}
