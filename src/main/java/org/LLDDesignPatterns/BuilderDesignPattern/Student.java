package org.LLDDesignPatterns.BuilderDesignPattern;

import java.util.List;

public class Student {
    int rollNo;
    String name;
    String fatherName;
    String motherName;
    int age;
    List<String> subjects;

    Student(StudentBuilder studentBuilder){
        this.rollNo= studentBuilder.rollNo;
        this.name=studentBuilder.name;
        this.fatherName= studentBuilder.fatherName;
        this.motherName= studentBuilder.motherName;
        this.age= studentBuilder.age;
        this.subjects= studentBuilder.subjects;
    }
    public  void displayStudentInfo(){
        System.out.println( " roll number: " + this.rollNo +
                " age: " + this.age +
                " name: " + this.name +
                " father name: " + this.fatherName +
                " mother name: " + this.motherName +  " subjects: " + subjects.get(0) + "," + subjects.get(1) + ","
        );
    }
}
