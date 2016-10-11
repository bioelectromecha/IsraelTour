package roman.com.israeltour.activities;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import roman.com.israeltour.R;
import roman.com.israeltour.fragments.FoodFragment;
import roman.com.israeltour.fragments.HelloFragment;
import roman.com.israeltour.fragments.HistoryFragment;
import roman.com.israeltour.fragments.PersonsFragment;
import roman.com.israeltour.fragments.PlacesFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //holds the current fragment's id
    private int mFragmentId = 0;
    private static final String KEY_FRAGMENT = "FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if(savedInstanceState == null){
            Fragment foreGroundFragment = new HelloFragment();
            mFragmentId = foreGroundFragment.getId();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.fragment_holder, foreGroundFragment);
            fragmentTransaction.commit();
        }else{
            Fragment foreGroundFragment = (Fragment) getFragmentManager().findFragmentById(savedInstanceState.getInt(KEY_FRAGMENT));
        }

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_FRAGMENT,mFragmentId);
    }

    public void onClickPlaces(MenuItem item){
        Fragment placesFragment = new PlacesFragment();
        mFragmentId = placesFragment.getId();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder, placesFragment);
        fragmentTransaction.commit();
    }

    public void onClickFoods(MenuItem item) {
        Fragment foodFragment = new FoodFragment();
        mFragmentId = foodFragment.getId();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder, foodFragment);
        fragmentTransaction.commit();
    }

    public void onClickPeople(MenuItem item) {
        Fragment personsFragment = new PersonsFragment();
        mFragmentId = personsFragment.getId();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder, personsFragment);
        fragmentTransaction.commit();
    }

    public void onClickHistory(MenuItem item) {
        Fragment historyFragment = new HistoryFragment();
        mFragmentId = historyFragment.getId();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_holder, historyFragment);
        fragmentTransaction.commit();
    }
}
