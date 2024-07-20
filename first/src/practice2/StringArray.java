import java.util.Scanner;

public class StringArray {
 public static void main(String[] args) {
    Bike bikes[]=new Bike[5];
    String[] strs=new String[5];
    Scanner scanner=new Scanner(System.in); 
    for(int i=0; i<strs.length; i++){
         
       String myInput= scanner.nextLine();
       strs[i]=myInput;
         
    }
    for(int i=0; i<strs.length; i++){
       System.out.println(strs[i]);
    }
 }
}


