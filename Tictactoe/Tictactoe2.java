// Version 2
package Challenges;

import java.util.Scanner;

public class Tictactoe2 {
    char[][] board;
    int userRow;
    int userColumn;
    Scanner scanner = new Scanner(System.in);
    static int turns = 0;
    static char currentPlayer = 'X'; // I put X here because it is the first move
    
    public void createBoard() {
        board = new char[][] { 
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
        };
    }
    
    public void printBoard() {
        System.out.println("-------");
        System.out.println("|" + board[0][0] + " " + board[0][1] + " " + board[0][2] + "|");
        System.out.println("|" + board[1][0] + " " + board[1][1] + " " + board[1][2] + "|");
        System.out.println("|" + board[2][0] + " " + board[2][1] + " " + board[2][2] + "|");
        System.out.println("-------");
    }
    
    public void getUserInput(char currentPlayer) {
        System.out.println("Place your move: " + currentPlayer + " for row 1 - 3");
        userRow = scanner.nextInt() - 1;
        if (userRow >= 0 && userRow <= 2) {
            System.out.println("valid input");
        } else {
            System.out.println("Please input the number from valid range");
            getUserInput(currentPlayer);
        }
        System.out.println("Place your move: " + currentPlayer + " for column 1 - 3");
        userColumn = scanner.nextInt() - 1;
        if (userColumn >= 0 && userColumn <= 2) {
            System.out.println("valid Input");
        } else {
            System.out.println("Please input the number from valid range");
            getUserInput(currentPlayer);
        }
        placeMove(currentPlayer);
    }
    
    public void placeMove(char currentPlayer) {
        board[userRow][userColumn] = currentPlayer;
    }
    
    public void switchPlayer() {
        // switch player after each move
        // if currentPlayer is X makes it O. then if currentPlayer is not X makes it O.
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    
    public static void main(String[] args) {
        Tictactoe2 tictactoe = new Tictactoe2();
        tictactoe.createBoard();
        tictactoe.printBoard();
        for (int i = turns; i < 9; i++) {
            tictactoe.getUserInput(currentPlayer);
            tictactoe.printBoard();
            tictactoe.switchPlayer();
        }
    }
}
