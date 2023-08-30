import java.util.Random;
import java.util.Scanner;

public class TicTacToePlayerVsComputer {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                board[r][c] = ' ';
            }
        }

        boolean gameOver = false;
        char player = 'X';
        char computer = 'O';

        while (!gameOver) {
            showBoard(board);

            if (player == 'X') {
                playerMove(board, player);
            } else {
                computerMove(board, computer);
            }

            if (isWin(board, player)) {
                showBoard(board);
                System.out.println("Player X wins!");
                gameOver = true;
            } else if (isWin(board, computer)) {
                showBoard(board);
                System.out.println("Player O wins!");
                gameOver = true;
            } else if (isBoardFull(board)) {
                showBoard(board);
                System.out.println("It's a draw!");
                gameOver = true;
            }

            player = (player == 'X') ? 'O' : 'X';
        }
    }

    public static void playerMove(char[][] board, char player) {
        System.out.println("Player " + player + ", enter row and column (0-2):");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = player;
        } else {
            System.out.println("Invalid move, try again!");
            playerMove(board, player); // Retry the move
        }
    }

    public static void computerMove(char[][] board, char computer) {
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (board[row][col] != ' ');
        board[row][col] = computer;
    }

    public static boolean isWin(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // Check rows
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // Check columns
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // Check left diagonal
        }
        return board[0][2] == player && board[1][1] == player && board[2][0] == player; // Check right diagonal
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void showBoard(char[][] board) {
        System.out.println("-------------");
        for (int r = 0; r < 3; r++) {
            System.out.print("| ");
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
