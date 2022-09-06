import java.util.Scanner;
class TestMain{
   public static void main(String args[]){
 
     String s1 = "InfoBeans Foundation";
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter String for search");
     String part = sc.next();
     
     //boolean status = s1.contains(part);    
     if(s1.contains(part))
       System.out.println("found..");
     else
       System.out.println("not found...");  
   }
}
