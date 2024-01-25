// Version 3

package Challenges;

import java.util.Scanner;

public class Tictactoe3 {
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
        if (board[userRow][userColumn] == ' ') {
            board[userRow][userColumn] = currentPlayer;
        } else {
            System.out.println("This cell is occupied!"); 
            getUserInput(currentPlayer); // Let it choose again with the same piece
        }
        
    }
    
    public void switchPlayer() {
        // switch player after each move
        // if currentPlayer is X makes it O. then if currentPlayer is not X makes it O.
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    
    public boolean checkWinner() {
        if (board[0][0] == currentPlayer && board[0][1] == currentPlayer && board[0][2] == currentPlayer || // Horizontal
                board[1][0] == currentPlayer && board[1][1] == currentPlayer && board[1][2] == currentPlayer ||
                board[2][0] == currentPlayer && board[2][1] == currentPlayer && board[2][2] == currentPlayer ||
                board[0][0] == currentPlayer && board[1][0] == currentPlayer && board[2][0] == currentPlayer || // Vertical
                board[0][1] == currentPlayer && board[1][1] == currentPlayer && board[2][1] == currentPlayer ||
                board[0][2] == currentPlayer && board[1][2] == currentPlayer && board[2][2] == currentPlayer ||
                board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer || // Diagonal
                board[2][0] == currentPlayer && board[1][1] == currentPlayer && board[0][2] == currentPlayer) {
            System.out.println("Player: " + currentPlayer + "wins");
            return true;
        } else {
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        Tictactoe3 tictactoe = new Tictactoe3();
        tictactoe.createBoard();
        tictactoe.printBoard();
        for (int i = turns; i < 9; i++) {
            tictactoe.getUserInput(currentPlayer);
            tictactoe.printBoard();
            if (tictactoe.checkWinner()) {
                break;
            }
            if (i == 8) {
                System.out.println("It's a draw");
                break;
            }
            tictactoe.switchPlayer();
        }
    }
}
