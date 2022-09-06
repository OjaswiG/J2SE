class A{
    final int x=100;
    
    public A(){
    
    }
    public A(int y){
    
    }
    public void m1(){
      System.out.println(x);
    }
}
class TestMain{
    public static void main(String args[]){
      new A(100).m1();
    }
}