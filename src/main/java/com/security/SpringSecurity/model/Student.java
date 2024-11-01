package com.security.SpringSecurity.model;

public class Student {

    private int id;
    private String name;
    private int marks;

    public Student(int marks, String name, int id) {
        this.marks = marks;
        this.name = name;
        this.id = id;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
