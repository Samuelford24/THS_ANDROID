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

public class Guidance extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guidance);
        ListView lv = (ListView) findViewById(R.id.listview);


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
