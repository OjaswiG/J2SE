
class TestMain{
  static{
     System.out.println("Block called....");
     m1();
  }
  public void m1(){
    System.out.println("m1-called....");
  }
  public static void main(String args[]){
     System.out.println("Main Executed.....");
  }
}
