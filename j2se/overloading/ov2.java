class A{
  public void m1(byte x){
    System.out.println("Byte version..");
  }
  public void m1(short x){
    System.out.println("Short version..");
  }
  public void m1(int x){
    System.out.println("Integer version..");
  }
  public void m1(long x){
    System.out.println("Long version..");
  }
}

class TestMain{
  public static void main(String args[]){
    A obj = new A();
    obj.m1(x);  
  }
}
