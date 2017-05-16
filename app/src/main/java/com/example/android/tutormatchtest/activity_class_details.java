package com.example.android.tutormatchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class activity_class_details extends AppCompatActivity {

    studentHub studentHub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_class_details);
        studentHub = new studentHub();
        Intent intent = getIntent();
        studentHub.setCurrentUser(intent.getIntExtra("UserID", 1));
        int classID = intent.getIntExtra("classID", 1);

        int studentPos = 0;
        for(int i = 0; i < studentHub.getStudents().size(); i++) {
            if (studentHub.getStudents().get(i).getID() == studentHub.getCurrentUser()) {
                studentPos = i;
            }
        }

        TextView detailsTitle = (TextView) findViewById(R.id.detailsTitle);
        detailsTitle.setText(studentHub.getStudents().get(studentPos).getCourses().get(classID).toString());

        RatingBar ratingBar = (RatingBar) findViewById(R.id.detailsRating);
        ratingBar.setRating(studentHub.getStudents().get(studentPos).getCourses().get(classID).getRating());

        TextView studentAmount = (TextView) findViewById(R.id.studentAmount);
        int c = 0;
        for(int i = 0; i < studentHub.getStudents().size(); i++){
            for(int j = 0; j < studentHub.getStudents().get(i).getCourses().size(); j++) {
                if (studentHub.getStudents().get(i).getCourses().get(j).toString().equals(studentHub.getStudents().get(studentPos).getCourses().get(classID).toString())) {
                    c++;
                }
            }
        }
        c = c -1;
        String s = "" + c;
        studentAmount.setText(s);


        TextView tutorAmount = (TextView) findViewById(R.id.TutorAmount);
        int k = 0;
        for(int i = 0; i < studentHub.getTutors().size(); i++){
            for(int j = 0; j < studentHub.getTutors().get(i).getCourses().size(); j++) {
                if (studentHub.getTutors().get(i).getCourses().get(j).toString().equals(studentHub.getStudents().get(studentPos).getCourses().get(classID).toString())) {
                    k++;
                }
            }
        }
        String f = "" + k;
        tutorAmount.setText(f);

        ArrayList<String> sub = new ArrayList<String>();
        for(int i = 0; i < studentHub.getStudents().get(studentPos).getCourses().get(classID).getA().size(); i++){
            sub.add(studentHub.getStudents().get(studentPos).getCourses().get(classID).getA().get(i).getSkillName());
        }


        ListView listView = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.subclasses, sub);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_class_details, menu);
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
}
