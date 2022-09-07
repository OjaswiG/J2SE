import java.util.Scanner;
class TestMain{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the order of Matrix...");
     int m = sc.nextInt();
     int n = sc.nextInt();
     
     int x[][] = new int[m][n];
     
     System.out.println("Enter the matrix of "+m+"X"+n);
     int sum=0;
     for(int r=0; r<m; r++){
        System.out.println("Enter "+n+" element of "+(r+1)+" row");
        for(int c=0; c<n; c++){
           x[r][c] = sc.nextInt();
           sum = sum + x[r][c];
         }  
     }      
        
     System.out.println("Given Matrix...");
     for(int r=0; r<m; r++){
       for(int c=0; c<n; c++)
         System.out.print(x[r][c]+" ");
       System.out.println();  
     }  
   }
}
