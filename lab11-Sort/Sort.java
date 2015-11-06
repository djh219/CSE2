//Derek Huber
//CSE002
//Lab 11
public class Sort{
    
    public static void sort(int [] array){
        for (int r = 0; r<array.length-1; r++){
            for (int a =r+1; a<array.length; a++){
                if (array[r]>array[a]){
                    int temp = array[a];
                    array[a] = array[r];
                    array[r] = temp;
                }
            }
        }
        for (int b=0; b<array.length; b++) {
            System.out.print(array[b] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int [] array3 = new int [30];
                
        int [] array1 = new int [20];
        for (int i=0; i<20; i++){
            array1[i] = (int)(Math.random() * 100);
            array3[i] = array1[i];
        }
        
        int [] array2 = new int [10];
        for (int x=0; x<10; x++){
            array2[x] = (int)(Math.random() * 100);
            array3[x+20] = array2[x];
        }
        
        
       sort(array1);
       sort(array2);
       sort(array3);
    }
}