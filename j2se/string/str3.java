class TestMain{
   public static void main(String args[]){
     //           01234567890123456789
     String s1 = "InfoBeans Foundation";
     
     char x = s1.charAt(5);
     System.out.println(x);
     
     //int index = s1.indexOf('e');
     //int index = s1.indexOf("Beans");
     int index = s1.lastIndexOf('a');
     System.out.println(index);
   }
}
