class TestMain{
   public static void main(String args[]){
     //String s1 = "www infobeansfoundation com";
     String s1 = "www$infobeansfoundation$com";
     String part[] = s1.split("\\$");  
   
     for(String element : part)
       System.out.println(element); 
   }
}
