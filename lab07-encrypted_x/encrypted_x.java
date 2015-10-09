//Derek Huber
//CSE 002
//Lab 07: Encrypted X
import java.util.Scanner;

public class encrypted_x{
    
    public static void main(String [] args){
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter the size of the square: ");
        int input = myScanner.nextInt();
        if (0>=input && input>100){
            System.exit(-1);
        }
        
        for (int i = 0; i<input; i++){
            
            for (int j = 0; j<input; j++){
               //System.out.print("*");
                if ( j == i){
                    System.out.print(" ");
                }
                else if (input-i-1 == j){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
                 }
                    System.out.println();
        }
    }
}