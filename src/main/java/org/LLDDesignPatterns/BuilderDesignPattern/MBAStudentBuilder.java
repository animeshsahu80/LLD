package org.LLDDesignPatterns.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends  StudentBuilder{
    @Override
    public StudentBuilder setSubjects(){
        List<String> subs = new ArrayList<>();
        subs.add("Time manage");
        subs.add("finance");
        this.subjects = subs;
        return this;

    }
}
