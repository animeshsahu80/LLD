package org.LLDSnakeAndLadder;

import java.util.Random;

public class Board {
    Cell[][] cells;
    Board(int boardSize, int numOfSnakes, int numOfLadders){
        intializeCells(boardSize);
        addSnakesAndLadders(cells,numOfSnakes,numOfLadders);
    }
    public void intializeCells(int boardSize){
        cells= new Cell[boardSize][boardSize];
        for(int i=0;i<boardSize;i++){
            for (int j=0;j<boardSize;j++){
                Cell cellObj = new Cell();
                cells[i][j]=cellObj;
            }
        }
    }

    public void addSnakesAndLadders(Cell[][] cells, int numOfSnakes,int numOfLadders){
        while(numOfSnakes>0){
            Random random = new Random();

            int snakeTail= random.nextInt(cells.length* cells.length-1) + 1;
            int snakeHead= random.nextInt(cells.length* cells.length-1) + 1;
            if(snakeTail>=snakeHead){
                continue;
            }

            Jump snakeObj= new Jump();
            snakeObj.start=snakeHead;
            snakeObj.end= snakeTail;
            Cell cell= getCell(snakeHead);
            cell.jump= snakeObj;
            numOfSnakes--;

        }

        while(numOfLadders>0){
            Random random = new Random();

            int ladderTail= random.nextInt(cells.length* cells.length-1) + 1;
            int ladderHead= random.nextInt(cells.length* cells.length-1) + 1;
            if(ladderHead>=ladderTail){
                continue;
            }

            Jump ladderObj= new Jump();
            ladderObj.start=ladderHead;
            ladderObj.end= ladderTail;
            Cell cell= getCell(ladderHead);
            cell.jump= ladderObj;
            numOfLadders--;

        }

    }

    public Cell getCell(int location){
        int row= location/cells.length;
        int col= location % cells.length;
        return cells[row][col];
    }
}
