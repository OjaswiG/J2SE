class A{
  public void m1(int... x){
     System.out.println(x);
     for(int element : x)
       System.out.println(element);
  }
}

class TestMain{
  public static void main(String args[]){
      A obj = new A();
      //obj.m1();
      //obj.m1(2,3);
      obj.m1(2,3,4,5,5,6);
  }
}
