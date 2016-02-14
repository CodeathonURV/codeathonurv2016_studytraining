package cat.urv.studytraining.studytraining;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import cat.urv.studytraining.studytraining.fragments.GlobalScoreFragment;
import cat.urv.studytraining.studytraining.fragments.HomeFragment;
import cat.urv.studytraining.studytraining.fragments.InformationFragment;
import cat.urv.studytraining.studytraining.fragments.ScoreBoardFragment;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, HomeFragment.OnFragmentInteractionListener, GlobalScoreFragment.OnFragmentInteractionListener, InformationFragment.OnFragmentInteractionListener, ScoreBoardFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FrameLayout content = (FrameLayout) this.findViewById(R.id.content_fragment);
        if (content != null)
        {
             HomeFragment homeFragment = new HomeFragment();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.content_fragment, homeFragment).commit();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.navigation, menu);
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

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        FrameLayout content = (FrameLayout) this.findViewById(R.id.content_fragment);
        if (content != null) {

            int id = item.getItemId();

            if (id == R.id.nav_home) {
                HomeFragment homeFragment = new HomeFragment();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_fragment, homeFragment).commit();

            }else if (id == R.id.nav_globalscore) {
                GlobalScoreFragment globalFragment = new GlobalScoreFragment();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_fragment, globalFragment).commit();
            } else if (id == R.id.nav_info) {
                InformationFragment infoFragment = new InformationFragment();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_fragment, infoFragment).commit();
            } else if (id == R.id.nav_infoscore) {
                ScoreBoardFragment scoreFragment = new ScoreBoardFragment();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_fragment, scoreFragment).commit();
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}