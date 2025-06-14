package org.Practise.LLDStackOverFlow;

import java.util.List;

public interface Commentable {
    public void addComment(User user, String content);
    public List<Comment>  getComments();
}
