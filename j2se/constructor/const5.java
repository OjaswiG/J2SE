// Constructor Chaining
class A{
   public A(){
     this(100);
     System.out.println("called....");
   }
   public A(int x){
     System.out.println("Integer version called...");
   }
   public A(int x, int y){
     System.out.println("Integer - Integer version called");
   }
}
class TestMain{
  public static void main(String ags[]){
      A obj = new A();
      
  }
}
