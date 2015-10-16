//Derek Huber
//CSE002
//Lab 08: Methods
import java.util.Scanner;
public class Methods{
    
    public static double meanFunction(double [] m){
        double sum = 0;
        int i;
        for (i=0; i < m.length; i++){
            sum+= m[i];
        }
        return (sum/m.length);
    }
    
    public static double medianFunction(double [] m){
        double median;
        median = (m[4] + m[5])/2;
        return median;
        
   }
   
   public static void print(double mean, double median){
       System.out.println("The mean is: "+ mean);
       System.out.println("The median is: "+ median);
   }
    
    public static void main(String [] args){
        
    
    Scanner myScanner = new Scanner (System.in);
    
    System.out.print("Enter the first number: ");
    double num1 = myScanner.nextDouble();
    System.out.print("Enter the second number: ");
    double num2 = myScanner.nextDouble();
    System.out.print("Enter the third number: ");
    double num3 = myScanner.nextDouble();
    System.out.print("Enter the fourth number: ");
    double num4 = myScanner.nextDouble();
    System.out.print("Enter the fifth number: ");
    double num5 = myScanner.nextDouble();
    System.out.print("Enter the sixth number: ");
    double num6 = myScanner.nextDouble();
    System.out.print("Enter the seventh number: ");
    double num7 = myScanner.nextDouble();
    System.out.print("Enter the eighth number: ");
    double num8 = myScanner.nextDouble();
    System.out.print("Enter the ninth number: ");
    double num9 = myScanner.nextDouble();
    System.out.print("Enter the tenth number: ");
    double num10 = myScanner.nextDouble();
    
    double [] array = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
    
    double mean = meanFunction(array);
    double median = medianFunction(array);
    
    print(mean, median);
    }
}