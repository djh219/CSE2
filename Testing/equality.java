public class equality{
    public static void main(String [] args){
      int [] array1 = new int [10];
      for (int i=0; i<10; i++){
          array1[i]=(int)(Math.random() * 22);
          System.out.println("array1: "+array1[i]);
      }
      int [] array2= new int [10];
      for (int x=0; x<10; x++){
          if (x%2==0){
              array2[x]=array1[x];
              System.out.println("array2: "+array2[x]);
          }
      }
    }
}