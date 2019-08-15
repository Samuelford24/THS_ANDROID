package com.samuelford48gmail.thssouth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register_tutors extends AppCompatActivity {
    DatabaseReference Reportref, actualreport;
    EditText name;
    EditText grade;
    EditText description;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_tutors);
        Reportref = FirebaseDatabase.getInstance().getReference();
        actualreport = Reportref.child("Tutor_sign_up");
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //*makes button invisible so duplicate reports aren't to be sent
                Button button = (Button) v;
                Toast.makeText(getApplicationContext(), "Thank you for registering to be a tutor.",
                        Toast.LENGTH_LONG).show();
                //* Gets name if it's entered in box
                EditText text = (EditText) findViewById(R.id.name);
                String getname = text.getText().toString();

                //Define Min, Max range value using custom input filter

                //* Gets grade
                EditText text1 = (EditText) findViewById(R.id.grade);
                if (text1.getText().toString().trim().equals("")) {
                    text1.setError("Grade is required!");

                    //Define Min, Max range value using custom input filter

                }
                String getgrade = text1.getText().toString();
                //* Gets the description of report
                EditText text2 = (EditText) findViewById(R.id.Qualifyingcourses);
                if (text2.getText().toString().trim().equals("")) {
                    text2.setError("Description is required!");

                    //Define Min, Max range value using custom input filter

                }
                String getdescription = text2.getText().toString();

                EditText text3 = (EditText) findViewById(R.id.subjects);
                if (text3.getText().toString().trim().equals("")) {
                    text3.setError("Description is required!");

                }
                String getsubjects = text3.getText().toString();

                //*  Creates the String report that is used in createReport below
                String registering_tutors = createReport(getname, getgrade, getdescription, getsubjects);

                actualreport.push().setValue(registering_tutors);

            }


            //* Creates report by getting the name, grade, description
            private String createReport(String getname, String getgrade, String getdescription, String getsubjects) {
                String report = "Name:" + getname;
                report = report + " Grade:" + getgrade;
                report = report + " Qualification courses:" + getdescription;
                report = report + "Want to Tutor:";
                return report;


            }


        });
    }
}

