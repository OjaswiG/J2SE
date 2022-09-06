class J5{
  public void receivingCall(){
    System.out.println("Call received...");
  }
  public void rejectingCall(){
    System.out.println("Call rejected...");
  }
}
class J7 extends J5{
  public void camera(){
    System.out.println("Camera is enabled...");
  }
}
class J10 extends J7{
   public void bluetooth(){
     System.out.println("Bluetooth is enabled...");
   }
}
class TestMain{
   public static void main(String args[]){
     
     /*
     J7 j7  = new J7();
     j7.receivingCall();
     j7.rejectingCall();
     j7.camera();
    */
    J10 j10 = new J10();
    j10.receivingCall();
    j10.rejectingCall();
    j10.camera();
    j10.bluetooth();
     
   }
}
