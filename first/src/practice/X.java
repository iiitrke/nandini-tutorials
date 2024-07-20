package practice;

public class X {

    public void pass(Y ref) {
        Z myZ = new Z();
        System.out.println("I am from X");
        ref.pass(myZ);
     
    }

    public static void main(String[] args) {

        X myX = new X();
        Y myY = new Y();
        myX.pass(myY);

    }

}
