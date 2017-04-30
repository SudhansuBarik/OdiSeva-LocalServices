package com.example.mypc.odiseva_localservices;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPc on 08-Oct-16.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    /**
     * @return returns the total number of pages
     */
    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFrag(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    /**
     * Return the Tab Titles
     *
     * @param position defines the position of each page.
     * @return tabTitles[position] returns the particular Title for the Tab in that position.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return mFragmentTitleList.get(position);
    }
}
