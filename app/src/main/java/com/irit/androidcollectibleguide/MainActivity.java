package com.irit.androidcollectibleguide;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

import com.irit.androidcollectibleguide.adapters.ExpandableListViewAdapter;
import com.irit.androidcollectibleguide.bugdroids.BugdroidContainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Nicolas on 22/06/2014.
 */
public class MainActivity extends Activity{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    private CharSequence mDrawerTitle;
    private CharSequence mTitle;

    public static boolean mActionModeIsActive = false;
    public static boolean mBackWasPressedInActionMode = false;

    private ExpandableListView mSeriesExpandableListView;
    private ExpandableListView mUserSeriesExpandableListView;
    private ListView mSpecialSeriesDrawerListView;

    public static BugdroidContainer mBugdroidContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        /*Setup the NavigationDrawer and the ActionBar*/
        mTitle=mDrawerTitle = getTitle();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);

        initNavigationDrawer();

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                R.drawable.ic_drawer,  /* nav drawer image to replace 'Up' caret */
                R.string.navigation_drawer_open,  /* "open drawer" description for accessibility */
                R.string.navigation_drawer_close  /* "close drawer" description for accessibility */
        ) {
            public void onDrawerClosed(View view) {
                getActionBar().setTitle(mTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            public void onDrawerOpened(View drawerView) {
                getActionBar().setTitle(mDrawerTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getActionBar().setTitle(mTitle);
    }

    /**
     * When using the ActionBarDrawerToggle, you must call it during
     * onPostCreate() and onConfigurationChanged()...
     */

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggls
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    /*To show the drawer by clicking the app icon*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Pass the event to ActionBarDrawerToggle, if it returns
        // true, then it has handled the app icon touch event
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {

        mBackWasPressedInActionMode = mActionModeIsActive && event.getKeyCode() == KeyEvent.KEYCODE_BACK;
        return super.dispatchKeyEvent(event);

    }

    private void initNavigationDrawer() {

        mSeriesExpandableListView = (ExpandableListView) findViewById(R.id.series_expandables_list_view);
        mUserSeriesExpandableListView = (ExpandableListView) findViewById(R.id.user_series_expandable_list_view);
        mSpecialSeriesDrawerListView = (ListView) findViewById(R.id.drawer_list_view);

        String[] specialSeriesTitles = {getString(R.string.big_box_edition),getString(R.string.lucky_cats_series),
                                       getString(R.string.google_edition),getString(R.string.special_edition),
                                       getString(R.string.artist_proof_edition)};
        String regularSeriesTitle = getString(R.string.regular_series);
        String userSeriesTitle = getString(R.string.user_edition);

        HashMap<String,List<String>> regularSeriesMappedTitles = new HashMap<String, List<String>>();
        HashMap<String,List<String>> userSeriesMappedTitles = new HashMap<String, List<String>>();

        ArrayList<String> regularSeriesTitles = new ArrayList<String>();
        ArrayList<String> userSeriesTitles = new ArrayList<String>();

        regularSeriesTitles.add(getString(R.string.series_one));
        regularSeriesTitles.add(getString(R.string.series_two));
        regularSeriesTitles.add(getString(R.string.series_three));
        regularSeriesTitles.add(getString(R.string.series_four));

        userSeriesTitles.add(getString(R.string.user_collection));
        userSeriesTitles.add(getString(R.string.user_wishlist));

        regularSeriesMappedTitles.put(regularSeriesTitle,regularSeriesTitles);
        userSeriesMappedTitles.put(userSeriesTitle,userSeriesTitles);

        //ADAPTERS
        mSeriesExpandableListView.setAdapter(new ExpandableListViewAdapter(getLayoutInflater(),regularSeriesTitle,regularSeriesMappedTitles));
        mUserSeriesExpandableListView.setAdapter(new ExpandableListViewAdapter(getLayoutInflater(),userSeriesTitle,userSeriesMappedTitles));
        mSpecialSeriesDrawerListView.setAdapter(new ArrayAdapter<String>(this,R.layout.drawer_list_view_item,specialSeriesTitles));
        final Context context = this;
        mSeriesExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Toast.makeText(context,"Click",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
