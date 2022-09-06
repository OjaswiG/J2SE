class A {
    class B{
        public void m1(){
           System.out.println("m1-called....");
        }
    }
}
class Child extends A.B{
   public Child(){
      new A().super();
   }
}
class TestMain{
    public static void main(String args[]){
       new Child().m1();
    }
}
