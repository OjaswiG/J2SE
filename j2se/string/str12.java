class TestMain{
   public static void main(String args[]){
     StringBuffer sb1 = new StringBuffer("Hello");
     StringBuffer sb2 = new StringBuffer("Hello");
     
     String s1 = "Hello";
     String s2 = "Hello";
     
     System.out.println("s1.equals(s2) : "+s1.equals(s2));
     System.out.println("sb1.equals(sb2) : "+sb1.equals(sb2));
     /*
     System.out.println(sb1==sb2); // false
     System.out.println(s1 == s2); // true
    */
   }
}
