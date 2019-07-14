package com.julius.alc4phase1;



import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;



import androidx.appcompat.app.AppCompatActivity;


public class ActivityB extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);



        final WebView webview = findViewById(R.id.webpage);

        webview.setWebViewClient(new WebViewClient() {
                                     @Override
                                     public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                                         handler.proceed();
                                     }
                                 });

            WebSettings setting = webview.getSettings();
        setting.setJavaScriptEnabled(true);
        webview.loadUrl("https://andela.com/alc/");



    }


}
