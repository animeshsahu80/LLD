package org.LLDSnakeAndLadder;

public class Player {
    String id;
    int currentPosition;

    public void setId(String id) {
        this.id = id;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getId() {
        return id;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    Player(String id, int currentPosition){
        this.id=id;
        this.currentPosition=currentPosition;
    }
}
