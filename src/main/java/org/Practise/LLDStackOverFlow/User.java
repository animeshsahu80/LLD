package org.Practise.LLDStackOverFlow;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    String email;
    String userName;
    int reputation;
    List<Question> questions;
    List<Answer> answers;
    List<Comment> comments;

    public User(int id, String email, String userName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.answers= new ArrayList<>();
        this.comments= new ArrayList<>();
        this.questions= new ArrayList<>();
        this.reputation=0;

    }
        public void addQuestion(Question question){
        questions.add(question);
    }
    public Answer addAnswer(Question question,String content){
        Answer answer= new Answer(content,this);
        question.addAnswer(answer);
        answers.add(answer);
        return answer;
    }

    public Comment addComment(Answer answer, String content){
        Comment comment= new Comment(this,content);
        this.comments.add(comment);
        answer.addComment(this,content);
        return  comment;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
