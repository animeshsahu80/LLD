package org.Practise.LLDStackOverFlow;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class StackOverflow {
    private final Map<Integer, User> users;
    private final Map<Integer, Question> questions;
    private final Map<Integer, Answer> answers;
    private final Map<String, Tag> tags;

    public StackOverflow() {
        users = new ConcurrentHashMap<>();
        questions = new ConcurrentHashMap<>();
        answers = new ConcurrentHashMap<>();
        tags = new ConcurrentHashMap<>();
    }

    public User createUsers( String userName, String email){
        int id= users.size()+1;
        User user= new User(id,email,userName);
        users.put(id, user);

        return  user;
    }

    public Question askQuestion(User user, String title, String content, List<String> tags){
        Question question = new Question(content,title,user,tags);
        user.addQuestion(question);
        questions.put(question.getId(),question);
        for (Tag tag : question.getTags()) {
            this.tags.putIfAbsent(tag.getName(), tag);
        }
        return  question;
    }
    public Answer answerQuestion(User user, Question question, String content) {
        Answer answer = user.addAnswer(question, content);
        answers.put(answer.getId(), answer);
        return answer;
    }
    public Comment addComment(User user, Answer answer, String content) {
        return user.addComment(answer, content);
    }

    public void voteQuestion(User user, Question question, VoteType type) {
        question.vote(user, type);
    }

    public void voteAnswer(User user, Answer answer, VoteType type) {
        answer.vote(user, type);
    }

    public List<Question> searchQuestion(String query){
        return this.questions.values().stream().filter(question -> question.getTitle().contains(query.toLowerCase())
                        || question.getContent().contains(query.toLowerCase() )
                        || question.tags.stream().anyMatch(t->t.getName().contains(query))
                ).collect(Collectors.toList());
    };

}
