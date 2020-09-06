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
import android.widget.Button;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class Sports extends Fragment implements View.OnClickListener {
    private Button one, two, three, four, five, six, seven, eight;
    private String sport;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sports, container, false);
        one = view.findViewById(R.id.girls_cc_btn);
        two = view.findViewById(R.id.boys_cc_btn);
        three = view.findViewById(R.id.boys_football_btn);
        four = view.findViewById(R.id.boys_soccer_btn);
        five = view.findViewById(R.id.girls_volleyball_btn);
        six = view.findViewById(R.id.girls_soccer_btn);
        seven = view.findViewById(R.id.girls_golf_btn);
        eight = view.findViewById(R.id.boys_tennis_btn);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);

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
            case R.id.girls_cc_btn:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "GCC";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.boys_cc_btn:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "BCC";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.boys_football_btn:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "Football";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.boys_soccer_btn:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "BSoccer";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.girls_volleyball_btn:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "Volleyball";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.girls_golf_btn:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "GGolf";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.girls_soccer_btn:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "GSoccer";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.boys_tennis_btn:
                i = new Intent(getContext(), Girls_tennis.class);
                sport = "BTennis";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            default:
                break;
        }
    }

}
