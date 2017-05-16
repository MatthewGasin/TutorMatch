package com.example.android.tutormatchtest;

import java.util.ArrayList;


public class Tutor extends User{
	public ArrayList<Course> coursesTaken = new ArrayList<Course>();
	public String tutorName;
	public int tutorID;
	
	public Tutor(ArrayList<Course> coursesTaken, String tutorName, int tutorID) {
		super(coursesTaken, tutorName, tutorID);
	}

	public int getTutorID(){
        return tutorID;
    }
	
	
}
