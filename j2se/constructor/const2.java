import java.util.Scanner;
// POJO (Plain Old Java Object)
class Arithmetic{
   private int a,b;
   public Arithmetic(int a, int b){
     this.a = a;
     this.b = b;
   }
   public Arithmetic(){
     a = b = 0;
   }
   public void setA(int a){
     this.a = a;
   }
   public void setB(int b){
     this.b = b;
   }
   public int getA(){
     return a;
   }
   public int getB(){
     return b;
   }
   public void add(){
     System.out.println("Addition : "+(a+b));
   }
   public void display(){
     System.out.println("a : "+a+" b : "+b);
   }
}

class TestMain{
   public static void main(String args[]){
   
      Arithmetic obj = new Arithmetic(20,10);
      obj.display();
      obj.setA(100);
      System.out.println(obj.getA());
      
      /*
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 2 values..");
      int a  = sc.nextInt();
      int b = sc.nextInt();
      
      Arithmetic obj1 = new Arithmetic(a,b);
      obj1.add();
      
      */ 
   }
}
