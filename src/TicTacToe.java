package src;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char currentPlayer = 'X';
        boolean gameWon = false;

        while (!gameWon) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                gameWon = checkWin(board, currentPlayer);
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch player
            } else {
                System.out.println("This move is not valid. Try again.");
            }
        }
        printBoard(board);
        System.out.println("Player " + (currentPlayer == 'X' ? 'O' : 'X') + " wins!");
        scanner.close();
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println(row[0] + "|" + row[1] + "|" + row[2]);
            System.out.println("-----");
        }
    }

    private static boolean checkWin(char[][] board, char player) {
        // Check rows, columns and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }
}
