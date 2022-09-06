class Outer {
    public void m1(){
        System.out.println("Outer-m1 called....");
         // m2(); --> Error : Outer class member can't access Inner class member
    }
    class Inner{
        public void m2(){
            System.out.println("Inner m2-called....");
        }
    }
}

class TestMain{
    public static void main(String args[]){
       Outer obj = new Outer();
       obj.m1();
    }
}
