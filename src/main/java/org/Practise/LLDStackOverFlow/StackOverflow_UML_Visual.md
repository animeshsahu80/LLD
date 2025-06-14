# StackOverflow System - Visual UML Representation

## System Architecture Overview

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                           STACKOVERFLOW SYSTEM                              │
└─────────────────────────────────────────────────────────────────────────────┘
                                    │
                                    ▼
┌─────────────────────────────────────────────────────────────────────────────┐
│                           StackOverflow                                     │
│  ┌─────────────────────────────────────────────────────────────────────┐   │
│  │ - users: Map<Integer, User>                                         │   │
│  │ - questions: Map<Integer, Question>                                 │   │
│  │ - answers: Map<Integer, Answer>                                     │   │
│  │ - tags: Map<String, Tag>                                            │   │
│  │                                                                     │   │
│  │ + createUsers(userName, email): User                               │   │
│  │ + askQuestion(user, title, content, tags): Question               │   │
│  │ + answerQuestion(user, question, content): Answer                 │   │
│  │ + addComment(user, answer, content): Comment                      │   │
│  │ + voteQuestion(user, question, type): void                        │   │
│  │ + voteAnswer(user, answer, type): void                            │   │
│  │ + searchQuestion(query): List<Question>                           │   │
│  └─────────────────────────────────────────────────────────────────────┘   │
└─────────────────────────────────────────────────────────────────────────────┘
                                    │
                    ┌───────────────┼───────────────┐
                    │               │               │
                    ▼               ▼               ▼
┌─────────────────┐ ┌─────────────────┐ ┌─────────────────┐ ┌─────────────────┐
│      User       │ │     Question    │ │      Answer     │ │       Tag       │
├─────────────────┤ ├─────────────────┤ ├─────────────────┤ ├─────────────────┤
│ - id: int       │ │ - id: int       │ │ - id: int       │ │ - id: int       │
│ - email: String │ │ - content: Str  │ │ - content: Str  │ │ - name: String  │
│ - userName: Str │ │ - title: String │ │ - user: User    │ │                 │
│ - reputation: int│ │ - user: User    │ │ - creationDate  │ │ + Tag(name)     │
│ - questions     │ │ - answers       │ │ - isAccepted    │ │ + generateId()  │
│ - answers       │ │ - tags          │ │ - comments      │ │ + getName()     │
│ - comments      │ │ - votes         │ │ - votes         │ │ + setName()     │
│                 │ │ - acceptedAnswer│ │                 │ │                 │
│ + User(id,email,│ │ - creationDate  │ │ + Answer(content│ │                 │
│    userName)    │ │                 │ │    user)        │ │                 │
│ + addQuestion() │ │ + Question(...) │ │ + markAccepted()│ │                 │
│ + addAnswer()   │ │ + addAnswer()   │ │ + addComment()  │ │                 │
│ + addComment()  │ │ + markAccepted()│ │ + vote()        │ │                 │
│ + getReputation()│ │ + vote()        │ │ + getVoteCount()│ │                 │
│                 │ │ + getVoteCount()│ │                 │ │                 │
└─────────────────┘ └─────────────────┘ └─────────────────┘ └─────────────────┘
         │                    │                    │
         │                    │                    │
         ▼                    ▼                    ▼
┌─────────────────┐ ┌─────────────────┐ ┌─────────────────┐
│     Comment     │ │      Vote       │ │    VoteType     │
├─────────────────┤ ├─────────────────┤ ├─────────────────┤
│ - id: int       │ │ - user: User    │ │ UPVOTE          │
│ - creationDate  │ │ - voteType      │ │ DOWNVOTE        │
│ - user: User    │ │                 │ │                 │
│ - content: Str  │ │ + Vote(user,    │ │                 │
│                 │ │    voteType)    │ │                 │
│ + Comment(user, │ │                 │ │                 │
│    content)     │ │                 │ │                 │
│ + generateId()  │ │                 │ │                 │
└─────────────────┘ └─────────────────┘ └─────────────────┘
```

## Interface Implementations

```
┌─────────────────┐         ┌─────────────────┐
│    Votable      │         │   Commentable   │
├─────────────────┤         ├─────────────────┤
│ + vote(user,    │         │ + addComment(   │
│    voteType)    │         │    user, content)│
│ + getVoteCount()│         │ + getComments() │
└─────────────────┘         └─────────────────┘
         ▲                           ▲
         │                           │
         │                           │
    ┌────┴────┐              ┌──────┴──────┐
    │Question │              │   Answer    │
    │implements│              │ implements  │
    └─────────┘              └─────────────┘
```

## Relationship Diagram

```
User (1) ──────┐
                │ asks
                ▼
            Question (1)
                │
                │ has many
                ▼
            Answer (many)
                │
                │ has many
                ▼
            Comment (many)

User (1) ──────┐
                │ provides
                ▼
            Answer (many)

User (1) ──────┐
                │ casts
                ▼
            Vote (many)
                │
                │ uses
                ▼
            VoteType (1)

Question (1) ───┐
                │ tagged with
                ▼
            Tag (many)

Question (1) ───┐
                │ accepts
                ▼
            Answer (1)
```

## Key Relationships Summary

### One-to-Many Relationships:
- **User → Questions**: One user can ask many questions
- **User → Answers**: One user can provide many answers  
- **User → Comments**: One user can make many comments
- **User → Votes**: One user can cast many votes
- **Question → Answers**: One question can have many answers
- **Question → Tags**: One question can have many tags
- **Question → Votes**: One question can receive many votes
- **Answer → Comments**: One answer can have many comments
- **Answer → Votes**: One answer can receive many votes

### One-to-One Relationships:
- **Question → Accepted Answer**: One question can have one accepted answer
- **Vote → VoteType**: One vote uses one vote type

### Many-to-Many Relationships:
- **Questions ↔ Tags**: Many questions can have many tags
- **Users ↔ Questions**: Many users can ask many questions
- **Users ↔ Answers**: Many users can provide many answers

## System Features & Design Patterns

### Core Features:
1. **User Management** - Create users with reputation system
2. **Question Management** - Ask questions with tags and search
3. **Answer Management** - Provide and accept answers
4. **Comment System** - Add comments to answers
5. **Voting System** - Upvote/downvote content
6. **Search Functionality** - Search by title, content, or tags

### Design Patterns Used:
- **Repository Pattern**: StackOverflow class manages all entities
- **Strategy Pattern**: VoteType enum for different voting strategies
- **Observer Pattern**: Voting updates user reputation
- **Interface Segregation**: Votable and Commentable interfaces

### Data Flow:
```
User Action → StackOverflow → Entity Creation/Update → Reputation Update
```

This UML representation shows the complete architecture of the StackOverflow system with all classes, their relationships, and the system's functionality. 