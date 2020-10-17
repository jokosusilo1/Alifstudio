package com.alifstudio.mustikaiman;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.alifstudio.mustikaiman.Fragment.FragmentAmalan;
import com.alifstudio.mustikaiman.Fragment.FragmentIkda;
import com.alifstudio.mustikaiman.Fragment.FragmentLaporan;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import com.alifstudio.mustikaiman.MyAdapter.TabSetup;
import com.google.android.material.navigation.NavigationView;
import android.view.MenuItem;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import android.view.Menu;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

  ActionBarDrawerToggle toggle;
    private DrawerLayout drawer;
    private NavigationView nav;
    private TabLayout tabs;
    private ViewPager vr;
    
   private String LOG_TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG,"Create");
		
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            
        }
        vr=findViewById(R.id.viewpager);
        setupViewPage(vr);
        tabs=findViewById(R.id.tabs);
        tabs.setupWithViewPager(vr);
        drawer=findViewById(R.id.drawer_layout);
         toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();;
        
        nav=findViewById(R.id.nav_view);
        nav.setNavigationItemSelectedListener(this);
        
    }
public void setupViewPage(ViewPager vr){
    TabSetup adapter=new TabSetup(getSupportFragmentManager());
    adapter.addFragment(new FragmentIkda(),"IKDA");
    adapter.addFragment(new FragmentAmalan(),"Amalan");
    adapter.addFragment(new FragmentLaporan(),"Laporan");
    vr.setAdapter(adapter);
    
}  
    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)
        ){
            drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }       
        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    
    
}
