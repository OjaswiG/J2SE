class A {
    public void m1(int x){
        System.out.println(x+" corers By A");
    }
}

class B extends A{
   public void m1(int x){
    System.out.println(x+" corers By B");
   }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.m1(100);
    }
}