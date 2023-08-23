import  java.util.*;
public class tictactoe {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for(int r=0;r<board.length;r++)
        {
            for(int c=0;c< board[0].length;c++)
            {
                board[r][c]= ' ';
            }
        }
        boolean gameOver = false;
        char player = 'X';

        while(!gameOver)
        {
            showBoard(board);
            System.out.println("player "+player+" Enter: ");
            Scanner sc = new Scanner(System.in);
            int rowCheck = sc.nextInt();
            int row=0;
            if(rowCheck<3)
            {
                row = rowCheck;
            }
            else
            {
                System.out.println("please enter the row value less than 3 ");
                row = sc.nextInt();
            }
            int colCheck = sc.nextInt();
            int col=0;
            if(colCheck<3)
            {
                col = colCheck;
            }
            else
            {
                System.out.println("please enter the row value less than 3 ");
                col = sc.nextInt();
            }
            if(board[row][col]==' ') {
                board[row][col] = player;
                gameOver = isWin(board,player);
                if(gameOver)
                {
                    System.out.println("player "+player+" win the game!");
                }
                else{
                    if(player=='X')
                        player='0';
                    else
                        player='X';
                }
            }
            else {
                System.out.println("Invalid move try again!!");
            }

        }

    }
    public  static boolean isWin(char[][] board,char player)
    {

//        check all row
        for(int r=0;r<board.length;r++)
        {
            if(board[r][0]==player && board[r][1]==player && board[r][2]==player)
                return true;
        }

//        check all column
        for(int c=0;c< board[0].length;c++)
        {
            if(board[0][c]==player && board[1][c]==player && board[2][c]==player)
                return true;
        }

//        check left diagonal
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player)
            return  true;

//        check right diagonal
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player)
            return true;

        return false;
    }
    public static void showBoard(char[][] board)
    {
        for(int r=0;r<board.length;r++)
        {

            for(int c=0;c<board.length;c++)
            {
                System.out.print(board[r][c]);
                if(c< board.length-1)
                    System.out.print(" | ");

            }
            System.out.println();

        }
    }




}
