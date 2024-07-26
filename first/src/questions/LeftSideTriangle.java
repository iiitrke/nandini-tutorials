package questions;

public class LeftSideTriangle {
      public static void main(String[] args) {
        int b,k,a;
         for(int i = 0 ; i<5; i++){
            for (b = 2 * (k - a); b >= 0; b--) {
                System.out.print(" ");
            }
 
            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
         }
      }
}
