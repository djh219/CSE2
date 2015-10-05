import java.util.Scanner;

public class Testing{
    
    public static void main(String [] args){
        
        Scanner myScanner = new Scanner(System.in);

int i=0;
while (true){
            i++;
            if (i%50==0){
                    for (int t=0;t<100;t++){
                                   if (t % 10 ==0){
                                         break;
                                     }
                    }
                     break;
            }
           i++;
}
System.out.println(i);
System.out.println(t);



    }
}