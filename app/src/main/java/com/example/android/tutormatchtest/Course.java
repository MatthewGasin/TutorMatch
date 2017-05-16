package com.example.android.tutormatchtest;

import java.util.ArrayList;


public abstract class Course {


	ArrayList<Skill> a;
	int rating;

    public Course(int r){
        rating = r;
        a = new ArrayList<Skill>();


    }

    public Course(){
        rating = 0;
        a = new ArrayList<Skill>();


    }

    public ArrayList<Skill> getA(){
        return a;
    }

    public int getRating(){
        return rating;
    }

    public String toString(){
        return "course";
    }

}
