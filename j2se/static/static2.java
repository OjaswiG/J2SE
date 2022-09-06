
class TestMain{
  static{
    System.out.println("Block-1");
  }
  static{
    System.out.println("Block-2");
  }
  public static void main(String args[]){
     System.out.println("Main Executed.....");
  }
  static{
    System.out.println("Block-3");
  }
}
