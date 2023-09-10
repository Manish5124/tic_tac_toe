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
        int count=9;
        boolean gameOver = false;
        char player = 'X';
        int row=-1,col=-1;
        while(!gameOver && count>0)
        {
            count--;
            showBoard(board);
            System.out.println("player "+player+" Enter: ");
            Scanner sc = new Scanner(System.in);

           if(player=='X') {
               int rowCheck = sc.nextInt();
//               int row = 0;
               if (rowCheck < 3) {
                   row = rowCheck;
               } else {
                   System.out.println("please enter the row value less than 3 ");
                   row = sc.nextInt();
               }
               int colCheck = sc.nextInt();
//               int col = 0;
               if (colCheck < 3) {
                   col = colCheck;
               } else {
                   System.out.println("please enter the row value less than 3 ");
                   col = sc.nextInt();
               }
           }
           else {

//               corner cases
//               System.out.println(" player is "+player+" ");


//               for(int i=0;i<3;i++)
//               {
//                   if((board[i][0]=='0' && board[i][1]=='0') && board[i][2]==' ')
//                   {
//                     row=i;
//                     col=2;
//                   }
//               }

                    boolean flag=false;
                   for (int i = 0; i < 3; i++) {
                       // Check rows and columns
                       if ((board[i][0] == '0' && board[i][1] == '0' && board[i][2] == ' ') ) {
//                           if (board[i][2] == ' ') {
                               row = i;
                               col = 2;
                           flag=true;
                               break;

                           }
                       else if (board[0][i] == '0' && board[1][i] == '0' && board[2][i] == ' ') {
                               row = 2;
                               col = i;
                           flag=true;
                               break;

                           }
                       else if ((board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == ' ') ) {
//                           if (board[i][2] == ' ') {
                               row = i;
                               col = 2;
                           flag=true;
                               break;
                           }
                       else if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == ' ') {
                               row = 2;
                               col = i;
                           flag=true;
                               break;
                           }
                       }

//                       }
//                        if ((board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == ' ') ||
//                               (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == ' ')) {
//                           row = (board[i][2] == ' ') ? i : (board[2][i] == ' ') ? 2 : -1;
//                           col = (board[i][2] == ' ') ? 2 : (board[2][i] == ' ') ? i : -1;
//                           break;
//                       }
                        if(flag)
                        {

                        }
                        else if (board[0][0] == '0' && ((board[0][2] == '0' && board[0][1] == ' ') || board[2][0] == '0' && board[1][0] == ' ')) {
                       row = (board[0][1] == ' ') ? 0 : (board[1][0] == ' ') ? 1 : -1;
                       col = (board[0][1] == ' ') ? 1 : (board[1][0] == ' ') ? 0 : -1;
                   }
                   else if (board[2][2] == '0' && ((board[2][0] == '0' && board[2][1] == ' ') || board[0][2] == '0' && board[1][2] == ' ')) {
                       row = (board[2][1] == ' ') ? 2 : (board[1][2] == ' ') ? 1 : -1;
                       col = (board[2][1] == ' ') ? 1 : (board[1][2] == ' ') ? 2 : -1;
                   } else if ((board[0][1] == '0' && board[2][1] == '0' && board[1][1] == ' ')
                           || (board[1][0] == '0' && board[1][2] == '0' && board[1][1] == ' ')) {
                       row = 1;
                       col = 1;
//                            break;
                   } else if ((board[0][0] == '0' && board[2][2] == '0' && board[1][1] == ' ')
                           || (board[2][0] == '0' && board[0][2] == '0' && board[1][1] == ' ')) {
                       row = 1;
                       col = 1;
//                            break;
                   } else if ((board[0][0] == '0' && board[1][1] == '0' && board[2][2] == ' ') ||
                           (board[0][2] == '0' && board[1][1] == '0' && board[2][0] == ' ')) {
                       row = (board[2][2] == ' ' || board[2][0] == ' ') ? 2 : -1;
                       col = (board[2][2] == ' ') ? 2 : (board[2][0] == ' ') ? 0 : -1;
//                            break;
                   } else if ((board[2][0] == '0' && board[1][1] == '0' && board[0][2] == ' ') ||
                           (board[2][2] == '0' && board[1][1] == '0' && board[0][0] == ' ')) {
                       row = (board[0][2] == ' ' || board[0][0] == ' ') ? 0 : -1;
                       col = (board[0][2] == ' ') ? 2 : (board[2][0] == ' ') ? 0 : -1;
//                            break;
                   }
                   else  if (board[0][0] == 'X' && ((board[0][2] == 'X' && board[0][1] == ' ') || board[2][0] == 'X' && board[1][0] == ' ')) {
                       row = (board[0][1] == ' ') ? 0 : (board[1][0] == ' ') ? 1 : -1;
                       col = (board[0][1] == ' ') ? 1 : (board[1][0] == ' ') ? 0 : -1;
                   }
                   else if (board[2][2] == 'X' && ((board[2][0] == 'X' && board[2][1] == ' ') || board[0][2] == 'X' && board[1][2] == ' ')) {
                       row = (board[2][1] == ' ') ? 2 : (board[1][2] == ' ') ? 1 : -1;
                       col = (board[2][1] == ' ') ? 1 : (board[1][2] == ' ') ? 2 : -1;
                   } else if ((board[0][1] == 'X' && board[2][1] == 'X' && board[1][1] == ' ')
                           || (board[1][0] == 'X' && board[1][2] == 'X' && board[1][1] == ' ')) {
                       row = 1;
                       col = 1;
//                            break;
                   } else if ((board[0][0] == 'X' && board[2][2] == 'X' && board[1][1] == ' ')
                           || (board[2][0] == 'X' && board[0][2] == 'X' && board[1][1] == ' ')) {
                       row = 1;
                       col = 1;
//                            break;
                   } else if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == ' ') ||
                           (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == ' ')) {
                       row = (board[2][2] == ' ' || board[2][0] == ' ') ? 2 : -1;
                       col = (board[2][2] == ' ') ? 2 : (board[2][0] == ' ') ? 0 : -1;
//                            break;
                   } else if ((board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == ' ') ||
                           (board[2][2] == 'X' && board[1][1] == 'X' && board[0][0] == ' ')) {
                       row = (board[0][2] == ' ' || board[0][0] == ' ') ? 0 : -1;
                       col = (board[0][2] == ' ') ? 2 : (board[2][0] == ' ') ? 0 : -1;
//                            break;
                   }
                   else {

                       do {
                           int prevrow = row;
                           int prevcol = col;
                           row = prevnotequal(prevrow);
                           col = prevnotequal(prevcol);
                       } while (board[row][col] != ' ');

                   }
           }

