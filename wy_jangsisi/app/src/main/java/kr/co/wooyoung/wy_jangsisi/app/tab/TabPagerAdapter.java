package kr.co.wooyoung.wy_jangsisi.app.tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.Arrays;
import java.util.List;

import kr.co.wooyoung.wy_jangsisi.app.completecartoon.FragmentCompleteCartoon;
import kr.co.wooyoung.wy_jangsisi.app.unfinishedcartoon.FragmentUnfinishedCartoon;

/**
 * Created by owner on 2016-11-25.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> fragments = Arrays.asList(new FragmentCompleteCartoon(), new FragmentUnfinishedCartoon());

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
