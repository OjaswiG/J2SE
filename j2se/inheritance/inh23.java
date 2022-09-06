class A {
   public void m1(){
    System.out.println("A-m1 called...");
   }    
}
class B extends A{
    public void m1(){
        System.out.println("B-m1 called..");
        super.m1();
    }
}

class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.m1();
    }
}