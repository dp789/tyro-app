package com.example.deepak.tyroapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting the communication of adapter with the viewpager

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Adding the fragments

        adapter.AddFragment(new HomeFragment (),"HOME");
        adapter.AddFragment(new RegisterFragment (),"REGISTER");
        adapter.AddFragment(new AboutFragment (),"ABOUT");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);





        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Using the floating action button to display the bottom sheet
     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creating the dialog object
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
                //communicating with the layout of the bottom sheet
                View parentView = getLayoutInflater().inflate(R.layout.bottom_sheet_dialog,null);
                //setting the content view
                bottomSheetDialog.setContentView(parentView);
                //behaviour object of bottom sheet
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View) parentView.getParent());
                //setting the max hight of bottom sheet
                bottomSheetBehavior.setPeekHeight(
                        (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                                400,
                                getResources().getDisplayMetrics())
                );
                //display the bottom sheet
                bottomSheetDialog.show();

            }
        });

        */



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_movies) {
            //Toast.makeText(getApplicationContext(),"Add Functionality",Toast.LENGTH_SHORT).show();
            viewPager.setCurrentItem(0);

        } else if (id == R.id.nav_books) {
            //Toast.makeText(getApplicationContext(),"Add Functionality",Toast.LENGTH_SHORT).show();
            viewPager.setCurrentItem(1);

        } else if (id == R.id.nav_music) {
            //Toast.makeText(getApplicationContext(),"Add Functionality",Toast.LENGTH_SHORT).show();
            viewPager.setCurrentItem(2);

        } else if (id == R.id.nav_share) {

            Toast.makeText(getApplicationContext(),"Add Functionality",Toast.LENGTH_SHORT).show();

        }





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
