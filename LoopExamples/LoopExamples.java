public class LoopExamples{
    
    public static void main(String [] args){
      //Example of a while loop  
        int i=0;
        while (i<=3){
            System.out.println(i);
            i++;
        }
        //Example of a for loop
        int n;
        for (n=11; n<14; n++){
            System.out.println(n);
        }
        
        //Sum all numbers between 0 and 10
        int r;
        int sum=0;
        for (r=0; r<=10; r++){
            sum+= r;
        }
        System.out.println(sum);
        
        //Print every other number between 1 and 10
        int x;
        for (x=1; x<=10; x+=2){
            System.out.println(x);
        }
        
    }
}