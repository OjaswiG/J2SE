class A {
  static class B{
    public static void m1(){
        System.out.println("m1-called...");
    }
  }    
}

class TestMain{
    public static void main(String args[]){
        A.B.m1();
    }
}
