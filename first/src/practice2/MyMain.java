

public class MyMain {
    public static void main(String[] args) {
        LivingThing livingThing = new LivingThing();
          
        
        livingThing.eat();
        livingThing.breath();
        livingThing.lastBreath();
        livingThing.eat();

        Animal animal= new Animal();
        animal.breath();
        animal.eat();
        animal.lastBreath();
        animal.eat();
        animal.noise();
        

        Human h1= new Human();
        h1.breath();
        h1.eat();
        h1.talk();

        Female f1 = new Female();
        String hair1= f1.getHair();
        System.out.println(hair1);


        Human myHuman= new Female();
        myHuman.breath();
        

      //  Male nandu =(Male) myHuman;

       // nandu.getHair();
     
        Object obj=f1;
        Female f2=(Female) obj;

        TunaFish tf1= new TunaFish();
        tf1.noise();
    
        IFemale if1=new Female();
        if1.getHair();

        if1.talk();
        
        // System.out.println(h1.legs);
         Human h2= new Human();
        // System.out.println(h2.legs);
        // h2.legs=1;
        // System.out.println(h1.legs);

        h2.legs(2);
    }
        
}
