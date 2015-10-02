import java.util.Scanner;

public class Testing{
    
    public static void main(String [] args){
        
        Scanner myScanner = new Scanner(System.in);
        
       System.out.print("What is your monthly rent cost?");
    int rent = myScanner.nextInt();
	if (rent < 600 || rent >1200) {
        System.out.println("Unusual rent you have there.");
	}




    }
}