class A{
  public A(){
    System.out.println("A-default....");
  }
}
class B extends A{
  public B(){
    System.out.print("B-default....");
  }
}
class TestMain{
    public static void main(String args[]){
       new B();
    }
}