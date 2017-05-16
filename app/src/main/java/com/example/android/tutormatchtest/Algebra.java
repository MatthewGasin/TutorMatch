package com.example.android.tutormatchtest;

import java.util.ArrayList;


public class Algebra extends Course{
    Skill chapter1 = new Skill("Adding and Subtracting Fractions" , 1);
    Skill chapter2 = new Skill("Multplying and Dividing Fractions", 1);
    Skill chapter3 = new Skill("Integer Operations" , 1);
    Skill chapter4 = new Skill("Order of Operations" , 1);
    Skill chapter5 = new Skill("Variables on both sides" , 2);
    Skill chapter6 = new Skill("Solving Proportions & Percents" , 2);
    Skill chapter7 = new Skill("Using Tables" , 2);
    Skill chapter8 = new Skill("Using Intercepts" , 2);
    Skill chapter9 = new Skill("Slope/Rate of Change" , 2);
    Skill chapter10 = new Skill("Using Slope-Intercept" , 2);
    Skill chapter11 = new Skill("In Slope-Intercept Form" , 2);
    Skill chapter12 = new Skill("In Point-Slope Form" , 2);
    Skill chapter13 = new Skill("In Standard Form" , 2);
    Skill chapter14 = new Skill("Parallel and Perpendicular Lines" , 2);
    Skill chapter15 = new Skill("By Graphing" , 2);
    Skill chapter16 = new Skill("By Substitution" , 2);
    Skill chapter17 = new Skill("By Elimination" , 2);
    Skill chapter18 = new Skill("Solving and Graphing Inequalities in One Variable" , 2);
    Skill chapter19 = new Skill("Graphing Linear Inequalities in Two Variables" , 2);
    Skill chapter20 = new Skill("Solving Systems of Linear Inequalities" , 2);
    Skill chapter21 = new Skill("Solving and Graphing Absolute Value Equations and Inequalities" , 2);
    Skill chapter22 = new Skill("Products" , 2);
    Skill chapter23 = new Skill("Quotients" , 2);
    Skill chapter24 = new Skill("Negative/Zero Exponents" , 2);
    Skill chapter25 = new Skill("Scientific" , 2);
    ArrayList<Skill> a;
    int rating;

    public Algebra(int r) {
        rating = r;
        a= new ArrayList<Skill>();
        a.add(chapter1);
        a.add(chapter2);
        a.add(chapter3);
        a.add(chapter4);
        a.add(chapter5);
        a.add(chapter6);
        a.add(chapter7);
        a.add(chapter8);
        a.add(chapter9);
        a.add(chapter10);
        a.add(chapter11);
        a.add(chapter12);
        a.add(chapter13);
        a.add(chapter14);
        a.add(chapter15);
        a.add(chapter16);
        a.add(chapter17);
        a.add(chapter18);
        a.add(chapter19);
        a.add(chapter20);
        a.add(chapter21);
        a.add(chapter22);
        a.add(chapter23);
        a.add(chapter24);
        a.add(chapter25);

    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public String toString(){
        return "algebra";
    }

    public ArrayList<Skill> getA() {
        return a;
    }
    public void setA(ArrayList<Skill> a) {
        this.a = a;
    }

}
