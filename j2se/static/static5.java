
class TestMain{
  
  public static void m1(){
    System.out.println("m1-called....");
  }
  public static void main(String args[]){
    m1();
    TestMain.m1();
    new TestMain().m1();
  }
}
