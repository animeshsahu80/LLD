package org.LLDSnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playersList=new LinkedList<>();
    Player winner;
    Game(){
        initializeGame();
    }

    public void initializeGame(){
        this.board = new Board(10,4,5);
        this.dice = new Dice(1);
        this.winner=null;
        addPlayers();
    }
    public  void  addPlayers(){
        Player player1= new Player("Player 1", 0);
        Player player2= new Player("Player 2", 0);
        playersList.add(player1);
        playersList.add(player2);

    }

    public  void  startGame(){
        while(winner==null){
            Player player= nextPlayerTurn();
            System.out.println("player turn is: " + player.id + " current position is: " + player.currentPosition);
            int diceNumbers = dice.rollDice();
            int playerNewPosition = player.currentPosition + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            player.currentPosition= playerNewPosition;
            System.out.println("player turn is:" + player.id + " new Position is: " + playerNewPosition);


            if(playerNewPosition >= board.cells.length * board.cells.length-1){

                winner = player;
            }



        }
        System.out.println("WINNER IS:" + winner.id);


    }
    private int jumpCheck (int playerNewPosition) {

        if(playerNewPosition > board.cells.length * board.cells.length-1 ){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump != null && cell.jump.start == playerNewPosition) {
            String jumpBy = (cell.jump.start < cell.jump.end)? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }

    private Player nextPlayerTurn() {

        Player playerTurns = playersList.removeFirst();
        playersList.addLast(playerTurns);
        return playerTurns;
    }

}
