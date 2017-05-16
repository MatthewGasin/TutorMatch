package com.example.android.tutormatchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class activity_enrolled extends AppCompatActivity {
    studentHub studentHub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_enrolled);

        Intent intent = getIntent();

        studentHub = new studentHub();
        studentHub.setCurrentUser(intent.getIntExtra("UserID", 1));
        int studentPos = 0;
        for(int i = 0; i < studentHub.getStudents().size(); i++) {
            if (studentHub.getStudents().get(i).getID() == studentHub.getCurrentUser()) {
                studentPos = i;
            }
        }
        int[] ratings = new int[5];
        String[] classNames = new String[5];
        for(int i = 0; i < 5; i++){
            classNames[i] = "";
            ratings[i] = 0;
        }
        for(int i = 0; i < studentHub.getStudents().get(studentPos).getCourses().size(); i++){
            ratings[i] = studentHub.getStudents().get(studentPos).getCourses().get(i).getRating();
            classNames[i] = studentHub.getStudents().get(studentPos).getCourses().get(i).toString();
        }

        //int[] ratings = intent.getIntArrayExtra("name");
        RatingBar[] bars = new RatingBar[5];
        bars[0] = (RatingBar) findViewById(R.id.ratingBar);
        bars[1] = (RatingBar) findViewById(R.id.ratingBar2);
        bars[2] = (RatingBar) findViewById(R.id.ratingBar3);
        bars[3] = (RatingBar) findViewById(R.id.ratingBar4);
        bars[4] = (RatingBar) findViewById(R.id.ratingBar5);
        TextView[] names = new TextView[5];
        names[0] = (TextView) findViewById(R.id.enrolled1);
        names[1] = (TextView) findViewById(R.id.enrolled2);
        names[2] = (TextView) findViewById(R.id.enrolled3);
        names[3] = (TextView) findViewById(R.id.enrolled4);
        names[4] = (TextView) findViewById(R.id.enrolled5);


        for(int i = 0; i < 5; i++){
            names[i].setText(classNames[i]);
            bars[i].setRating((float) ratings[i]);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_enrolled, menu);
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

    protected void onStop(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //push the data back to main_student to remember for when it returns 


    }

    public void onDetails0(View view) {
        Intent intent = new Intent(this, activity_class_details.class);
        intent.putExtra("UserID", studentHub.getCurrentUser());
        intent.putExtra("classID", 0);
        startActivity(intent);
    }
    public void onDetails1(View view) {
        Intent intent = new Intent(this, activity_class_details.class);
        intent.putExtra("UserID", studentHub.getCurrentUser());
        intent.putExtra("classID", 1);
        startActivity(intent);
    }public void onDetails2(View view) {
        Intent intent = new Intent(this, activity_class_details.class);
        intent.putExtra("UserID", studentHub.getCurrentUser());
        intent.putExtra("classID", 2);
        startActivity(intent);
    }public void onDetails3(View view) {
        Intent intent = new Intent(this, activity_class_details.class);
        intent.putExtra("UserID", studentHub.getCurrentUser());
        intent.putExtra("classID", 3);
        startActivity(intent);
    }public void onDetails4(View view) {
        Intent intent = new Intent(this, activity_class_details.class);
        intent.putExtra("UserID", studentHub.getCurrentUser());
        intent.putExtra("classID", 4);
        startActivity(intent);
    }
}
