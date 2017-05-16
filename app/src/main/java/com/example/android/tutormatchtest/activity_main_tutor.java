package com.example.android.tutormatchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class activity_main_tutor extends AppCompatActivity {

    studentHub studentHub;
    int tutorPos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_main_tutor);
        Intent intent = getIntent();
        studentHub = new studentHub();
        studentHub.setCurrentUser(intent.getIntExtra("UserID", 1));

        tutorPos = 0;
        for(int i = 0; i < studentHub.getTutors().size(); i++) {
            if (studentHub.getTutors().get(i).getID() == studentHub.getCurrentUser()) {
                tutorPos = i;
            }
        }

        String[] classes = new String[3];
        for(int i = 0; i < 2; i++){
            classes[i] = "";
        }


        for(int i = 0; i < studentHub.getTutors().get(tutorPos).getCourses().size(); i++){
            classes[i] = studentHub.getTutors().get(tutorPos).getCourses().get(i).toString();
        }

        TextView TutorText1 = (TextView) findViewById(R.id.TutorText1);
        TutorText1.setText(classes[0]);
        TextView TutorText2 = (TextView) findViewById(R.id.TutorText2);
        TutorText2.setText(classes[1]);
        TextView TutorText3 = (TextView) findViewById(R.id.TutorText3);
        TutorText3.setText(classes[2]);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_main_tutor, menu);
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

    public void tutorDetails0(View view) {
        Intent intent = new Intent(this, activity_class_details.class);
        intent.putExtra("UserID", 0);
        int x = 0;
        for(int i = 0; i < studentHub.getStudents().get(6).getCourses().size(); i++){
            if(studentHub.getTutors().get(tutorPos).getCourses().get(0).toString().equals(studentHub.getStudents().get(6).getCourses().get(i).toString())){
                x = i;
            }
        }
        intent.putExtra("classID", x);
        startActivity(intent);
    }

    public void tutorDetails1(View view) {
        Intent intent = new Intent(this, activity_class_details.class);
        intent.putExtra("UserID", 0);
        intent.putExtra("classID", 1);
        startActivity(intent);
    }

    public void tutorDetails2(View view) {
        Intent intent = new Intent(this, activity_class_details.class);
        intent.putExtra("UserID", 0);
        intent.putExtra("classID", 2);
        startActivity(intent);
    }
}
