package com.example.manageit;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numOfTabs;


    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new LabsFragment();
            case 1:
                return new SeminarHallsFragment();
            case 2:
                return new FacultyFragment();
            default:
                return null;
        }

    }


    @Override
    public int getCount(){
        return numOfTabs;
    }
}
