//Derek Huber
//Homework 3
//CSE002
//Volume and Surface Area of a block

//import the scanner
import java.util.Scanner;

//declare the class
public class Block {
    
    //main method
    public static void main(String [] args) {
        
        //Tell the scanner you are creating an instance
        //that will take input from STDIN
        Scanner myScanner = new Scanner (System.in);
        
        //Prompt the user for the length, width, and height of the block,
        //and accept user input for each of the three values.
        System.out.print("Enter the length of the block: ");
        double blockLength = myScanner.nextDouble();
        System.out.print("Enter the width of the block: ");
        double blockWidth = myScanner.nextDouble();
        System.out.print("Enter the height of the block: ");
        double blockHeight = myScanner.nextDouble();
        
        //Calculate the volume and surface area
        double Volume = blockLength * blockWidth * blockHeight;
        double surfaceArea = 2*(blockWidth*blockLength + blockHeight*blockLength + blockHeight*blockWidth);
        
        //Print out the results
        System.out.println("The volume of the block of dimensions "+blockLength+ " x "+ blockWidth+ " x "+blockHeight+ " is "+ Volume);
        System.out.println("The surface area of the block is " +surfaceArea);
        
    }
    
}