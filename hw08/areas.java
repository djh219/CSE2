//Derek Huber
//CSE002
//Homework 08: Areas
import java.util.Scanner;
public class areas{
    
    public static double area(int r){
        double circleArea = 3.14*r*r;
        return circleArea;
    }
    
    public static double area(int l, int w){
        double rectArea = l * w;
        return rectArea;
    }
    
    public static double area(int h, int b1, int b2){
        double trapArea = h*((b1+b2)/2);
        return trapArea;
    }
    
    public static void main(String [] args){
        int x = 0;
        while (x==0){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter 1 for circle, 2 for rectangle, or 3 for trapezoid (or enter 999 to exit): ");
        int whichShape = myScanner.nextInt();
        if (whichShape == 1){
            System.out.print("Enter the radius: ");
            int radius = myScanner.nextInt();
            System.out.println("The area is: "+ area(radius));
            x++;
        }
        else if (whichShape == 2){
            System.out.print("Enter the length: ");
            int length = myScanner.nextInt();
            System.out.print("Enter the width: ");
            int width = myScanner.nextInt();
            System.out.println("The area is: "+ area(length, width));
            x++;
        }
        else if (whichShape == 3){
            System.out.print("Enter the height: ");
            int height = myScanner.nextInt();
            System.out.print("Enter the first base: ");
            int base1 = myScanner.nextInt();
            System.out.print("Enter the second base: ");
            int base2 = myScanner.nextInt();
            System.out.println("The area is: "+ area(height, base1, base2));
            x++;
        }else if (whichShape == 999){
            System.exit(-1);
        }
        else{
            System.out.println("Invalid number");
        }
    }
    }
}