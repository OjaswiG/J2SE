interface I{
    void m1();
    default void m2(){
      System.out.println("method m2()-called....");
    }
}

class Test implements I{
    public void m1(){
      System.out.println("m1-called..");
    }
}

class TestMain{
    public static void main(String args[]){
        I obj = new Test();
        obj.m1();
        obj.m2();
    }
}