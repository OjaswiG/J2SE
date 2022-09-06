class A{
   {
     System.out.println("A-intilizer...");
   }
   static{
     System.out.println("Block-A");
   }
   public A(){
      System.out.println("A-default..");
   }
}
class B extends A{
  {
     System.out.println("B-intilizer...");
  }
  static{
     System.out.println("Block-B");
  }
  public B(){
    System.out.println("B-default...");
  }
}
class TestMain{
  public static void main(String args[]){
    new B();
  }
}
