package com.example.android.tutormatchtest;

import java.util.ArrayList;


public class Calc extends Course{
    Skill chapter0 = new Skill("Pre-Calc Review", 1);
    Skill chapter1 = new Skill("Limits", 2);
    Skill chapter2 = new Skill("Derivatives", 4);
    Skill chapter3 = new Skill("Integrals", 5);
    Skill chapter4 = new Skill("Taylor Series", 5);
    Skill chapter5 = new Skill("Parametrics and Polars", 5);
    ArrayList<Skill> a;
    int rating;

    public Calc(int r) {
        a = new ArrayList<Skill>();
        rating = r;
        a.add(chapter0);
        a.add(chapter1);
        a.add(chapter2);
        a.add(chapter3);
        a.add(chapter4);
        a.add(chapter5);
    }
    public String getName(){
        return "calc";
    }

    public String toString(){
        return getName();
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


}
