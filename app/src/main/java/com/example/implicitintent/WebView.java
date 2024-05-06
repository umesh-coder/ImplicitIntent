package com.example.implicitintent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WebView#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WebView extends Fragment {

    android.webkit.WebView webView;
    View view;

    TextView link;
    Button open_link;

    TextView t1;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WebView() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WebView.
     */
    // TODO: Rename and change types and number of parameters
    public static WebView newInstance(String param1, String param2) {
        WebView fragment = new WebView();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



        initializeviews();
    }

    private void initializeviews() {



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        view =  inflater.inflate(R.layout.fragment_web_view, container, false);

        webView =view.findViewById(R.id.web);
        link = view.findViewById(R.id.link);
        open_link= view.findViewById(R.id.open_link);

        open_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                webView.loadUrl(link.getText().toString().trim());

                webView.getSettings().setJavaScriptEnabled(true);

                webView.setWebViewClient(new WebViewClient());
            }
        });




        return view;
    }
}