class A{
  static{
    System.out.println("Block-A");
  }
}
class B{
  static{
    System.out.println("Block-B");
  }
  public static void wish(){
    System.out.println("Hello Firends! Java is very simple");
  }
}
class TestMain{
  public static void main(String args[]){
     B.wish();
  }
}
