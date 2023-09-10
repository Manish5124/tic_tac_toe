import java.util.Random;
import java.util.Scanner;

public class tictactoe2 {
    public static void main(String[] args) {
        char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int PlayerTurn = 1;
        boolean GameOver = false;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        do {

            printBoard(board);

            // Set player marker: Player 1 uses X and the computer uses O
            char cPlayerMark = (PlayerTurn == 1) ? 'X' : '0';

            if (PlayerTurn == 1) {

                System.out.println("Player X's move:");
                int userMove = getUserMove(board, scanner);
                board[userMove - 1] = cPlayerMark;
            } else {

                System.out.println("Computer's move:");
                int computerMove = getComputerMove(board, cPlayerMark,random);
                board[computerMove] = cPlayerMark;
            }

            // Check for end of game conditions
            if (checkWin(board, cPlayerMark)) {
                printBoard(board);
                if (PlayerTurn == 1) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Computer wins!");
                }
                GameOver = true;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("It's a draw!");
                GameOver = true;
            }

            // Switch player turns
            PlayerTurn = (PlayerTurn == 1) ? 2 : 1;

        } while (!GameOver);
    }

    private static void printBoard(char[] board) {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    private static int getUserMove(char[] board, Scanner scanner) {
        int userMove;
        while (true) {
            userMove = scanner.nextInt();
            if (userMove >= 1 && userMove <= 9 && board[userMove - 1] == (char) (userMove + '0')) {
                break;
            } else {
                System.out.println("Invalid Move. Try again.");
            }
        }
        return userMove;
    }

    private static int getComputerMove(char[] board, char cplayer,Random random) {
//        if(cplayer=='0')
//                cplayer='X';
        int computerMove;
        while (true) {

            if(board[0]=='0' && board[1]=='0' && board[2] == (char) (2 + '1'))
            {
                computerMove=2;
                break;
            }
            else if(board[0]=='0' && board[1]=='0' && board[1] == (char) (1 + '1'))
            {
                computerMove=1;
                break;
            }
            else if(board[0]=='0' && board[1]=='0'&& board[0] == (char) (0 + '1'))
            {
                computerMove=0;
                break;
            }
            else if(board[3]=='0' && board[4]=='0' && board[5] == (char) (5 + '1'))
            {
                computerMove=5;
                break;
            }
            else if(board[3]=='0' && board[5]=='0' && board[4] == (char) (4 + '1'))
            {
                computerMove=4;
                break;
            }
            else if(board[4]=='0' && board[5]=='0'&& board[3] == (char) (3 + '1'))
            {
                computerMove=3;
                break;
            }
            else if(board[6]=='0' && board[7]=='0' && board[8] == (char) (8 + '1'))
            {
                computerMove=8;
                break;
            }
            else if(board[6]=='0' && board[8]=='0' && board[7] == (char) (7 + '1'))
            {
                computerMove=7;
                break;
            }
            else if(board[7]=='0' && board[8]=='0'&& board[6] == (char) (6 + '1'))
            {
                computerMove=6;
                break;
            }
//            column
            else if(board[0]=='0' && board[3]=='0' && board[6] == (char) (6 + '1'))
            {
                computerMove=6;
                break;
            }
            else if(board[0]=='0' && board[6]=='0' && board[3] == (char) (3 + '1'))
            {
                computerMove=3;
                break;
            }
            else if(board[3]=='0' && board[6]=='0'&& board[0] == (char) (0 + '1'))
            {
                computerMove=0;
                break;
            }

            else if(board[1]=='0' && board[4]=='0' && board[7] == (char) (7 + '1'))
            {
                computerMove=7;
                break;
            }
            else if(board[1]=='0' && board[7]=='0' && board[4] == (char) (4 + '1'))
            {
                computerMove=4;
                break;
            }
            else if(board[4]=='0' && board[7]=='0'&& board[1] == (char) (1 + '1'))
            {
                computerMove=1;
                break;
            }
            else if(board[2]=='0' && board[5]=='0' && board[8] == (char) (8 + '1'))
            {
                computerMove=8;
                break;
            }
            else if(board[2]=='0' && board[8]=='0' && board[5] == (char) (5 + '1'))
            {
                computerMove=5;
                break;
            }
            else if(board[5]=='0' && board[8]=='0'&& board[2] == (char) (2 + '1'))
            {
                computerMove=2;
                break;
            }
            else if(board[0]=='0' && board[8]=='0'&& board[4] == (char) (4 + '1'))
            {
                computerMove=4;
                break;
            }
            else if(board[0]=='0' && board[4]=='0'&& board[8] == (char) (8 + '1'))
            {
                computerMove=8;
                break;
            }
            else if(board[5]=='0' && board[8]=='0'&& board[0] == (char) (0 + '1'))
            {
                computerMove=0;
                break;
            }
            else if(board[2]=='0' && board[6]=='0'&& board[4] == (char) (4 + '1'))
            {
                computerMove=4;
                break;
            }
            else if(board[2]=='0' && board[4]=='0'&& board[6] == (char) (6 + '1'))
            {
                computerMove=6;
                break;
            }
            else if(board[4]=='0' && board[6]=='0'&& board[2] == (char) (2 + '1'))
            {
                computerMove=2;
                break;
            }
//            prevent krne ke liye
            else  if(board[0]=='X' && board[1]=='X' && board[2] == (char) (2 + '1'))
            {
                computerMove=2;
                break;
            }
            else if(board[0]=='X' && board[1]=='X' && board[1] == (char) (1 + '1'))
            {
                computerMove=1;
                break;
            }
            else if(board[0]=='X' && board[1]=='X'&& board[0] == (char) (0 + '1'))
            {
                computerMove=0;
                break;
            }
            else if(board[3]=='X' && board[4]=='X' && board[5] == (char) (5 + '1'))
            {
                computerMove=5;
                break;
            }
            else if(board[3]=='X' && board[5]=='X' && board[4] == (char) (4 + '1'))
            {
                computerMove=4;
                break;
            }
            else if(board[4]=='X' && board[5]=='X'&& board[3] == (char) (3 + '1'))
            {
                computerMove=3;
                break;
            }
            else if(board[6]=='X' && board[7]=='X' && board[8] == (char) (8 + '1'))
            {
                computerMove=8;
                break;
            }
            else if(board[6]=='X' && board[8]=='X' && board[7] == (char) (7 + '1'))
            {
                computerMove=7;
                break;
            }
            else if(board[7]=='X' && board[8]=='X'&& board[6] == (char) (6 + '1'))
            {
                computerMove=6;
                break;
            }
//            column
            else if(board[0]=='X' && board[3]=='X' && board[6] == (char) (6 + '1'))
            {
                computerMove=6;
                break;
            }
            else if(board[0]=='X' && board[6]=='X' && board[3] == (char) (3 + '1'))
            {
                computerMove=3;
                break;
            }
            else if(board[3]=='X' && board[6]=='X'&& board[0] == (char) (0 + '1'))
            {
                computerMove=0;
                break;
            }

            else if(board[1]=='X' && board[4]=='X' && board[7] == (char) (7 + '1'))
            {
                computerMove=7;
                break;
            }
            else if(board[1]=='X' && board[7]=='X' && board[4] == (char) (4 + '1'))
            {
                computerMove=4;
                break;
            }
            else if(board[4]=='X' && board[7]=='X'&& board[1] == (char) (1 + '1'))
            {
                computerMove=1;
                break;
            }
            else if(board[2]=='X' && board[5]=='X' && board[8] == (char) (8 + '1'))
            {
                computerMove=8;
                break;
            }
            else if(board[2]=='X' && board[8]=='X' && board[5] == (char) (5 + '1'))
            {
                computerMove=5;
                break;
            }
            else if(board[5]=='X' && board[8]=='X'&& board[2] == (char) (2 + '1'))
            {
                computerMove=2;
                break;
            }
            else if(board[0]=='X' && board[8]=='X'&& board[4] == (char) (4 + '1'))
            {
                computerMove=4;
                break;
            }
            else if(board[0]=='X' && board[4]=='X'&& board[8] == (char) (8 + '1'))
            {
                computerMove=8;
                break;
            }
            else if(board[5]=='X' && board[8]=='X'&& board[0] == (char) (0 + '1'))
            {
                computerMove=0;
                break;
            }
            else if(board[2]=='X' && board[6]=='X'&& board[4] == (char) (4 + '1'))
            {
                computerMove=4;
                break;
            }
            else if(board[2]=='X' && board[4]=='X'&& board[6] == (char) (6 + '1'))
            {
                computerMove=6;
                break;
            }
            else if(board[4]=='X' && board[6]=='X'&& board[2] == (char) (2 + '1'))
            {
                computerMove=2;
                break;
            }

            else{
                computerMove = random.nextInt(9);
                if (board[computerMove] == (char) (computerMove + '1')) {
                    break;
                }
            }

        }
        return computerMove;
    }

    private static boolean checkWin(char[] board, char playerMark) {
        return (board[0] == playerMark && board[1] == playerMark && board[2] == playerMark) ||
                (board[3] == playerMark && board[4] == playerMark && board[5] == playerMark) ||
                (board[6] == playerMark && board[7] == playerMark && board[8] == playerMark) ||
                (board[0] == playerMark && board[3] == playerMark && board[6] == playerMark) ||
                (board[1] == playerMark && board[4] == playerMark && board[7] == playerMark) ||
                (board[2] == playerMark && board[5] == playerMark && board[8] == playerMark) ||
                (board[0] == playerMark && board[4] == playerMark && board[8] == playerMark) ||
                (board[2] == playerMark && board[4] == playerMark && board[6] == playerMark);
    }

    private static boolean isBoardFull(char[] board) {
        for (char c : board) {
            if (c != 'X' && c != 'O') {
                return false;
            }
        }
        return true;
    }
}
