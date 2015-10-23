//Derek Huber
//CSE002
//Lab 09: Coin Flip

//import the Scanner
import java.util.Scanner;

//name the class
public class CoinFlip{
    
    //This is the first flip method
    public static void flip(){
        double result = Math.random();
        result = Math.round(result);
        if (result == 0){
            System.out.println("Tail: 1  Head: 0");
        }else{
            System.out.println("Tail: 0  Head: 1");
        }
        
    }
    //This is the second flip method
    public static void flip(int n){
        int numHead = 0;
        int numTail = 0;
        for (int i=0; i<n; i++){
            double result2 = Math.random();
            result2 = Math.round(result2);
            if (result2 == 0){
                numTail++;
            }else{
                numHead++;
            }
        }
        System.out.println("Total Heads: "+numHead+"  Total Tails: "+numTail);
    }
    
    //main method
    public static void main(String [] args){
        int x=0;
        while (x==0){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int input = myScanner.nextInt();
            if (input == 0){
                flip();
            }else if (input > 100){
                System.exit(-1);
            }else{
                flip(input);
            }
        }
    }
}