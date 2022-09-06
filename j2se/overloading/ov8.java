class A{
  public void m1(int a, int b, int... x){
    System.out.println("a : "+a);
    System.out.println("b : "+b);
    
    for(int i=0; i<x.length; i++)
      System.out.println(x[i]);
  }
}

class TestMain{
  public static void main(String args[]){
      A obj = new A();
      obj.m1(2,7,3,4,5,56,6,6);
  }
}
