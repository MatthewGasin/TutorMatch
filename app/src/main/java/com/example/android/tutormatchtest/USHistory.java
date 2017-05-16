package com.example.android.tutormatchtest;

import java.util.ArrayList;


public class USHistory extends Course {

	Skill chapter1 = new Skill("American Revolution", 2);
	Skill chapter2 = new Skill("Civil War", 3);
	Skill chapter3 = new Skill("World Wars", 4);
	ArrayList<Skill> a;
	int rating;
	public USHistory(int r) {
        a = new ArrayList<Skill>();
		rating = r;
		a.add(chapter1);
		a.add(chapter2);
		a.add(chapter3);

	}
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String toString(){
        return "USHistory";
    }

    public ArrayList<Skill> getA() {
        return a;
    }
    public void setA(ArrayList<Skill> a) {
        this.a = a;
    }

}
