//Derek Huber
//CSE 002
//Homework 06: Pyramid Program

//import the Scanner
import java.util.Scanner;

//name the class
public class pyramid{
    
    //main method
    public static void main(String []args){
        
        //name the Scanner myScanner
        Scanner myScanner = new Scanner (System.in);
        
        //Ask for and accept input from the user
        System.out.print("What size pyramid? ");
        int pyramidSize = myScanner.nextInt ();
        
        //declare 4 variables to be used in the for loops
        int rowNum;
        int spaces;
        int firstHalf;
        int secondHalf;
    
    //Variable rowNum represents each row of the pyramid    
    for (rowNum = 1; rowNum <= pyramidSize; rowNum++){
        
        //Variable spaces represents the spaces to the left
        //of the pyramid.
        for (spaces = pyramidSize - 1; spaces >= rowNum; spaces--){
            System.out.print(" ");
        }
        
        //Variable firstHalf represents the first half, plus one
        //of the asterisks
        for (firstHalf = 1; firstHalf <= rowNum; firstHalf++){
            System.out.print("*");
        }
        //Variable secondHalf represents the asterisks that come
        //right after those from variable y, and there is
        //one fewer because the middle asterisk has already
        //been printed.
        for (secondHalf = 1; secondHalf <= rowNum-1; secondHalf++){
            System.out.print("*");
        }
        
        //This statement will end the line and move to the next
        System.out.println("");
        
    }
    
    }
}