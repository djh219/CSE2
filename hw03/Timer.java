//Derek Huber
//Homework 3
//CSE002
//Timer until dinner

//import the scanner
import java.util.Scanner;

//name the class
public class Timer {
    
    //main method
    public static void main(String [] args){
        
        //Tell the scanner you are creating an instance
        //that will take input from STDIN
        Scanner myScanner = new Scanner (System.in);
        
        //Prompt the user to enter the current time
        System.out.print("Enter the current time: ");
        int currentTime = myScanner.nextInt ();
        
        //Prompt the user to enter the time of dinner
        System.out.print("Enter the time that you will be eating dinner: ");
        int dinnerTime = myScanner.nextInt ();
        
        //Convert the miliatry time to standard time
        int currentHour = currentTime / 100;
        int currentMinutes = currentTime % 100;
        int dinnerHour = dinnerTime / 100;
        int dinnerMinutes = dinnerTime % 100;
        
        //Create variables for the number of hours and minutes left
        int hoursLeft = dinnerHour - currentHour;
        int minutesLeft = dinnerMinutes - currentMinutes;
        
        //Print the amount of time left
        System.out.println("You have "+hoursLeft+" hours and "+minutesLeft+" minutes until dinner.");
    }
}