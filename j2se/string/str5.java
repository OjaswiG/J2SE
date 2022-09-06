import java.util.Scanner;
class TestMain{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter first string");
     String s1 = sc.next();
     
     System.out.println("Enter second string");
     String s2 = sc.next();
     
     //int x = s1.compareTo(s2);
     int x = s1.compareToIgnoreCase(s2);
     if(x == 0)
       System.out.println(s1+" == "+s2);
     else if(x > 0)
            System.out.println(s1+" > "+s2);
          else
            System.out.println(s1+" < "+s2);    
   }
}