//                if (row == -1) {
//                   for (int i = 0; i < 3; i++) {
//                       for (int j = 0; j < 3; j++) {
//                           // Check for empty cells
//                           if (board[i][j] == ' ') {
//                               row = i;
//                               col = j;
//                               break;
//                           }
//                       }
//                       if (row != -1) {
//                           break;
//                       }
//                   }
//               }

//               if( (board[0][0]=='0' && board[2][0]=='0') && board[1][0]==' ' )
//               {
//                   row=1;
//                   col=0;
//
//               }
//             else  if( board[2][0]=='0'  && board[2][2]=='0' && board[2][1]==' ' )
//               {
//                   row=2;
//                   col=1;
//
//               }
//             else  if( board[2][2]=='0'  && board[0][2]=='0' && board[1][2]==' ' )
//               {
//                   row=1;
//                   col=2;
//
//               }
//               else if ( board[0][2]=='0'  && board[0][0]=='0' && board[0][1]==' ' )
//               {
//                   row=0;
//                   col=1;
//               }
////               diogoanl cases
//              else if((board[0][0]=='0'  && board[2][2]=='0' && board[1][1]==' ' ) || (board[2][0]=='0'  && board[0][2]=='0' && board[1][1]==' ' ))
//               {
//                   row= 1;
//                   col=1;
//               }
//               else if(board[0][0]=='0'  && board[1][1]=='0' && board[2][2]==' ')
//               {
//                    row=2;
//                    col=2;
//               }
//               else if(board[2][0]=='0'  && board[1][1]=='0' && board[0][2]==' ')
//               {
//                   row=0;
//                   col=2;
//               }
//               else if(board[2][2]=='0'  && board[1][1]=='0'  && board[0][0]==' ')
//               {
//                   row=0;
//                   col=0;
//               }
//               else if(board[0][2]=='0'  && board[1][1]=='0' && board[2][0]==' ' )
//               {
//                   row=2;
//                   col=0;
//               }
//               else if(board[1][0]=='0' && board[1][2]=='0' && board[1][1]==' ' )
//               {
//                   row=1;
//                   col=1;
//               }
//               else if(board[0][1]=='0' && board[2][1]=='0' && board[1][1]==' ')
//               {
//                   row=1;
//                   col=1;
//               }
////               row col cases
//               else  if(board[0][0]=='0'  && board[0][1]=='0' && board[0][2]==' ' )
//               {
//                   row=0;
//                   col=2;
//               }
//               else  if(board[0][1]=='0'  && board[0][2]=='0' && board[0][0]==' ' )
//               {
//                   row=0;
//                   col=0;
//               }
//                else  if(board[1][0]=='0'  && board[1][1]=='0' && board[1][2]==' ')
//               {
//                   row=1;
//                   col=2;
//               }
//               else  if(board[1][1]=='0'  && board[1][2]=='0'  && board[1][0]==' ')
//               {
//                   row=1;
//                   col=0;
//               }
//               else  if(board[2][0]=='0'  && board[2][1]=='0' && board[2][2]==' ')
//               {
//                   row=2;
//                   col=2;
//               }
//               else if(board[2][1]=='0'  && board[2][2]=='0' && board[2][0]==' ' )
//               {
//                   row=2;
//                   col=0;
//               }
//               else if(board[0][0]=='0'  && board[1][0]=='0' && board[2][0]==' ' )
//               {
//                   row=2;
//                   col=0;
//               }
//               else if(board[1][0]=='0'  && board[2][0]=='0' && board[0][0]==' ')
//               {
//                   row=0;
//                   col=0;
//               }
//               else if(board[0][1]=='0'  && board[1][1]=='0' && board[2][1]==' ')
//               {
//                   row=2;
//                   col=1;
//               }
//               else if(board[1][1]=='0'  && board[2][1]=='0'  && board[0][1]==' ')
//               {
//                   row=0;
//                   col=1;
//               }
//               else if(board[0][2]=='0'  && board[1][2]=='0' && board[2][2]==' ')
//               {
//                   row=2;
//                   col=2;
//               }
//               else if(board[1][2]=='0'  && board[2][2]=='0' && board[0][2]==' ' )
//               {
//                   row=0;
//                   col=2;
//               }
//            else  if( board[0][0]=='X' && board[2][0]=='X' && board[1][0]==' ')
//               {
//                   row=1;
//                   col=0;
//
//               }
//               else  if( board[2][0]=='X'  && board[2][2]=='X'  && board[2][1]==' ')
//               {
//                   row=2;
//                   col=1;
////                   System.out.println("board[2][0]=='0'  && board[2][2]=='0'");
//               }
//               else  if( board[2][2]=='X'  && board[0][2]=='X' && board[1][2]==' ')
//               {
//                   row=1;
//                   col=2;
//
//               }
//               else if ( board[0][2]=='X'  && board[0][0]=='X' && board[0][1]==' ' )
//               {
//                   row=0;
//                   col=1;
//               }
////               diogoanl cases
//               else if((board[0][0]=='X'  && board[2][2]=='X' && board[1][1]==' ' ) || (board[2][0]=='X'  && board[0][2]=='X' && board[1][1]==' '))
//               {
//                   row= 1;
//                   col=1;
//               }
//               else if(board[0][0]=='X'  && board[1][1]=='X' && board[2][2]==' ' )
//               {
//                   row=2;
//                   col=2;
//               }
//               else if(board[2][0]=='X'  && board[1][1]=='X' && board[0][2]==' ' )
//               {
//                   row=0;
//                   col=2;
//               }
//               else if(board[2][2]=='X'  && board[1][1]=='X' && board[0][0]==' ')
//               {
//                   row=0;
//                   col=0;
//               }
//               else if(board[0][2]=='X'  && board[1][1]=='X' && board[2][0]==' ' )
//               {
//                   row=2;
//                   col=0;
//               }
//               else if(board[1][0]=='X' && board[1][2]=='X' && board[1][1]==' ' )
//               {
//                   row=1;
//                   col=1;
//               }
//               else if(board[0][1]=='X' && board[2][1]=='X' && board[1][1]==' ')
//               {
//                   row=1;
//                   col=1;
//               }
////               row col cases
//               else  if(board[0][0]=='X'  && board[0][1]=='X' && board[0][2]==' ' )
//               {
//                   row=0;
//                   col=2;
//               }
//               else  if(board[0][1]=='X'  && board[0][2]=='X' && board[0][0]==' ' )
//               {
//                   row=0;
//                   col=0;
//               }
//               else  if(board[1][0]=='X'  && board[1][1]=='X' && board[1][2]==' ' )
//               {
//                   row=1;
//                   col=2;
//               }
//               else  if(board[1][1]=='X'  && board[1][2]=='X' && board[1][0]==' ')
//               {
//                   row=1;
//                   col=0;
//               }
//               else  if(board[2][0]=='X'  && board[2][1]=='X' && board[2][2]==' ' )
//               {
//                   row=2;
//                   col=2;
//               }
//               else if(board[2][1]=='X'  && board[2][2]=='X' && board[2][0]==' ')
//               {
//                   row=2;
//                   col=0;
//               }
//               else if(board[0][0]=='X'  && board[1][0]=='X' && board[2][0]==' ')
//               {
//                   row=2;
//                   col=0;
//               }
//               else if(board[1][0]=='X'  && board[2][0]=='X' && board[0][0]==' ' )
//               {
//                   row=0;
//                   col=0;
//               }
//               else if(board[0][1]=='X'  && board[1][1]=='X' && board[2][1]==' ')
//               {
//                   row=2;
//                   col=1;
//               }
//               else if(board[1][1]=='X'  && board[2][1]=='X' && board[0][1]==' ')
//               {
//                   row=0;
//                   col=1;
//               }
//               else if(board[0][2]=='X'  && board[1][2]=='X' && board[2][2]==' ')
//               {
//                   row=2;
//                   col=2;
//               }
//               else if(board[1][2]=='X'  && board[2][2]=='X' && board[0][2]==' ' )
//               {
//                   row=0;
//                   col=2;
//               }
//               else {
//                    do {
//                        int prevrow = row;
//                        int prevcol = col;
//                        row = prevnotequal(prevrow);
//                        col = prevnotequal(prevcol);
//                    }while(board[row][col] != ' ');
//                }
//


//           }


            if(board[row][col]==' ') {
                board[row][col] = player;
                gameOver = isWin(board,player);
                if(gameOver)
                {
                    showBoard(board);
                    System.out.println("player "+player+" win the game!");
                }
                else{
                    if(player=='X')
                        player='0';
                    else
                        player='X';
                }
                if(count==0)
                {
                    System.out.println("It's a draw!");
                }
            }
            else {
                System.out.println("Invalid move try again!!");
            }

        }

    }


    public  static  int prevnotequal(int val)
    {
        Random random = new Random();
        while(true)
        {
            int randomVal = random.nextInt(3); // Generates a random number between 0 (inclusive) and 4 (exclusive)
//            int randomCol = random.nextInt(3);
            if(val !=randomVal)
            {
             val = randomVal;
             break;
            }
        }
        return  val;
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
