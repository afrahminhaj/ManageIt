package com.example.manageit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.Selection);
        TabItem tabLabs = findViewById(R.id.tabLabs);
        TabItem tabSeminarHalls = findViewById(R.id.tabSeminarHalls);
        TabItem tabFaculty = findViewById(R.id.tabFaculty);
        final ViewPager viewPager = findViewById(R.id.viewPager);
        PagerAdapter pagerAdapter = new
                PagerAdapter(getSupportFragmentManager(),
                    tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);


        //changing the tab view when tab is selected or changed
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }

}
