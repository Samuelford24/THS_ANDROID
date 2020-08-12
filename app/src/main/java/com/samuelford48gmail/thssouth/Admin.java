package com.samuelford48gmail.thssouth;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Admin extends AppCompatActivity {
    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
        ListView lv = findViewById(R.id.listview_admin);


        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Delays");
        arrayList.add("Announcements");
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
                switch (item) {
                    case "Delays":
                        startActivity(new Intent(Admin.this, Admin_delays.class));
                        break;
                    case "Announcements":
                        startActivity(new Intent(Admin.this, Admin_announcements.class));
                        break;
                    case "Dr.Rowshandel":
                        startActivity(new Intent(Admin.this, Admin_dr_haworth.class));
                        break;
                    case "Sports":
                        startActivity(new Intent(Admin.this, Admin_sports.class));
                        break;
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

*/
}