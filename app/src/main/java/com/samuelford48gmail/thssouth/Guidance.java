package com.samuelford48gmail.thssouth;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;



public class Guidance extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guidance);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_guidance);
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
                        startActivity(new Intent(getApplicationContext(), Sports.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_guidance:
                        return true;
                    case R.id.nav_forms:
                        startActivity(new Intent(getApplicationContext(), Forms.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
        ListView lv = findViewById(R.id.listview);

        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Ms.Harden (A-Cl)");
        arrayList.add("Mr.Harden (C0-G)");
        arrayList.add("Mrs.Trench (H-L)");
        arrayList.add("Mrs.Compton (M-Ri)");
        arrayList.add("Mrs.Tracy (Ro-Sn)");
        arrayList.add("Mr.Waugh (S0-z)");
        arrayList.add("Mrs.Callahan (JAG)");


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
                if (item.equals("Ms.Harden (A-Cl)")) {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Guidance.this);
                    //builder.setIcon(R.drawable.open_browser);
                    builder.setTitle("          OPEN URL?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            goToUrl("https://docs.google.com/forms/d/e/1FAIpQLSePsqIw9Rz0kNAt-89dTBVmx93MP0xMPt7Xcbw-DwWJ1-0KSA/viewform");
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
                if (item.equals("Mr.Harden (C0-G)")) {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Guidance.this);
                    //builder.setIcon(R.drawable.open_browser);
                    builder.setTitle("          OPEN URL?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            goToUrl("https://docs.google.com/forms/d/e/1FAIpQLSePsqIw9Rz0kNAt-89dTBVmx93MP0xMPt7Xcbw-DwWJ1-0KSA/viewform");
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
                if (item.equals("Mrs.Trench (H-L)")) {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Guidance.this);
                    // builder.setIcon(R.drawable.open_browser);
                    builder.setTitle("          OPEN URL?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            goToUrl("https://docs.google.com/forms/d/e/1FAIpQLSePsqIw9Rz0kNAt-89dTBVmx93MP0xMPt7Xcbw-DwWJ1-0KSA/viewform");
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

                if (item.equals("Mrs.Compton (M-Ri)")) {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Guidance.this);
                    //builder.setIcon(R.drawable.open_browser);
                    builder.setTitle("          OPEN URL?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            goToUrl("https://docs.google.com/forms/d/e/1FAIpQLSePsqIw9Rz0kNAt-89dTBVmx93MP0xMPt7Xcbw-DwWJ1-0KSA/viewform");
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

                if (item.equals("Mrs.Tracy (Ro-Sn)")) {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Guidance.this);
                    // builder.setIcon(R.drawable.open_browser);
                    builder.setTitle("          OPEN URL?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            goToUrl("https://docs.google.com/forms/d/e/1FAIpQLSePsqIw9Rz0kNAt-89dTBVmx93MP0xMPt7Xcbw-DwWJ1-0KSA/viewform");
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

                if (item.equals("Mr.Waugh (Sm-z)")) {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Guidance.this);
                    // builder.setIcon(R.drawable.open_browser);
                    builder.setTitle("          OPEN URL?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            goToUrl("https://docs.google.com/forms/d/e/1FAIpQLSePsqIw9Rz0kNAt-89dTBVmx93MP0xMPt7Xcbw-DwWJ1-0KSA/viewform");
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
                if (item.equals("Mrs.Callahan (JAG)")) {
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Guidance.this);
                    // builder.setIcon(R.drawable.open_browser);
                    builder.setTitle("          OPEN URL?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            goToUrl("https://docs.google.com/forms/d/e/1FAIpQLSePsqIw9Rz0kNAt-89dTBVmx93MP0xMPt7Xcbw-DwWJ1-0KSA/viewform");
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
