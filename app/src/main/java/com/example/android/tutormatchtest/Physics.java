package com.example.android.tutormatchtest;

import java.util.ArrayList;


public class Physics extends Course{
	Skill chapter1 = new Skill("Kinematics", 2 );
	Skill chapter2 = new Skill("Forces and Newton's Laws of Motion",3 );
	Skill chapter3 = new Skill("Work and the Conservation of Energy", 2 );
	Skill chapter4 = new Skill("The Conservation of Momentum and Center of Mass", 3 );
	Skill chapter5 = new Skill("Circular and Rotational Motion", 3 );
	Skill chapter6 = new Skill("Electricity and Magnetism", 3 );
	Skill chapter7 = new Skill("Oscillations and Gravitation", 3 );
	ArrayList<Skill> a;
	int rating;
	public Physics(int r) {
        a = new ArrayList<Skill>();
        rating = r;
		a.add(chapter1);
		a.add(chapter2);
		a.add(chapter3);
		a.add(chapter4);
		a.add(chapter5);
		a.add(chapter6);
		a.add(chapter7);

	}
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String toString(){
        return "Physics";
    }

    public ArrayList<Skill> getA() {
        return a;
    }
    public void setA(ArrayList<Skill> a) {
        this.a = a;
    }
}
