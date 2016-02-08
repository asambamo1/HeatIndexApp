package com.application.asam.conversion.Activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.application.asam.conversion.Fragments.Heat__Index;
import com.application.asam.conversion.Fragments.Unit__Conversion;
import com.application.asam.conversion.Fragments.Wind__Chill;
import com.application.asam.conversion.R;

import net.yanzm.mth.MaterialTabHost;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

public class HeatIndexAppTabHost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heat_index_app_tab_host);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setElevation(0);
        }

        MaterialTabHost tabHost = (MaterialTabHost) findViewById(android.R.id.tabhost);
        tabHost.setType(MaterialTabHost.Type.FullScreenWidth);

        SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        for (int i = 0; i < pagerAdapter.getCount(); i++) {
            tabHost.addTab(pagerAdapter.getPageTitle(i));
        }

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOnPageChangeListener(tabHost);

        tabHost.setOnTabChangeListener(new MaterialTabHost.OnTabChangeListener() {
            @Override
            public void onTabSelected(int position) {
                viewPager.setCurrentItem(position);
            }
        });
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a Heat__Index (defined as a static inner class below).
            switch (position) {
                case 0:
                    return Heat__Index.newInstance(position + 1);
                case 1:
                    return Wind__Chill.newInstance(position + 2);
                case 2:
                    return Unit__Conversion.newInstance(position + 3);
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_section1).toUpperCase(l);
                case 1:
                    return getString(R.string.title_section2).toUpperCase(l);
                case 2:
                    return getString(R.string.title_section3).toUpperCase(l);
            }
            return null;
        }
    }
}