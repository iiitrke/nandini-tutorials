
public class Car {
    private  String carModel ;
    private String carNo;
    private  String color;

    private boolean isCarStarted;
    private int speed=0;

    public Car (String color, String carNo, String carModel){
        this.carModel=carModel;
        this.carNo= carNo;
        this.color=color;
    }

    public void ignitionOn(){
        isCarStarted= true;
    }

    public void ignitionOff(){ 
        isCarStarted=false;
    }

    public void accelrate(){
      if(isCarStarted){
        System.out.println("Speed Increaded by 10 KMPL");
        speed= speed+10;
      }else{
        System.out.println("Please Start your car first");
      }
    }

    public void applyBreak(){
        if(isCarStarted){
            if(speed==0){
                System.out.println("Speed is already ZERO");
            }else{
            System.out.println("Speed Decressed by 10 KMPL");
            }
            speed= speed-10;
            if(speed<0)
            speed=0;
          }else{
            System.out.println("Please Start your car first");
          }
    }

    public void showSpeed(){
        System.out.println("Speed is :" + this.speed);
    }

    public void showDetail (){
        System.out.println(" [CarModel :" +this.carModel +", Car No : "+this.carNo+ ", Car Color :" + this.color+"Car Started Status :" +isCarStarted+"]");
    }
}
