class A {
   public void wish(){
    System.out.println("GM...");
   }    
   public void m1(){
    System.out.println("A-m1-called...");
   }
}
class B extends A{
    public void wish(){
        System.out.println("GN.....");
    }
    public void m2(){
        System.out.println("B-m2-called...");
    }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.wish();
        obj.m1();
        //obj.m2();
    }
}
