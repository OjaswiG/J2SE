import java.util.Scanner;
class TestMain{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter first string");
     String s1 = sc.next();
     
     System.out.println("Enter second string");
     String s2 = sc.next();
     
     //boolean status = s1.equals(s2);
     boolean status = s1.equalsIgnoreCase(s2);
     if(status)
       System.out.println("Same");
     else
       System.out.println("Not Same..");  
   }
}
