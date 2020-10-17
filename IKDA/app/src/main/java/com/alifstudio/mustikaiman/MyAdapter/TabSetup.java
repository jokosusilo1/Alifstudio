package com.alifstudio.mustikaiman.MyAdapter;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import androidx.fragment.app.FragmentManager;

public class TabSetup extends FragmentPagerAdapter {
private final List<Fragment>fragmentList=new ArrayList<>();
private final List<String>fragmentTitle=new ArrayList<>();
public TabSetup(FragmentManager mFragment){
    
    super(mFragment);
}
    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public Fragment getItem(int posisi) {
        return fragmentList.get(posisi);
    }
    
    public void addFragment(Fragment mFragment ,String str){
        fragmentList.add(mFragment);
        fragmentTitle.add(str);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
    
    
    


}
