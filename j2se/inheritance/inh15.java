/*
 private
 <default> 
 protected
 public

 Tight Security : -private
 Weaker Access Priviledge :- private
 
 Less Security :- public
 Higer Access privi :- public
 */
class A {
   protected void m1(){
    System.out.println("A-m1-called...");
   }    
}
class B extends A{
    public void m1(){
        System.out.println("B-m1-called...");
    }
}
