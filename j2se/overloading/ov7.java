class A{
  public void m1(int... x){
    System.out.println("var-arg version....");
  }
  public void m1(int x){
    System.out.println("integer version...");
  }
}

class TestMain{
  public static void main(String args[]){
      A obj = new A();
      obj.m1(2);
  }
}
