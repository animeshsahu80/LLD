package org.Practise.LLDStackOverFlow;

import java.util.Arrays;
import java.util.List;

public class StackOverFlowDemo {
    public static void main(String[] args) {
        StackOverflow system = new StackOverflow();

        // Create users
        User alice = system.createUsers("Alice", "alice@example.com");
        User bob = system.createUsers("Bob", "bob@example.com");
        User charlie = system.createUsers("Charlie", "charlie@example.com");

        Question javaQuestion = system.askQuestion(alice, "What is polymorphism in Java?",
                "Can someone explain polymorphism in Java with an example?",
                Arrays.asList("java", "oop"));

        // Bob answers Alice's question
        Answer bobAnswer = system.answerQuestion(bob, javaQuestion,
                "Polymorphism in Java is the ability of an object to take on many forms...");

        // Charlie comments on the question

        // Alice comments on Bob's answer
        system.addComment(alice, bobAnswer, "Thanks for the explanation! Could you provide a code example?");

        // Charlie votes on the question and answer
        system.voteQuestion(charlie, javaQuestion, VoteType.UPVOTE);  // Upvote
        system.voteAnswer(charlie, bobAnswer, VoteType.UPVOTE);  // Upvote

        Question pythonQuestion = system.askQuestion(bob, "How to use list comprehensions in Python?",
                "I'm new to Python and I've heard about list comprehensions. Can someone explain how to use them?",
                Arrays.asList("python", "list-comprehension"));

        // Alice answers Bob's question
        Answer aliceAnswer = system.answerQuestion(alice, pythonQuestion,
                "List comprehensions in Python provide a concise way to create lists...");

        // Charlie votes on Bob's question and Alice's answer
        system.voteQuestion(charlie, pythonQuestion, VoteType.UPVOTE);  // Upvote
        system.voteAnswer(charlie, aliceAnswer, VoteType.UPVOTE);  // Upvote
        System.out.println("Question: " + javaQuestion.getTitle());
        System.out.println("Asked by: " + javaQuestion.getUser().getUserName());
        System.out.println("Tags: " + javaQuestion.getTags().stream().map(Tag::getName).reduce((a, b) -> a + ", " + b).orElse(""));
        System.out.println("Votes: " + javaQuestion.getVoteCount());
        System.out.println("\nAnswer by " + bobAnswer.getUser().getUserName() + ":");
        System.out.println(bobAnswer.getContent());
        System.out.println("Votes: " + bobAnswer.getVoteCount());
        System.out.println("Accepted: " + bobAnswer.isAccepted());
        System.out.println("Comments: " + bobAnswer.getComments().size());

        System.out.println("\nUser Reputations:");
        System.out.println("Alice: " + alice.getReputation());
        System.out.println("Bob: " + bob.getReputation());
        System.out.println("Charlie: " + charlie.getReputation());

        // Demonstrate search functionality
        System.out.println("\nSearch Results for 'java':");
        List<Question> searchResults = system.searchQuestion("java");
        for (Question q : searchResults) {
            System.out.println(q.getTitle());
        }

    }
}
