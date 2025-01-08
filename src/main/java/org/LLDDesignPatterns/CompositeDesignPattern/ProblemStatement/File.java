package org.LLDDesignPatterns.CompositeDesignPattern.ProblemStatement;

public class File {

    String filename;
    File(String filename){
        this.filename=filename;
    }

    public void ls(){
        System.out.println("File name :" + filename);
    }
}
