import java.util.Scanner;
class TestMain{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Size..");
      int n = sc.nextInt();
      
      if(n>0){
       int a[] = new int[n+1];
      
       System.out.println("Enter "+n+" element");
      
       for(int i=0; i<n; i++)
         a[i] = sc.nextInt();
        
       System.out.println("Given Data..");
       for(int i=0; i<n; i++)
         System.out.print(a[i]+"\t");
       System.out.println();
      
       System.out.println("Enter element position");
       int position = sc.nextInt();
      
       if(position<=0 || position>n+1)
         System.out.println("Invalid position.");            
       else{
         System.out.println("Enter element to be inserted..");
         int element = sc.nextInt();
         
         for(int i=n-1; i>=position-1; i--)
            a[i+1] = a[i];
         
         a[position-1] = element;
         
         n++;
         
         System.out.println("After Inserting...");   
         
         for(int i=0; i<n; i++)
          System.out.print(a[i]+"\t");
         System.out.println();
       }
      }
      else
        System.out.println("Data size should be greater then zero..");
   }
}









