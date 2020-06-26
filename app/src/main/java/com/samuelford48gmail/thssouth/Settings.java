package com.samuelford48gmail.thssouth;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samuelford on 5/24/18.
 */

public class Settings extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        ListView lv = (ListView) findViewById(R.id.listview_settings);


        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Questions?");
        arrayList.add("Feedback/Errors");
        arrayList.add("Have coding experience?");
        arrayList.add("Version 1.9");
        arrayList.add("Privacy Policy/Terms and Conditions");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                arrayList);

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            int i = 0;

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = ((TextView) view).getText().toString();
                if (item.equals("Questions?")) {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Settings.this);
                    builder.setIcon(R.drawable.email);
                    builder.setTitle("EMAIL US")
                            .setMessage("svhsdev@vigoschools.org?");
                    builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
                    builder.setCancelable(true);
                    builder.show();
                }
                if (item.equals("Feedback/Errors")) {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Settings.this);
                    builder.setTitle("          OPEN URL?");
                    //builder.setIcon(R.drawable.open_browser);
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            goToUrl("https://docs.google.com/forms/d/e/1FAIpQLSfDRCQgIzQLFza1wOq6wW8OEAuaXvbsXI8sicGPlMGzfHwQlA/viewform?usp=sf_link");
                        }
                    });
                    builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
                    builder.setCancelable(true);
                    builder.show();
                }
                if (item.equals("Privacy Policy/Terms and Conditions")) {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Settings.this);
                    builder.setTitle("          OPEN URL?");
                    //builder.setIcon(R.drawable.open_browser);
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            goToUrl("https://goo.gl/forms/gnkBrsmSbUxWdY3s2");
                        }
                    });
                    builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
                    builder.setCancelable(true);
                    builder.show();
                }
                if (item.equals("Have coding experience?")) {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Settings.this);
                    builder.setIcon(R.drawable.email);
                    builder.setTitle("EMAIL US")
                            .setMessage("svhsdev@vigoschools.org?");
                    builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
                    builder.setCancelable(true);
                    builder.show();
                }
                if (item.equals("Version 1.7")) {

                    i++;
                    if (i >= 10) {

                        Intent myIntent = new Intent(Settings.this, Admin.class);
                        startActivity(myIntent);
                    }
                }
            }

            private void goToUrl(String url) {
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
                Toast.makeText(getApplicationContext(), "Loading...",
                        Toast.LENGTH_LONG).show();
//                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();

            }
        });
    }
}

