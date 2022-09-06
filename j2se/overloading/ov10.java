class A{
  public void add(int x, int y){
    System.out.println("Addition  : "+(x+y));
  }
  public void add(int x, int y, int z){
    System.out.println("Addition  : "+(x+y+z));
  }
  public void add(int x, int y, int z, int a){
    System.out.println("Addition  : "+(x+y+z+a));
  }
}
class TestMain{
  public static void main(String args[]){
     A obj = new A();
     obj.add(20,10,5);
  }
}
