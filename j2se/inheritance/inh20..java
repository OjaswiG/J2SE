interface I{
    void m1();
    void m3();

    static void m4(){
      System.out.println("method m4()-called....");
    }
}

class TestMain{
    public static void main(String args[]){
       I.m4();
    }
}