//Derek Huber
//CSE002
//Homework 5: Average Grade
//When a value less than 0 or greater than 100 is entered, print "Invalid Grade"
//When a valid grade is entered, add the number that they enter (the grade) to int totalGrade and add 1 to numGrades
//When 999 is entered, break the loop and print "The average is: totalGrade/numGrades"

//Import the Scanner
import java.util.Scanner;

//Class
public class AverageGrade {
    
    //Main Method
    public static void main(String [] args){
        
        //Scanner will accept input from the user
        Scanner myScanner = new Scanner(System.in);
        
        //Declare the variables and set them equal to zero
        int totalGrade = 0;
        int numGrades = 0;
        int singleGrade = 0;
        
        //Create a while loop
        while (singleGrade == 0){
            System.out.print("Enter the grade: ");
             singleGrade = myScanner.nextInt();
                if (singleGrade >= 0 && singleGrade <= 100 ){
                totalGrade+=singleGrade;
                numGrades ++;
                singleGrade = 0;
                } else if (singleGrade == 999){
                    break;
                } else {
                    System.out.println("Invalid Grade");
                    singleGrade = 0;
                }
        }
        //Print the average
        System.out.println("The average grade is: " + totalGrade / numGrades);
    }
}