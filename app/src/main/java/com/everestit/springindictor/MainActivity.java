package com.everestit.springindictor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.everestit.springlibrary.SpringIndicator;
import com.everestit.springlibrary.viewpager.ScrollerViewPager;

public class MainActivity extends AppCompatActivity {

    ScrollerViewPager viewPager;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ScrollerViewPager) findViewById(R.id.view_pager);
        SpringIndicator springIndicator = (SpringIndicator) findViewById(R.id.indicator);
        adapter = new CustomAdapter(this);
        viewPager.setAdapter(adapter);
        viewPager.fixScrollSpeed();

        // just set viewPager
        springIndicator.setViewPager(viewPager);

    }



}
