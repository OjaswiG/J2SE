import java.util.StringJoiner;
class TestMain{
   public static void main(String args[]){
     String s1[] = {"www","infobeansfoundation", "com"};
     
     //StringJoiner sj = new StringJoiner(".");
     StringJoiner sj = new StringJoiner(".","#","*");
     
     for(String element : s1)
       sj.add(element);
     
     System.out.println(sj);  
       
   }
}
