package com.samuelford48gmail.thssouth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Admin_add_tutor extends AppCompatActivity {
    DatabaseReference dref;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_add_tutor);
        dref = FirebaseDatabase.getInstance().getReference("View_tutors");
    }

    public void send(View view) {
        EditText text = (EditText) findViewById(R.id.edit_text_add_tutor);
        String getevent = text.getText().toString();
        dref.push().setValue(getevent);
        Toast.makeText(Admin_add_tutor.this, "Successfully uploaded",
                Toast.LENGTH_LONG).show();

    }
}

