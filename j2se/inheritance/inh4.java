class A {
   public A(){
    System.out.println("A-default...");
   }    
}
class B extends A{
    public B(){
        System.out.println("B-default....");
    }
}

class TestMain{
    public static void main(String args[]){
        new B();
    }
}
