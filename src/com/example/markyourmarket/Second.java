package com.example.markyourmarket;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Second extends Activity{

	WebView w1;
	String xzhibit;
	String s;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		
		Bundle extras = getIntent().getExtras();
		if(extras!=null)
			{
			s=extras.getString("url");
			}
		
		
	
		
		w1=(WebView)findViewById(R.id.webView1);
		
		w1.loadUrl(s);
		w1.setWebViewClient(new WebViewClient());
		
			}
}
