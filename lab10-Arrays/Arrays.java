//Derek Huber
//CSE002
import java.util.Scanner;
public class Arrays{
    public static void main(String [] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int n = myScanner.nextInt();
        int [] array = new int [n];
        for (int i=0; i<array.length; i++){
            array[i] = (int)(Math.random() * 100);
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int k=0; k<array.length; k++){
            sum+=array[k];
        }
        int average = sum/array.length;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);
        System.out.println("The following values are above average:");
        for (int r=0; r<array.length; r++){
            if (array[r] >= average){
                System.out.println(array[r]);
            }
        }
        
    }
}
