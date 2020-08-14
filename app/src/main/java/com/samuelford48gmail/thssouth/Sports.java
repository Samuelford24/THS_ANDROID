package com.samuelford48gmail.thssouth;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class Sports extends Fragment implements View.OnClickListener {
    private ImageButton one, two, three, four, five, six, seven, eight;
    private String sport;

    public Sports() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sports, container, false);


        one = view.findViewById(R.id.left_r1);
        two = view.findViewById(R.id.left_r2);
        three = view.findViewById(R.id.left_r3);
        four = view.findViewById(R.id.right_r1);
        five = view.findViewById(R.id.right_r2);
        six = view.findViewById(R.id.right_r3);
        //   seven = (ImageButton) findViewById(R.id.left_r3);
        // eight = (ImageButton) findViewById(R.id.right_r3);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        //  seven.setOnClickListener(this);
        //eight.setOnClickListener(this);
        /*
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_sports);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_announcements:
                        startActivity(new Intent(getApplicationContext(), Announcements.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_sports:
                        return true;
                    case R.id.nav_guidance:
                        startActivity(new Intent(getApplicationContext(), Guidance.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_forms:
                        startActivity(new Intent(getApplicationContext(), Forms.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
*/
        return view;
    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.left_r1:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "Boys_bball";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.left_r2:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "Boys_swimming";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.left_r3:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "Wrestling";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.right_r1:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "Girls_bball";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.right_r2:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "Girls_swimming";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.right_r3:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "Bowling";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            default:
                break;
        }
    }

}
