import java.util.Scanner;
public class equality{
  public static void main(String [] args){
    int[] a = {10,8,3,-4,0,1,100,50,22,-5};

    for (int i=1; i<a.length; i++){ 
    for (int j=i; (j>0 && (a[j] < a[j-1])); j--){
      int tmp = a[j];
      a[j]=a[j-1];
      a[j-1]=tmp;
    }
    System.out.println(a[j]);
  }

  }
  }
    
