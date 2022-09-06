class  A {
    public void wish(){
        System.out.println("GM....");
    } 
    public void m1(){
        System.out.println("A-m1-called....");
    }
}

class B extends A{
   public void wish(){
    System.out.println("GN....");
   }
}
class TestMain{
    public static void main(String args[]){
        B obj = new B();
        obj.wish();
        obj.m1();
    }
}