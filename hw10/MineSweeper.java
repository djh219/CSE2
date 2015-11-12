//Derek Huber
//CSE002
//Homework 10
import java.util.Scanner;
public class MineSweeper{
    public static void main(String [] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the size of the board (2-30): ");
        int N = myScanner.nextInt();
        if (N<2 || N>30){
            System.out.println("Invalid Size");
            System.exit(-1);
        }
        System.out.print("Enter the number of mines: ");
        int M = myScanner.nextInt();
        if (M<1 || M>(N*N)){
            System.out.println("Invalid Number");
            System.exit(-1);
        }
        
        char [] [] boardArray = new char [N][N];
        
        for (int i=0; i<M; i++){
            boardArray[(int)(Math.random()*N)][(int)(Math.random()*N)]='M';
        }
        for (int x=0; x<N; x++){
            for (int y=0; y<N; y++){
                if (boardArray[x][y]=='M'){
                    if (x!=0 && boardArray[x-1][y]!='M'){
                        if (boardArray[x-1][y]=='1'){
                            boardArray[x-1][y]='2';
                        }else if (boardArray[x-1][y]=='2'){
                            boardArray[x-1][y]='3';
                        }else if (boardArray[x-1][y]=='3'){
                            boardArray[x-1][y]='4';
                        }else{
                         boardArray[x-1][y]='1';
                        }
                    }
                    if (x!=N-1 && boardArray[x+1][y]!='M'){
                        if (boardArray[x+1][y]=='1'){
                            boardArray[x+1][y]='2';
                        }else if (boardArray[x+1][y]=='2'){
                            boardArray[x+1][y]='3';
                        }else if (boardArray[x+1][y]=='3'){
                            boardArray[x+1][y]='4';
                        }else{
                         boardArray[x+1][y]='1';
                        }
                    }
                    if (y!=0&& boardArray[x][y-1]!='M'){
                        if (boardArray[x][y-1]=='1'){
                            boardArray[x][y-1]='2';
                        }else if (boardArray[x][y-1]=='2'){
                            boardArray[x][y-1]='3';
                        }else if (boardArray[x][y-1]=='3'){
                            boardArray[x][y-1]='4';
                        }else{
                         boardArray[x][y-1]='1';
                        }
                    }
                    if (y!=N-1 && boardArray[x][y+1]!='M'){
                        if (boardArray[x][y+1]=='1'){
                            boardArray[x][y+1]='2';
                        }else if (boardArray[x][y+1]=='2'){
                            boardArray[x][y+1]='3';
                        }else if (boardArray[x][y+1]=='3'){
                            boardArray[x][y+1]='4';
                        }else{
                         boardArray[x][y+1]='1';
                        }
                    }
                    if (x>0 && y>0 && boardArray[x-1][y-1]!='M' ){
                        if (boardArray[x-1][y-1]=='1'){
                            boardArray[x-1][y-1]='2';
                        }else if (boardArray[x-1][y-1]=='2'){
                            boardArray[x-1][y-1]='3';
                        }else if (boardArray[x-1][y-1]=='3'){
                            boardArray[x-1][y-1]='4';
                        }else{
                         boardArray[x-1][y-1]='1';
                        }
                    }
                    if (x!=N-1 && y!=0 && boardArray[x+1][y-1]!='M'){
                        if (boardArray[x+1][y-1]=='1'){
                            boardArray[x+1][y-1]='2';
                        }else if (boardArray[x+1][y-1]=='2'){
                            boardArray[x+1][y-1]='3';
                        }else if (boardArray[x+1][y-1]=='3'){
                            boardArray[x+1][y-1]='4';
                        }else{
                         boardArray[x+1][y-1]='1';
                        }
                    }
                    if (x!=N-1 && y!=N-1 && boardArray[x+1][y+1]!='M'){
                        if (boardArray[x+1][y+1]=='1'){
                            boardArray[x+1][y+1]='2';
                        }else if (boardArray[x+1][y+1]=='2'){
                            boardArray[x+1][y+1]='3';
                        }else if (boardArray[x+1][y+1]=='3'){
                            boardArray[x+1][y+1]='4';
                        }else{
                         boardArray[x+1][y+1]='1';
                        }
                    }
                    if (x!=0 && y!=N-1 && boardArray[x-1][y+1]!='M'){
                        if (boardArray[x-1][y+1]=='1'){
                            boardArray[x-1][y+1]='2';
                        }else if (boardArray[x-1][y+1]=='2'){
                            boardArray[x-1][y+1]='3';
                        }else if (boardArray[x-1][y+1]=='3'){
                            boardArray[x-1][y+1]='4';
                        }else{
                         boardArray[x-1][y+1]='1';
                        }
                    }
                }
                if (boardArray[x][y]!='1' && boardArray[x][y]!='M'){
                    boardArray[x][y]='-';
                }
            }
        }
        
        for (int r=0; r<N; r++){
            for (int q=0; q<N; q++){
                System.out.print(boardArray[r][q]);
            }
            System.out.println();
        }
    }
}