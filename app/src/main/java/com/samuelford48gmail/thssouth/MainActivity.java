package com.samuelford48gmail.thssouth;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    final Fragment fragment1 = new HomeFragment();
    final Fragment fragment2 = new Announcements();
    final Fragment fragment3 = new Guidance();
    final Fragment fragment4 = new Forms();
    final Fragment fragment5 = new Sports();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragment1;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    // mTextMessage.setText(R.string.title_home);
                    fm.beginTransaction().hide(active).show(fragment1).commit();

                    active = fragment1;
                    fm.popBackStack();
                    return true;
                case R.id.nav_announcements:
                    // mTextMessage.setText(R.string.title_dashboard);
                    fm.beginTransaction().hide(active).show(fragment2).commit();
                    active = fragment2;
                    fm.popBackStack();
                    return true;
                case R.id.nav_guidance:
                    //mTextMessage.setText(R.string.title_notifications);
                    fm.beginTransaction().hide(active).show(fragment3).commit();
                    active = fragment3;
                    fm.popBackStack();
                    return true;
                case R.id.nav_forms:
                    //mTextMessage.setText(R.string.title_notifications);
                    fm.beginTransaction().hide(active).show(fragment4).commit();
                    active = fragment4;
                    fm.popBackStack();
                    return true;
                case R.id.nav_sports:
                    //mTextMessage.setText(R.string.title_notifications);
                    fm.beginTransaction().hide(active).show(fragment5).commit();
                    active = fragment5;
                    fm.popBackStack();
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fm.beginTransaction().add(R.id.main_container, fragment5, "5").hide(fragment5).commit();
        fm.beginTransaction().add(R.id.main_container, fragment4, "4").hide(fragment4).commit();
        fm.beginTransaction().add(R.id.main_container, fragment3, "3").hide(fragment3).commit();
        fm.beginTransaction().add(R.id.main_container, fragment2, "2").hide(fragment2).commit();
        fm.beginTransaction().add(R.id.main_container, fragment1, "1").commit();

    }
}




