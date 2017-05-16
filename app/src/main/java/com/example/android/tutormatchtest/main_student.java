package com.example.android.tutormatchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class main_student extends AppCompatActivity {


    studentHub studentHub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_student);
        Intent intent = getIntent();
        int x = intent.getIntExtra("UserID", 1);
        studentHub = new studentHub();
        studentHub.setCurrentUser(x);
        /*for(int i = 0; i < studentHub.getStudents().size(); i++){
            if(studentHub.getStudents().get(i).getID() == x){
            }
        }*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_student, menu);
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

    public void onEnrollClasses(View view) {
        int[] x = new int[5];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        x[4] = 5;
        Intent intent = new Intent(this, activity_enrolled.class);
        intent.putExtra("name", x);
        intent.putExtra("UserID", studentHub.getCurrentUser());
        startActivity(intent);
    }

    public void onTutor(View view) {
        Intent intent = new Intent(this, activity_student_find.class);
        startActivity(intent);
    }
}
