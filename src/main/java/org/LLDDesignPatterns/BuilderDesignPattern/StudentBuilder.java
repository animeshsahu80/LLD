package org.LLDDesignPatterns.BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {
    int rollNo;
    String name;
    String fatherName;
    String motherName;
    int age;

    List<String> subjects;

    public List<String> getSubjects() {
        return subjects;
    }

    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects = subjects;
        return this;

    }

    public int getRollNo() {
        return rollNo;
    }

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public String getName() {
        return name;

    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;

    }

    public String getFatherName() {
        return fatherName;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;

    }

    public String getMotherName() {
        return motherName;

    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;

    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;

    }
    abstract public StudentBuilder setSubjects();


    Student build(){
        return new Student(this);
    }

}
