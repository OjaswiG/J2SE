class A {
    int x = 100;
    static class B{
      int x = 200;  
      public void m1(){
        System.out.println("m1-called...."+x);
      }
    }
}

class TestMain{
    public static void main(String args[]){
         A.B obj = new A.B();
         obj.m1();
    }
}