//Derek Huber
//CSE002
//Lab 05: Special Calculator

//import the scanner
import java.util.Scanner;


//name the class
public class SpecialCalculator{
    
    //main method
    public static void main(String [] args){
        
        //Tell the scanner that you will take input from the user
        Scanner myScanner = new Scanner (System.in);
        //Create a do-while loop
        String y = "";
       do { 
        
        //Prompt the user for the first number
        System.out.print("Enter the first number: ");
        //Accept the user input
        int firstNum = myScanner.nextInt ();
        
        //Prompt the user for the operator
        System.out.print("Enter the operator: ");
        //Accept user input
        String operator = myScanner.next ();
        
        //Prompt the user for the second number
        System.out.print("Enter the second number: ");
        //Accept user input
        int secondNum = myScanner.nextInt ();
        
        //Have a switch for each possible operator and print the total
        switch (operator){
            case "+": //operator = "+"
            System.out.println(firstNum + secondNum);
            break;
            case "-": //operator = -
            System.out.println(firstNum - secondNum);
            break;
            case "*": //operator = *
            System.out.println(firstNum * secondNum);
            break;
            case "/": //operator = /
            System.out.println(firstNum / secondNum);
            break;
            default: //operator = "Invalid Operator"
            System.out.println("Invalid Operator");
            break;
        }
            //Ask the user for n or N and stop if they enter one of those two
           System.out.print("Type n or N to stop: ");
        y = myScanner.next();
       }   while (!y.equals("n") && !y.equals("N"));
}
}