class Outer {
    class Inner{
        public void m1(){
            System.out.println("m1-called....");
        }
    }    
}

class TestMain{
    public static void main(String args[]){
         Outer obj = new Outer();
         Outer.Inner inner = obj.new Inner();
         inner.m1();
    }
}
