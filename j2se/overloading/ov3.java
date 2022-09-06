class A{
   public void m1(int x, long y){
     System.out.println("I-L version...");
   }
   
   public void m1(long x, int y){
     System.out.println("L-I version");
   }
   public void m1(int x, int y){
     System.out.println("I-I version...");
   }
}

class TestMain{
  public static void main(String args[]){
    A obj = new A();
    obj.m1(20,10L);
  }
}
