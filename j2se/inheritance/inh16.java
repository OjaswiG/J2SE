/*
  Co-vairent
 */
class A {
   public A m1(){
    System.out.println("A-m1-called...");
     return new A();
   }    
}
class B extends A{
    public B m1(){
        System.out.println("B-m1-called...");
         return new B();
    }
}
