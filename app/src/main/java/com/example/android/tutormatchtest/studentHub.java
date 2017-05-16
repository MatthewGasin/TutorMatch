package com.example.android.tutormatchtest;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class studentHub {

    Student Matt;
    ArrayList<Course> MattCourses;

    Student Dino;
    ArrayList<Course> DinoCourses;

    Student Maxwell;
    ArrayList<Course> MaxCourses;


    Student Cristopher;
    ArrayList<Course> CrisCourses;


    Student Diana;
    ArrayList<Course> DianaCourses;


    Student Wilson;
    ArrayList<Course> WilsonCourses;

    int currentUser;

    ArrayList<Student> students;

    Tutor Anthony;
    ArrayList<Course> AnthonyTutor;

    Tutor TutorMaxwell;
    ArrayList<Course> MaxwellTutor;

    Tutor TutorMatt;
    ArrayList<Course> MattTutor;

    Tutor Patrick;
    ArrayList<Course> PatrickTutor;

    Tutor George;
    ArrayList<Course> GeorgeTutor;

    ArrayList<Tutor> tutors;

    Student tutorStudent;
    ArrayList<Course> allCourses;

    public studentHub(){
        //for tutors looking at class details
        allCourses = new ArrayList<Course>();
        allCourses.add(new French(5));
        allCourses.add(new Chemistry(5));
        allCourses.add(new Calc(5));
        allCourses.add(new Algebra(5));
        allCourses.add(new Mandarin(5));
        allCourses.add(new USHistory(5));
        allCourses.add(new Physics(5));
        allCourses.add(new USGovernment(5));
        allCourses.add(new EnglishLanguage(5));
        allCourses.add(new EnglishLiterature(5));
        allCourses.add(new Spanish(5));
        tutorStudent = new Student(allCourses, "", 0);

        currentUser = 0;
        MattCourses = new ArrayList<Course>();
        MattCourses.add(new Calc(4));
        MattCourses.add(new Physics(3));
        MattCourses.add(new USHistory(5));
        MattCourses.add(new Mandarin(5));
        MattCourses.add(new EnglishLiterature(4));
        Matt = new Student(MattCourses, "Matt", 1);

        DinoCourses = new ArrayList<Course>();
        DinoCourses.add(new Algebra(2));
        DinoCourses.add(new USHistory(4));
        DinoCourses.add(new Chemistry(2));
        DinoCourses.add(new EnglishLanguage(3));
        DinoCourses.add(new Mandarin(2));
        Dino = new Student(DinoCourses, "Dino", 2);

        MaxCourses = new ArrayList<Course>();
        MaxCourses.add(new Calc(5));
        MaxCourses.add(new Physics(5));
        MaxCourses.add(new USHistory(5));
        MaxCourses.add(new French(1));
        MaxCourses.add(new USGovernment(5));
        Maxwell = new Student(MaxCourses, "Maxwell", 3);

        CrisCourses = new ArrayList<Course>();
        CrisCourses.add(new Algebra(4));
        CrisCourses.add(new Physics(3));
        CrisCourses.add(new USHistory(2));
        CrisCourses.add(new Chemistry(3));
        CrisCourses.add(new EnglishLanguage(3));
        Cristopher = new Student(CrisCourses, "Cris", 4);

        DianaCourses = new ArrayList<Course>();
        DianaCourses.add(new Calc(5));
        DianaCourses.add(new Chemistry(5));
        DianaCourses.add(new USHistory(4));
        DianaCourses.add(new EnglishLiterature(5));
        DianaCourses.add(new Mandarin(4));
        Diana = new Student(DianaCourses, "Diana", 5);

        WilsonCourses = new ArrayList<Course>();
        WilsonCourses.add(new Calc(2));
        WilsonCourses.add(new Physics(1));
        WilsonCourses.add(new USHistory(3));
        WilsonCourses.add(new EnglishLanguage(3));
        WilsonCourses.add(new Spanish(2));
        Wilson = new Student(WilsonCourses, "Wilson", 6);

        students = new ArrayList<Student>();
        students.add(Matt);
        students.add(Dino);
        students.add(Maxwell);
        students.add(Cristopher);
        students.add(Diana);
        students.add(Wilson);

        AnthonyTutor = new ArrayList<Course>();
        AnthonyTutor.add(new French(5));
        AnthonyTutor.add(new Chemistry(5));
        Anthony = new Tutor(AnthonyTutor, "Anthony", 7);

        MaxwellTutor = new ArrayList<Course>();
        MaxwellTutor.add(new Calc(5));
        MaxwellTutor.add(new Algebra(5));
        TutorMaxwell = new Tutor(MaxwellTutor, "Maxwell", 8);

        MattTutor = new ArrayList<Course>();
        MattTutor.add(new Mandarin(5));
        MattTutor.add(new USHistory(5));
        TutorMatt = new Tutor(MattTutor, "Matt", 9);

        PatrickTutor = new ArrayList<Course>();
        PatrickTutor.add(new Physics(5));
        PatrickTutor.add(new USGovernment(5));
        Patrick = new Tutor(PatrickTutor, "Pat", 10);

        GeorgeTutor = new ArrayList<Course>();
        GeorgeTutor.add(new EnglishLanguage(5));
        GeorgeTutor.add(new EnglishLiterature(5));
        GeorgeTutor.add(new Spanish(5));
        George = new Tutor(GeorgeTutor, "George", 11);

        tutors = new ArrayList<Tutor>();
        tutors.add(Anthony);
        tutors.add(TutorMaxwell);
        tutors.add(TutorMatt);
        tutors.add(Patrick);
        tutors.add(George);

        students.add(6, tutorStudent);


    }



    public int getCurrentUser() {
        return currentUser;
    }


    public void setCurrentUser(int currentUser) {
        this.currentUser = currentUser;
    }


    public Student getMatt() {
        return Matt;
    }


    public void setMatt(Student matt) {
        Matt = matt;
    }


    public Student getDino() {
        return Dino;
    }


    public void setDino(Student dino) {
        Dino = dino;
    }


    public Student getMaxwell() {
        return Maxwell;
    }


    public void setMaxwell(Student maxwell) {
        Maxwell = maxwell;
    }


    public Student getCristopher() {
        return Cristopher;
    }


    public ArrayList<Student> getStudents() {
        return students;
    }


    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


    public void setCristopher(Student cristopher) {
        Cristopher = cristopher;
    }


    public Student getDiana() {
        return Diana;
    }


    public void setDiana(Student diana) {
        Diana = diana;
    }


    public Student getWilson() {
        return Wilson;
    }


    public void setWilson(Student wilson) {
        Wilson = wilson;
    }


    public ArrayList<Course> getMattCourses() {
        return MattCourses;
    }


    public void setMattCourses(ArrayList<Course> mattCourses) {
        MattCourses = mattCourses;
    }


    public ArrayList<Course> getDinoCourses() {
        return DinoCourses;
    }


    public void setDinoCourses(ArrayList<Course> dinoCourses) {
        DinoCourses = dinoCourses;
    }


    public ArrayList<Course> getMaxCourses() {
        return MaxCourses;
    }


    public void setMaxCourses(ArrayList<Course> maxCourses) {
        MaxCourses = maxCourses;
    }


    public ArrayList<Course> getCrisCourses() {
        return CrisCourses;
    }


    public void setCrisCourses(ArrayList<Course> crisCourses) {
        CrisCourses = crisCourses;
    }


    public ArrayList<Course> getDianaCourses() {
        return DianaCourses;
    }


    public Tutor getAnthony() {
        return Anthony;
    }


    public void setAnthony(Tutor anthony) {
        Anthony = anthony;
    }


    public Tutor getTutorMaxwell() {
        return TutorMaxwell;
    }


    public void setTutorMaxwell(Tutor tutorMaxwell) {
        TutorMaxwell = tutorMaxwell;
    }


    public Tutor getTutorMatt() {
        return TutorMatt;
    }


    public void setTutorMatt(Tutor tutorMatt) {
        TutorMatt = tutorMatt;
    }


    public Tutor getPatrick() {
        return Patrick;
    }


    public void setPatrick(Tutor patrick) {
        Patrick = patrick;
    }


    public Tutor getGeorge() {
        return George;
    }


    public void setGeorge(Tutor george) {
        George = george;
    }


    public ArrayList<Tutor> getTutors() {
        return tutors;
    }


    public void setTutors(ArrayList<Tutor> tutors) {
        this.tutors = tutors;
    }


    public void setDianaCourses(ArrayList<Course> dianaCourses) {
        DianaCourses = dianaCourses;
    }


    public ArrayList<Course> getWilsonCourses() {
        return WilsonCourses;
    }


    public void setWilsonCourses(ArrayList<Course> wilsonCourses) {
        WilsonCourses = wilsonCourses;
    }



    public Student getTutorStudent() {
        return tutorStudent;
    }



    public void setTutorStudent(Student tutorStudent) {
        this.tutorStudent = tutorStudent;
    }


}
