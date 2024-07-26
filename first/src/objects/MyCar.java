package objects;

public class MyCar {
    public String color = "white";
    private Engine engine = null;

    public MyCar(String color) {
        this.color = color;
    }

    public void start() {
        System.out.println("Start.....");
    }
    public void printDetail(){
        if(engine==null){
            System.out.println("please add engine first");
        }else{
        engine.printDetail();
        }
    }

    class Engine {
        public Engine(){
            engine = this;
        }
        public void printDetail() {
            System.out.println(color);
        }
    }
}
