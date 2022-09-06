/*
  java.lang.Stirng
   length() : int
   toUpperCase() : String
   toLowerCase() : Stirng
   trim() : String
   charAt(int index) : char
   indexOf(char) : int
   lastIndexOf(char) : int
   contains(Object) : boolean
   replace(oldstring/char, newstring/char) : String
   substring(int index) : String
   substring(int begindex , int endindex) : String
   
*/
class TestMain{
   public static void main(String args[]){
     String s1 = "InfoBeans Foundation";
     int x = s1.length();   
     System.out.println("Length : "+x);
   
     String s2 = s1.toUpperCase();
     
     System.out.println(s2);
   }
}



