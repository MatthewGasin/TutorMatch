package com.example.android.tutormatchtest;

import java.util.ArrayList;


public class EnglishLanguage  extends Course{
	Skill skill1 = new Skill("Non-Fiction", 2);
	Skill skill2 = new Skill("Poetry", 2);
	Skill skill3 = new Skill("Transcendentalists", 3);
	Skill skill4 = new Skill("The Crucible", 3);
	Skill skill5 = new Skill("The Scarlet Letter", 4);
	int rating;
	ArrayList<Skill> a;


public EnglishLanguage(int r) {
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
        return "English Language";
    }

}
