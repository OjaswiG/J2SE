interface I1{
    default void m1(){
        System.out.println("I1-m1");
    }
}
interface I2{
    default void m1(){
        System.out.println("I2-m2");
    }
}
class Test implements I1,I2{
    public void m1(){
        
    }
}
