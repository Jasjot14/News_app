package com.example.jasjo.news_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class webnews extends AppCompatActivity {
    WebView webView;

int position;
    void initViews(){
        webView = findViewById(R.id.webView);

        WebViewClient client = new WebViewClient();
        webView.setWebViewClient(client);

        webView.getSettings().setJavaScriptEnabled(true);
        Intent rcv = getIntent();
        String news=rcv.getStringExtra("news");
         position = rcv.getIntExtra("position",0);

         switch (position){
             case 0: webView.loadUrl("https://aajtak.intoday.in/");
             break;

             case 1: webView.loadUrl("http://zeenews.india.com/");
             break;

             case 2:  webView.loadUrl("https://www.news18.com/");
                 break;

             case 3: webView.loadUrl("http://ddnews.gov.in/");
                 break;

             case 4:  webView.loadUrl("https://www.ndtv.com/");
                 break;
         }




        //getSupportActionBar().setTitle("NDTV");
        //getSupportActionBar().hide();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webnews);
        initViews();
    }
}
