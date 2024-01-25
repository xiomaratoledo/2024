// Version 1
package Challenges;

import java.util.Scanner;

public class Tictactoe1 {
    char[][] board;
    int userRow;
    int userColumn;
    Scanner scanner = new Scanner(System.in);
    
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
    
    public void getUserInput(char symbol) {
        System.out.println("Place your move: " + symbol + " for row 1 - 3");
        userRow = scanner.nextInt() - 1;
        if (userRow >= 0 || userRow <= 2) {
            System.out.println("valid input");
        } else {
            System.out.println("Please input the number from valid range");
            getUserInput(symbol);
        }
        System.out.println("Place your move: " + symbol + " for column 1 - 3");
        userColumn = scanner.nextInt() - 1;
        if (userColumn >= 0 || userColumn <= 2) {
            System.out.println("valid Input");
        } else {
            System.out.println("Please input the number from valid range");
            getUserInput(symbol);
        }
        placeMove(symbol);
    }
    
    public void placeMove(char symbol) {
        board[userRow][userColumn] = symbol;
    }
    
    public static void main(String[] args) {
        Tictactoe1 tictactoe = new Tictactoe1();
        tictactoe.createBoard();
        tictactoe.printBoard();
        tictactoe.getUserInput('X');
        tictactoe.placeMove('X');
        tictactoe.printBoard();
        tictactoe.getUserInput('O');
        tictactoe.placeMove('O');
        tictactoe.printBoard();
    }
}
