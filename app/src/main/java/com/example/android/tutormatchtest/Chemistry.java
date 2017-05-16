package com.example.android.tutormatchtest;

import java.util.ArrayList;


public class Chemistry  extends Course{
	Skill skill1 = new Skill("Measurements and Significant Figures", 2);
	Skill skill2 = new Skill("Elements", 2);
	Skill skill3 = new Skill("Molality", 3);
	Skill skill4 = new Skill("Nuclear Chem", 3);
	Skill skill5 = new Skill("Stoichiometry", 4);
	int rating;
	ArrayList<Skill> a;


public Chemistry(int r) {
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
        return "Chemistry";
    }

}
