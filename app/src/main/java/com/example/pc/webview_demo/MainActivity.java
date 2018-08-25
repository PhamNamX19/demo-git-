package com.example.pc.webview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b3 khởi tạo
        webView=findViewById(R.id.id_webView);

        //b4 xử lý hiện được 1 web view

        webView.loadUrl("http://butraco.vn");

        //muốn nhứng cả webview vào trong ứng dụng
        webView.setWebViewClient(new WebViewClient());
    }
}
