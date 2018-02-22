package kienatthakan.snru.ac.th.emercallkie;

import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import kienatthakan.snru.ac.th.emercallkie.fragment.HospifalFragment;
import kienatthakan.snru.ac.th.emercallkie.fragment.MainFragment;


public class MainActivity extends AppCompatActivity {

    //    Explicit
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Police Controller
        TextView policeTextView = findViewById(R.id.txtPolice);
        policeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contentMainFragment,new MainFragment()).commit();
                drawerLayout.closeDrawers();
            }
        });


//        Hospital Controller
        TextView hospitalTextView = findViewById(R.id.txtHospital);
        hospitalTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contentMainFragment,new HospifalFragment()).commit();
                drawerLayout.closeDrawers();
            }
        });



//        Insurance Controller
        TextView insuranceTextView = findViewById(R.id.txtInsurance);
        insuranceTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contentMainFragment,new MainFragment()).commit();
                drawerLayout.closeDrawers();
            }
        });

//        Exit Controller
        TextView ExitTextView = findViewById(R.id.txtExit);
        ExitTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contentMainFragment,new MainFragment()).commit();
                drawerLayout.closeDrawers();

            }
        });


//        Create Toolbar
        Toolbar toolbar = findViewById(R.id.toolbarMain);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerLayout = findViewById(R.id.DrawerLayoutMain);
        actionBarDrawerToggle = new ActionBarDrawerToggle(
                MainActivity.this,
                drawerLayout,
                R.string.open,
                R.string.close
        );
        drawerLayout.setDrawerListener(actionBarDrawerToggle);


//        Add Fragment
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment()).commit();

        }


    }   // Main Method

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        actionBarDrawerToggle.onConfigurationChanged(newConfig);

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        actionBarDrawerToggle.syncState();

    }
}   // Main Class