class TestMain{
   public static void main(String args[]){
     String s1 = "ABC";
     String s2 = "EFG";
     String s3 = "ABC";
     
     System.out.println("Before : "+(s1 == s3));
     s1 = s1 +"";
     System.out.println("After : "+(s1 == s3)); 
   }
}
