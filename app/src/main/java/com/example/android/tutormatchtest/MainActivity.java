package com.example.android.tutormatchtest;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class MainActivity extends AppCompatActivity {
    public studentHub studentHub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentHub = new studentHub();
        Spinner studentSpinner = (Spinner) findViewById(R.id.studentSpinner);
        String[] students = new String[6];
        students[0] = studentHub.getMatt().getName();
        students[1] = studentHub.getDino().getName();
        students[2] = studentHub.getMaxwell().getName();
        students[3] = studentHub.getCristopher().getName();
        students[4] = studentHub.getDiana().getName();
        students[5] = studentHub.getWilson().getName();
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, students);
        studentSpinner.setAdapter(dataAdapter);


        String[] tutors = new String[5];
        tutors[0] = studentHub.getAnthony().getName();
        tutors[1] = studentHub.getTutorMaxwell().getName();
        tutors[2] = studentHub.getTutorMatt().getName();
        tutors[3] = studentHub.getPatrick().getName();
        tutors[4] = studentHub.getGeorge().getName();
        Spinner tutorSpinner = (Spinner) findViewById(R.id.tutorSpinner);
        ArrayAdapter<String> dataTutorAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tutors);
        tutorSpinner.setAdapter(dataTutorAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onStudent(View view) {
        Spinner studentSpinner = (Spinner) findViewById(R.id.studentSpinner);
        Intent intent = new Intent(this, main_student.class);
        for(int i = 0; i < studentHub.getStudents().size(); i++) {
            if (studentHub.getStudents().get(i).getName().equals(studentSpinner.getSelectedItem())) {
                studentHub.setCurrentUser(studentHub.getStudents().get(i).getID());
            }
        }
        intent.putExtra("UserID", studentHub.getCurrentUser());
        startActivity(intent);

    }

    public void onTutor(View view) {
        Spinner tutorSpinner = (Spinner) findViewById(R.id.tutorSpinner);
        Intent intent = new Intent(this, activity_main_tutor.class);
        for(int i = 0; i < studentHub.getTutors().size(); i++) {
            if (studentHub.getTutors().get(i).getName().equals(tutorSpinner.getSelectedItem())) {
                studentHub.setCurrentUser(studentHub.getTutors().get(i).getID());
            }
        }
        intent.putExtra("UserID", studentHub.getCurrentUser());
        startActivity(intent);
    }

    public com.example.android.tutormatchtest.studentHub getStudentHub() {
        return studentHub;
    }
}
