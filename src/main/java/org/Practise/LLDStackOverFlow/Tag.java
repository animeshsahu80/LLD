package org.Practise.LLDStackOverFlow;

public class Tag {
    int id;
    String name;

    public Tag(String name) {
        this.name = name;
        this.id= generateId();
    }
    public int generateId(){
        return (int)(System.currentTimeMillis()%Integer.MAX_VALUE);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
