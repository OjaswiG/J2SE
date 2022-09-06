class A{
   public void m1(int x){
     System.out.println("Integer version...");
   }
   public void m1(char x){
     System.out.println("Character version...");
   }
}

class TestMain{
  public static void main(String args[]){
    A obj = new A();
    obj.m1('M');
  }
}
