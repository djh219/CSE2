import java.util.Scanner;

public class Testing{
    
    public static void main(String [] args){
        
        Scanner myScanner = new Scanner(System.in);
        double sumLeft = 0;
        double n = 1;
        while (n<=50000){
            sumLeft+=(1/n);
            n++;
    
        }
        System.out.println(sumLeft);
        
        double sumRight = 0;
        double i = 50000;
        while (i>0){
            sumRight+=(1/i);
            i--;
        }
        double difference = sumRight - sumLeft;
        System.out.println(sumRight);
        System.out.println("The difference between the sums is "+ difference);
    }
}