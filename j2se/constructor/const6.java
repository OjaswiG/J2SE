// Constructor Chaining
class A{
   public A(){
     this(100);
     System.out.println("called....");
   }
   public A(int x){
     this();
     System.out.println("Integer version called...");
   }
}
class TestMain{
  public static void main(String ags[]){
      A obj = new A();
      
  }
}
