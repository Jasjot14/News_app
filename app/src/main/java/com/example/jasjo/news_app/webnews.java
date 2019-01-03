package com.example.jasjo.news_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class webnews extends AppCompatActivity {
    WebView webView;


    void initViews(){
        webView = findViewById(R.id.webView);

        WebViewClient client = new WebViewClient();
        webView.setWebViewClient(client);

        webView.getSettings().setJavaScriptEnabled(true);
        Intent rcv = getIntent();

        //String position=rcv.getStringExtra("position");
        int position=rcv.getIntExtra("position",0);
         if (position == 0) {
             getSupportActionBar().setTitle("AAj Tak");
             webView.loadUrl("https://aajtak.intoday.in/");
         }else if (position==1)
        {   getSupportActionBar().setTitle("Zee News");
            webView.loadUrl("http://zeenews.india.com/");
        }
        else if (position == 2) {
             getSupportActionBar().setTitle("News18");
            webView.loadUrl("https://www.news18.com/");
        }
        else if (position == 3) {
             getSupportActionBar().setTitle("DD News");
            webView.loadUrl("http://ddnews.gov.in/");
        }
        else if (position == 4) {
             getSupportActionBar().setTitle("NDTV");
            webView.loadUrl("https://www.ndtv.com/");
        }

        //getSupportActionBar().hide();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webnews);
        initViews();
    }
}
