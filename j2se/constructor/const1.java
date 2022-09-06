class Test{
  public Test(){
    System.out.println("Default construcotr called....");
  }
  public Test(int x){
    System.out.println("Integer version constructor called....");
  }
  public Test(boolean x){
    System.out.println("Boolean version constructor called....");
  }
  public Test(String x){
    System.out.println("String version constructor called....");
  }
}

class TestMain{
   public static void main(String args[]){
      new Test();
      new Test(100);
      new Test(false);
      new Test("hello...");
      //new Test(2.5);
   }
}
