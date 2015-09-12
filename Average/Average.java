import java.util.Scanner;

public class Average {
    
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the first number ");
        double firstNum = myScanner.nextDouble ();
        
        System.out.print("Enter the second number ");
        double secondNum = myScanner.nextDouble ();
        
        System.out.print("Enter the third number ");
        double thirdNum = myScanner.nextDouble ();
        
        double Average = (firstNum + secondNum + thirdNum) / 3;
        
        System.out.println("The average is " + Average);
    }
}