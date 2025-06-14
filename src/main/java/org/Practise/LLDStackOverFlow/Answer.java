package org.Practise.LLDStackOverFlow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Answer implements  Commentable , Votable{
    int id;
    String content;
    User user;
    Date creationDate;
    Boolean isAccepted;
    List<Comment> comments;
    List<Vote> votes;

    public Answer(String content, User user) {
        this.content = content;
        this.user = user;
        this.id= generateId();
        this.comments= new ArrayList<>();
        this.votes = new ArrayList<>();
        this.isAccepted=false;
        this.creationDate= new Date();

    }
    public  void markAnswerAccepted(){
        this.isAccepted=true;
    }

    @Override
    public void addComment(User user, String content){
        Comment comment= new Comment(this.user,content);
        this.comments.add(comment);
    };
    @Override
    public List<Comment>  getComments(){return this.comments;};

    @Override
    public void vote(User user, VoteType voteType){
        Vote vote= new Vote(this.user, voteType);
        votes.add(vote);
    };
    @Override
    public int getVoteCount(){
       return (int) this.votes.stream().filter(vote -> vote.voteType == VoteType.UPVOTE).count();
    };
    public int generateId(){
        return (int)(System.currentTimeMillis()%Integer.MAX_VALUE);
    }

    public void makeAccepted(){
        this.isAccepted=true;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getAccepted() {
        return isAccepted;
    }

    public void setAccepted(Boolean accepted) {
        isAccepted = accepted;
    }



    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    public Boolean isAccepted() {
        return isAccepted;
    }
}
