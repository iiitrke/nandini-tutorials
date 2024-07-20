package questions;
import java.util.Scanner;

public class PallindromeNum {
 public static void main(String[] args) {
    int digit;
    int sum=0;
    Scanner scanner= new Scanner(System.in);
    int num = scanner.nextInt();
    int temp=num;
   
    while (num>0) {
        digit=num%10;
        sum=(sum*10)+digit;
        num=num/10;
    }
    if (temp==sum) {
        System.out.println("Number is palindrome");
    } else {
        System.out.println("Number is not palindrome");
    }
 }
}
