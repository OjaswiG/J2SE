class A{
  static{
    System.out.println("Block-A");
  }
}
class B{
  static{
    System.out.println("Block-B");
  }
}
class C{
  static{
    System.out.println("Block-C");
  }
}
class TestMain{
  public static void main(String args[]){
     new A();
     new B();
     
     new A();
     new B();
  }
}
