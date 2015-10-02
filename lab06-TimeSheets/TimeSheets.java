//Derek Huber
//CSE002
//Lab 06- Time Sheets

//Scanner
import java.util.Scanner;
//class
public class TimeSheets {
    
    //main method
    public static void main(String [] args){
        
        Scanner myScanner = new Scanner (System.in);
        
        //Print the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = myScanner.nextInt();
        if (numEmployees < 0){
            System.out.println("Invalid number");
        }
        //Set variables equal to zero
        int totalHours = 0;
        int totalWage = 0;
        int totalPayroll = 0;
        //Create a for loop that calculates the wage and hours for each employee then adds them to the total
        int count;
        for (count = 0; count < numEmployees; count++){
            System.out.print("Enter the wage in cents: ");
            int wage = myScanner.nextInt();
            System.out.print("Enter the number of hours per week: ");
            int weeklyHours = myScanner.nextInt();
            
            totalHours+= weeklyHours;
            totalWage+= wage;
            int payrollEmployee= weeklyHours * wage;
            totalPayroll+= payrollEmployee;
            payrollEmployee=0;

        }
        //Print the total
        System.out.println("The total payroll for all of your employees in cents is "+ totalPayroll);
    }
}