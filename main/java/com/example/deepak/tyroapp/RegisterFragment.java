package com.example.deepak.tyroapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URLEncoder;
import java.util.List;

public class RegisterFragment extends Fragment {

    WebView w;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate ( R.layout.activity_registerfragmeny , container , false );

        w = (WebView) view.findViewById ( R.id.webview );
        w.setWebViewClient ( new CallBack () );
        w.loadUrl ( "https://goo.gl/forms/4q5Ngx8xondwuPnT2" );
        w.getSettings ().setJavaScriptEnabled ( true );




        return view;
    }

   class CallBack extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view , String url) {
            return (false);
        }

    }




}
