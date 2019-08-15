package com.samuelford48gmail.thssouth;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.geofire.GeoFire;
import com.firebase.geofire.GeoLocation;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class Admin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
        ListView lv = (ListView) findViewById(R.id.listview_admin);


        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Events");
        arrayList.add("Delays");
        arrayList.add("Announcements");
        arrayList.add("Add a tutor");
        arrayList.add("View tutors that have registered");
        arrayList.add("Dr.Rowshandel");
        arrayList.add("Sports");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                arrayList);

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = ((TextView) view).getText().toString();
                if (item.equals("Events")) {
                    Intent intent = new Intent(Admin.this, Admin_events.class);
                    startActivity(intent);
                }
                if (item.equals("Delays")) {
                    Intent intent = new Intent(Admin.this, Admin_delays.class);
                    startActivity(intent);
                }
                if (item.equals("Announcements")) {
                    Intent intent = new Intent(Admin.this, Admin_announcements.class);
                    startActivity(intent);
                }
                if (item.equals("Add a tutor")) {
                    Intent intent = new Intent(Admin.this, Admin_add_tutor.class);
                    startActivity(intent);
                }
                if (item.equals("View tutors that have registered")) {
                    Intent intent = new Intent(Admin.this, Admin_view_tutors.class);
                    startActivity(intent);
                }
                if (item.equals("Dr.Rowshandel")) {
                    Intent intent = new Intent(Admin.this, Admin_dr_haworth.class);
                    startActivity(intent);
                }
                if (item.equals("Sports")) {
                    Intent intent = new Intent(Admin.this, Admin_sports.class);
                    startActivity(intent);
                }
            }
            /// private void goToUrl (String url) {
            //  Uri uriUrl = Uri.parse(url);
            // Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            //startActivity(launchBrowser);
            // Toast.makeText(getApplicationContext(),"Loading...",
            //         Toast.LENGTH_LONG).show();
            //        Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();

            //}
        });
    }


}
