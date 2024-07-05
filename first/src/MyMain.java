

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
        

        Male nandu =(Male) myHuman;

        nandu.getHair();

    

    }

}
