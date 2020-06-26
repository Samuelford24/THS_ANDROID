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

/**
 * Created by samuelford on 5/24/18.
 */

public class Tutoring extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutoring);

        ListView lv = (ListView) findViewById(R.id.listview_tutoring);


        List<String> arrayList = new ArrayList<String>();
        arrayList.add("View Tutors");
        arrayList.add("Register to be a tutor");


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
                if (item.equals("View Tutors")) {
                    Intent intent = new Intent(Tutoring.this, View_tutors.class);
                    startActivity(intent);
                }
                if (item.equals("Register to be a tutor")) {
                    Intent intent = new Intent(Tutoring.this, Register_tutors.class);
                    startActivity(intent);
                }
            }

        });
    }
}