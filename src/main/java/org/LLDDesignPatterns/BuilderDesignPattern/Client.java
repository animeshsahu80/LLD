package org.LLDDesignPatterns.BuilderDesignPattern;

public class Client {

    public static void main(String args[]){

        Director directorObj1 = new Director(new EngineeringStudentBuilder());
        Director directorObj2 = new Director(new MBAStudentBuilder());

        Student engineerStudent = directorObj1.createStudent();
        Student mbaStudent =directorObj2.createStudent();

        engineerStudent.displayStudentInfo();
        mbaStudent.displayStudentInfo();

    }
}

