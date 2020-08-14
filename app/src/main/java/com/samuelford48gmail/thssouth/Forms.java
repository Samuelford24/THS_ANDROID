package com.samuelford48gmail.thssouth;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

/**
 * all two hour delay related objects and methods may be added later
 * do not delete them!
 */
public class Forms extends Fragment {
    Bitmap map;
    Bitmap schedule;

    // Bitmap twohourdelay;
    public Forms() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.forms, container, false);



       /* BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_forms);
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
                        startActivity(new Intent(getApplicationContext(), Guidance.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_forms:
                        return true;
                }
                return false;
                */


        ListView lv = (ListView) view.findViewById(R.id.listview_forms);


        List<String> arrayList = new ArrayList<String>();
        arrayList.add("School Map");
        arrayList.add("Schedules");
        arrayList.add("Physical Form");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getContext(),
                android.R.layout.simple_list_item_1,
                arrayList);

        lv.setAdapter(arrayAdapter);
        ActivityCompat.requestPermissions((Activity) getContext(), new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2909);
        Drawable drawable = getResources().getDrawable(R.drawable.school_map);
        Drawable drawable1 = getResources().getDrawable(R.drawable.schedule2020);
        //Drawable drawable3 = getResources().getDrawable(R.drawable.two_hour_delay);
        //  image = ((BitmapDrawable) drawable).getBitmap();
        schedule = ((BitmapDrawable) drawable1).getBitmap();
        map = ((BitmapDrawable) drawable).getBitmap();
        //twohourdelay = ((BitmapDrawable) drawable3).getBitmap();
        // final Bitmap schedule2020 = BitmapFactory.decodeResource( getResources(), R.drawable.schedule2020);
        //final Bitmap bm = BitmapFactory.decodeResource( getResources(), R.drawable.school_map);
        final String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = ((TextView) view).getText().toString();
                if (item.equals("School Map")) {
                    ActivityCompat.requestPermissions((Activity) getContext(), new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2909);
                    downloadFile();
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(getContext());
                    //builder.setIcon(R.drawable.open_browser);
                    builder.setTitle("Downloaded");
                    builder.setMessage(" Go to your Files and then to images");
                    builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.dismiss();
                                }
                            }
                    );

                    builder.setCancelable(true);
                    builder.show();
                }
                //need to see if permission request still shows
                if (item.equals("Schedules")) {
                    ActivityCompat.requestPermissions((Activity) getContext(), new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2909);
                    download_schedule();
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(getContext());
                    //builder.setIcon(R.drawable.open_browser);
                    builder.setTitle("Downloaded");
                    builder.setMessage(" Go to your Files and then to images");
                    builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });

                    builder.setCancelable(true);
                    builder.show();
                }
                /*if (item.equals("Two hour delay schedule")) {
                    ActivityCompat.requestPermissions(Forms.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2909);
                    download_2hdelay();
                    AlertDialog.Builder builder;
                    builder = new AlertDialog.Builder(Forms.this);
                    //builder.setIcon(R.drawable.open_browser);
                    builder.setTitle("Downloaded");
                    builder.setMessage(" Go to your Files and then to images");
                    builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });

                    builder.setCancelable(true);
                    builder.show();
*/
                if (item.equals("Physical Form")) {
                    goToUrl("https://s3-us-west-2.amazonaws.com/sportshub2-uploads-prod/files/sites/966/2018/05/15183822/18-19-Physical.pdf");

                }

            }
        });
        return view;
    }


    public void school_map(View view) {
        ActivityCompat.requestPermissions((Activity) getContext(), new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2909);
        downloadFile();
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(getContext());
        //builder.setIcon(R.drawable.open_browser);
        builder.setTitle("Downloaded");
        builder.setMessage(" Go to your Files and then to images");
        builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });

        builder.setCancelable(true);
        builder.show();
    }

    public void Schedules(View view) {
        ActivityCompat.requestPermissions((Activity) getContext(), new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2909);
        download_schedule();
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(getContext());
        //builder.setIcon(R.drawable.open_browser);
        builder.setTitle("Downloaded");
        builder.setMessage(" Go to your Files and then to images");
        builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });

        builder.setCancelable(true);
        builder.show();
    }

    //goToUrl("http://vigoschools.org/2018-2019_VCSC_Calendar.pdf");

    public void physical_form(View view) {
        goToUrl("https://s3-us-west-2.amazonaws.com/sportshub2-uploads-prod/files/sites/966/2018/05/15183822/18-19-Physical.pdf");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
        Toast.makeText(getContext(), "Loading...",
                Toast.LENGTH_LONG).show();
//                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show()
    }

    private void downloadFile() {
        saveImage1(map);
    }

    private void download_schedule() {
        saveImage(schedule);
        //new ScheduleDownload().execute(schedule);
        //AsyncTaskRunner schedule = new AsyncTaskRunner();
        //schedule.execute(download);
    }
    //private void download_2hdelay(){
    //   saveImage2(twohourdelay);
    //}

    private void saveImage1(Bitmap finalBitmap) {
        MediaStore.Images.Media.insertImage(getContext().getContentResolver(), finalBitmap, "School Map", "School Map"
        );
    }

    private void saveImage(Bitmap finalBitmap) {
        MediaStore.Images.Media.insertImage(getContext().getContentResolver(), finalBitmap, "Schedules", "Schedules");
    }

    private void saveImage2(Bitmap finalBitmap) {
        MediaStore.Images.Media.insertImage(getContext().getContentResolver(), finalBitmap, "Two hour delay schedule", "Two hour delay schedule");
    }


}
