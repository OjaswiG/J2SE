class A{
  public void m1(float x){
    System.out.println("float version....");
  }
  public void m1(long x){
    System.out.println("long version....");
  }
}

class TestMain{
  public static void main(String args[]){
    A obj = new A();
    obj.m1(20); 
  }
}
