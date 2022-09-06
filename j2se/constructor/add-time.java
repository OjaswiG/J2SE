class Time{
   private int hour;
   private int minute;
   private int second;
   public Time(int hour, int minute, int second){
     this.hour = hour;
     this.minute = minute;
     this.second = second;
   }
   public Time(){
     hour = minute = second = 0;
   }
   public int getHour(){
     return hour;
   }
   public int getMinute(){
     return minute;
   }
   public int getSecond(){
     return second;
   }
   public Time addTime(Time time){
      Time temp = new Time();
      temp.hour = this.hour + time.hour;
      temp.minute = this.minute + time.minute;
      temp.second = this.second + time.second;
      
      if(temp.second >=60){
       temp.minute++;
       temp.second -= 60;       
      }
      if(temp.minute >=60){
        temp.hour++;
        temp.minute -=60;
      }      
      return temp;
   }  
}
class TestMain{
   public static void main(String arggs[]){
      Time t1 = new Time(2,40,50);
      Time t2 = new Time(6,30,45);
 
      System.out.println(t1.getHour()+" : "+t1.getMinute()+" : "+t1.getSecond());          
      System.out.println(t2.getHour()+" : "+t2.getMinute()+" : "+t2.getSecond());
   
      Time totalTime = t2.addTime(t1);
      System.out.println(totalTime.getHour()+" : "+totalTime.getMinute()+" : "+totalTime.getSecond());
      
   }
}
