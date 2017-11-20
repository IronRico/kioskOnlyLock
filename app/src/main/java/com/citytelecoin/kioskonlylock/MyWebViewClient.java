package com.citytelecoin.kioskonlylock;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient{
	@Override
	public boolean shouldOverrideUrlLoading(WebView view, String url) {

		view.loadUrl(url);

		//Doesn't allow Chrome to open during navigation
		return true;
	}
}