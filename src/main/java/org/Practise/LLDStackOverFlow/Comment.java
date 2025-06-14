package org.Practise.LLDStackOverFlow;

import java.util.Date;

public class Comment {
    int id;
    Date creationDate;
    User user;

    String content;

    public Comment(User user, String content) {
        this.user = user;
        this.content = content;
        this.id=generateId();
        this.creationDate= new Date();
    }
    public int generateId(){
        return (int)(System.currentTimeMillis()%Integer.MAX_VALUE);
    }
}
