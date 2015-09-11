//Derek Huber
//Lab 03: Check
//CSE002
//This program will obtain the original cost of the check,
//the tip, and the number of ways it will be split, then it
//will split the check evenly.

//import the scanner
import java.util.Scanner;

//name the class
public class Check {
    
    //main method required for every Java program
    public static void main(String[] args) {
        //Tell the scanner that you are creating an instance that will
        //take input from STDIN
        Scanner myScanner = new Scanner ( System.in );
        
        //Prompt the user for the original cost of the check
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        
        //Now accept user input
        double checkCost = myScanner.nextDouble () ;
        
        //Now prompt the user for the tip percentage they wish to pay
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx) : ");
        
        double tipPercent = myScanner.nextDouble ();
        tipPercent /= 100; //We want to conver the percentage into a decimal value\
        
        //Prompt the user for the number of people
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt ();
        
        //Print the output
        double totalCost;
        double costPerPerson;
        
        //whole dollar amount of cost
        int dollars;
        //for storing digits to the right of the decimal point
        int dimes;
        int pennies;
        
        //for the cost
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        
        //get the whole amount, dropping decimal fraction
        dollars = (int)costPerPerson;
        
        //get dimes and pennies amount, e.g.,
        //(int)(6.73 *10) % 10 -> 67%10 -> 7
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        
        //Print out the final cost for each person
        System.out.println ("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
        
    } //end of main method
} //end of class