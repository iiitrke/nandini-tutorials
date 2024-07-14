package practice;

public class ValuePass {
  
    public static void main(String[] args) {
        
        int x=3;
        System.out.println(x);
        passValue(x);
        System.out.println(x);
    }

    public static void passValue(int p){
        p=10;
        return;
    }
}
