package com.samuelford48gmail.thssouth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Admin_events extends AppCompatActivity {
    DatabaseReference dref;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_events);
        dref = FirebaseDatabase.getInstance().getReference("Events");

    }

    public void send(View view) {
        EditText text = (EditText) findViewById(R.id.edit_text_events);
        String getevent = text.getText().toString();
        dref.push().setValue(getevent);
        Toast.makeText(Admin_events.this, "Successfully uploaded",
                Toast.LENGTH_LONG).show();

    }
}
