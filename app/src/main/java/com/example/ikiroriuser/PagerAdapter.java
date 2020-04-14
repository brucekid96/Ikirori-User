package com.example.ikiroriuser;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter  extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm , int NumberOfTabs) {

        super(fm);
        this.mNoOfTabs= NumberOfTabs;

    }
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Events events = new Events();
                return events;
            case 1:
                Explorer explorer = new Explorer();
                return explorer;
            case 2:
                Organizers organizers= new Organizers();
                return organizers;

            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
