public class Bike {

     private String bikeModel;
     private String noPlate;
     public String getBikeModel() {
      return bikeModel;
   }

   public String getNoPlate() {
      return noPlate;
   }
   private  String bikeColor;
     private boolean isBikeStarted;
     private int speed=0;

     public Bike(String bikeModel , String noPlate , String bikeColor){
        this.bikeModel=bikeModel;
        this.noPlate=noPlate;
        this.bikeColor=bikeColor;
     }

     public  void setBikeColor(String bcolor){
      if( bcolor.equals("RED") || bcolor.equals("WHITE")){
         this.bikeColor= bcolor;
      }else{
      this.bikeColor="BLUE";
      }
   }
    
   public String getBikeColor(){
      return bikeColor;
   }
    
     void bikeIgnitionOn(){
      isBikeStarted=true;
      System.out.println("bike engine started");
     }

     void bikeAccelerate(){
      if (isBikeStarted) {
         speed=speed+10;
         System.out.println("bike speed is inc by 10kmpl");
      } else {
         System.out.println("start the bike first");
      }
     }

     void bikeBrakes(){
      if(speed==0){
          System.out.println("Speed is already 0");
      }else{
      speed= speed-10;
      System.out.println("Speed is Decressed by 10KMPL");
      }
      
     }
   void bikeIgnitionOff(){
      isBikeStarted=false;
   }
   public void bikeSpeed(){
      System.out.println("speed of bike = " + this.speed);
   }
   public void showBikeDetail(){
      System.out.println("bike model = " + this.bikeModel + "bike color = " + this.bikeColor + "bike number = " + this.noPlate);
   }

}
