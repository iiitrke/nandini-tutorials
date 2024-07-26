package objects;

public class MyCarMain {
public static void main(String[] args) {

    MyCar c3 = new MyCar("white");
     c3.new Engine();
    c3.printDetail();
   // e3.printDetail();

     MyCar c1 = new MyCar("red");
     MyCar.Engine engine = c1.new Engine();
     engine.printDetail();
     
     MyCar c2 = new MyCar("green");
     MyCar.Engine engine2 = c2.new Engine();
     engine2.printDetail();
 

}
}
