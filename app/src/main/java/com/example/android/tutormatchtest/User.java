package com.example.android.tutormatchtest;

import java.util.ArrayList;


public abstract class User {
	public ArrayList<Course> courses = new ArrayList<Course>();
	public String name;
	public int ID;
	public User(ArrayList<Course> courses, String name, int ID) {
		this.courses= courses;
		this.name = name;
		this.ID = ID;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}



}
