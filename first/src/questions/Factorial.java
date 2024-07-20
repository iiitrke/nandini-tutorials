package questions;

import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {
            
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter number ");
            int i = scanner.nextInt();
            int n,fact=1;;
            for (n=1; n<=i; n++){
                  fact=fact*n;

            }
            System.out.println(fact);
        }
}
