//Derek Huber
//CSE002
//Lab 12: Move
import java.util.Scanner;
public class Move{
    public static void main(String [] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int size = myScanner.nextInt();
        int [] array = null;
        try{
            array = new int[size];
            
        }catch(Exception e){
            System.out.println("Invalid size, enter a value greater than zero.");
            System.exit(-1);
        }
        for (int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*100);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the index: ");
        int index = myScanner.nextInt();
        int temp = 0;
        try{
            temp = array[index];
        }catch(Exception e){
            System.out.println("Invalid index.");
            System.exit(-1);
        }

        for (int x=index; x<array.length-1; x++){
            array[x]=array[x+1];
        }
        array[array.length-1]=temp;
        for (int y=0; y<array.length; y++){
            System.out.print(array[y]+" ");
        }
    }
}