package hello1;

public class HindiGreeting implements HelloWorld{

    @Override
    public void greet() {
       System.out.println("Hello in HINDI");
    }

    @Override
    public void greetSomeone(String someone) {
       System.out.println("Hello in hindi" + someone);
    }
}
