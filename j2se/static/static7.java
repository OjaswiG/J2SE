
class A{
  {
    System.out.println("Initializer block");
  }
  public A(){
    System.out.println("Const called...");
  }
  static{
    System.out.println("Block called...");
  }
}
class TestMain{
  public static void main(String args[]){
     new A();
  }
}
