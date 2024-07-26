package hello1;

public class EnglishGreeting implements HelloWorld{

    @Override
    public void greet() {
        System.out.println("hello In ENGLISH");
    }

    @Override
    public void greetSomeone(String someone) {
        System.out.println("Hello " + someone);
    }
    public void greetGod(){
        System.out.println("hello god in English");
    }
 
}
