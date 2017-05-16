package com.example.android.tutormatchtest;

import java.util.ArrayList;


public class French  extends Course{
	Skill skill1 = new Skill("Vocabulary", 2);
	Skill skill2 = new Skill("Grammar", 2);
	Skill skill3 = new Skill("Conjugation", 4);
	Skill skill4 = new Skill("Culture", 2);
	Skill skill5 = new Skill("Speaking", 4);
	int rating;
	ArrayList<Skill> a;


public French(int r) {
	a = new ArrayList<Skill>();
	rating = r;
	a.add(skill1);
	a.add(skill2);
	a.add(skill3);
	a.add(skill4);
	a.add(skill5);

}
public int getRating() {
    return rating;
}
public void setRating(int rating) {
    this.rating = rating;
}
	public ArrayList<Skill> getA() {
		return a;
	}
	public void setA(ArrayList<Skill> a) {
		this.a = a;
	}
	public String toString(){
		return "French";
	}

}
