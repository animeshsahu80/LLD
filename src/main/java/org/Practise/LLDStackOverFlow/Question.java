package org.Practise.LLDStackOverFlow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Question  implements  Votable{
    int id;
    String content;
    String title;
    User user;

    List<Answer> answers;
    List<Tag> tags;
    List<Vote> votes;

    Answer acceptedAnswer;
    Date creationDate;
    public Question(String content, String title, User user, List<String> tags) {
        this.content = content;
        this.title = title;
        this.user = user;
        this.id= generateId();
        this.votes=new ArrayList<>();
        this.answers= new ArrayList<>();
        this.creationDate= new Date();
        this.tags= tags.stream().map(tag-> new Tag(tag)).collect(Collectors.toList());
    }

    public int generateId(){
        return (int)(System.currentTimeMillis()%Integer.MAX_VALUE);
    }

    public void addAnswer(Answer answer){
        this.answers.add(answer);
    }
    public void markAnswerAccepted(Answer answer){
        this.acceptedAnswer=answer;
        answer.markAnswerAccepted();
    }
    @Override
    public void vote(User user, VoteType voteType){
        Vote vote= new Vote(this.user, voteType);
        this.user.reputation+=10;
        votes.add(vote);
    };
    @Override
    public int getVoteCount(){
        return (int) this.votes.stream().filter(vote -> vote.voteType == VoteType.UPVOTE).count();
    };
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    public Answer getAcceptedAnswer() {
        return acceptedAnswer;
    }

    public void setAcceptedAnswer(Answer acceptedAnswer) {
        this.acceptedAnswer = acceptedAnswer;
    }
}
