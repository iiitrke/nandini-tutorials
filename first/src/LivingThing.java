

public class LivingThing extends Object {

    public LivingThing(){ // Default Constructor
        
    }

    private  Boolean soul=true;
    
    public void breath(){
        if(soul==true){
            System.out.println("Breathing, Breathing");
        }else{
            System.out.println("End");
        }

    }

    public void eat(){
        if(soul==true){
            System.out.println("Eating, Eating ...");
        } else{
            System.out.println("End");
        }

    }


    public void lastBreath(){
        soul=false;
    }


}
