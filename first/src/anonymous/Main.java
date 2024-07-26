package anonymous;

import hello1.EnglishGreeting;
import hello1.HelloWorld;

public class Main {
public static void main(String[] args) {
    HelloWorld e1 = new HelloWorld() {

        @Override
        public void greet() {
            System.out.println("HELLO IN ENGLISH");
        }

        @Override
        public void greetSomeone(String someone) {
           System.out.println("HELLO ENGLISH " + someone);
        }
        
    };
    HelloWorld f1 = new HelloWorld() {

        @Override
        public void greet() {
            System.out.println("HELLO IN FRENCH");
        }

        @Override
        public void greetSomeone(String someone) {
            System.out.println(" HELLO FRENCH " + someone);
        }
        
    };
    e1.greet();
    e1.greetSomeone("Nandini");
    f1.greet();
    
    
}
}
