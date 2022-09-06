class A {
    static class B{
        public void m1(){
            System.out.println("m1-called...");
        }
    }
    public void wish(){
        System.out.println("GM...");
    }
    interface I{
        void interfaceKaMethod();
    }
}

class Child extends A.B{

}
class DusraChild implements A.I{
    public void interfaceKaMethod(){
         System.out.println("Bla Bla......");
    }
}
class TestMain{
    public static void main(String arggs[]){
        //new Child.B().m1();
        A.I obj = new DusraChild();
        obj.interfaceKaMethod();
    }
}