package com.example.implicitintent;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tablay;
    TabItem webview,mapview;
    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();


    }

    private void initializeViews() {
    tablay = findViewById(R.id.tablay);
    webview = findViewById(R.id.webview_button);
    mapview = findViewById(R.id.mapview_button);
    vp = findViewById(R.id.viewpager);

        PagerAdapter pa=new PagerAdapter(getSupportFragmentManager(),tablay.getTabCount());
        vp.setAdapter(pa);

        // It is used to join TabLayout with ViewPager.
        tablay.setupWithViewPager(vp);

    }
}