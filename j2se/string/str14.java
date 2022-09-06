import java.util.StringJoiner;
/*
  class Object{
    public String toString(){
      return this.getClass().getName()+"@"+this.hashCode();
    }
  }
*/
class MyString{
  private String msg;
  public MyString(String msg){
    this.msg = msg;
  }
  public String toString(){
      return msg;
  }
}
class TestMain{
   public static void main(String args[]){
     String s1 = new String("hello..");
     System.out.println(s1);
     
     MyString ms = new MyString("hello...");
     System.out.println(ms); // ms.toString()  
   }
}
