import java.util.Scanner;

public class Testing{
    
    public static void main(String [] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        int i;
        System.out.print("Enter the value: ");
        int n = myScanner.nextInt();
        int j;
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}