class Distance{
   private int km,meter;
   public Distance(int km, int meter){
     this.km = km;
     this.meter = meter;
   }
   public Distance(){
     km = meter = 0;
   }
   public void setKm(int km){
     this.km = km;
   }
   public void setMeter(int meter){
     this.meter = meter;
   }
   public int getKm(){
     return km;
   }
   public int getMeter(){
     return meter;
   }
   public Distance addDistance(Distance dis){
      Distance temp = new Distance();
      temp.km  = this.km + dis.km;
      temp.meter = this.meter + dis.meter;
      if(temp.meter >= 1000){
        temp.km++;
        temp.meter -= 1000;
      }
      return temp;
   }
}
class TestMain{
   public static void main(String args[]){
      java.util.Scanner sc = new java.util.Scanner(System.in);
      
      System.out.println("Enter First Distance in km and meter");
      int km = sc.nextInt();
      int meter = sc.nextInt();
      Distance d1  = new Distance(km,meter);
      
      System.out.println("Enter Second Distance in km and meter");
      km = sc.nextInt();
      meter = sc.nextInt();
      Distance d2  = new Distance(km,meter);
      
      System.out.println(d1.getKm()+" km "+d1.getMeter()+" meter");
      System.out.println(d2.getKm()+" km "+d2.getMeter()+" meter");
      
      Distance d3 = d1.addDistance(d2);
      System.out.println(d3.getKm()+" km "+d3.getMeter()+" meter");   
   }
}





