import java.util.Scanner;

public class MyBikeArray {
  public static void main(String[] args) {
    Bike bikes[]=new Bike[5];
    Scanner scanner = new Scanner(System.in);
    for(int i=0; i<bikes.length; i++){
        System.out.println("Enter bike num.");
        String bikeNum=scanner.nextLine();
        System.out.println("Enter bike model");
        String bikeModel = scanner.nextLine();
        System.out.println("Enter bike color");

        String bikeColor=scanner.nextLine();
        Object bike= new Bike(bikeModel, bikeNum, bikeColor);
        // bikes[i]=(Bike)bike;
        bikes [i]= new Bike(bikeModel, bikeNum, bikeColor);
    }
    for(int i=0; i<bikes.length; i++){
        System.out.println(bikes[i].getBikeColor() + bikes[i].getBikeModel() + bikes[i].getNoPlate());
    }

    System.arraycopy();
  }




}
