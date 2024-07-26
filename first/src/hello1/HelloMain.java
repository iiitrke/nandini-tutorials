package hello1;

public class HelloMain {

    public static void main(String[] args) {
        HelloWorld e1 = new EnglishGreeting();
        HelloWorld h1 = new HindiGreeting();
        
        e1.greet();
        e1.greetSomeone("nandini");
        EnglishGreeting e2 = (EnglishGreeting)h1;
        e2.greetGod();
        h1.greet();
        h1.greetSomeone("ERICA");

    }
}
