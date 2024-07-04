
public class MyMain {

    public static void main(String[] args) {
        PoliceMan police = new PoliceMan();
        Bike honda = new Bike("Honda", "UK1", "Red");
        Bike honda13 = new Bike("Honda", "UK2", "Red");
        Bike honda1 = new Bike("Honda", "UK3", "Red");
        Bike honda2 = new Bike("Honda", "UK4", "GREEN");
        Bike honda3 = new Bike("Honda", "UK5", "WHIE");
        Bike honda4 = new Bike("Honda", "UK6", "Red");
        Bike honda11 = new Bike("Honda", "UK11", "BLUE");
        Bike honda6 = new Bike("Honda", "UK12", "Red");
        Bike honda7 = new Bike("Honda", "UK13", "Red");
        Bike honda8 = new Bike("Honda", "UK14", "Red");
        Bike honda9 = new Bike("Honda", "UK8", "Red");
        Bike honda5 = new Bike("Honda", "UK7", "Red");
         
        Bike mybike = new Bike("Honda", "UK7", "Red");
        Bike bikemybike = new Bike("Honda", "UK7", "Red");
        
        
       // honda.setBikeColor("RED");
        honda.showBikeDetail();

        // police.challan(honda);
        // police.challan(honda11);
        //String bikeColor = honda13.getBikeColor();
        //String bikeNo = honda.getNoPlate();

        police.challan(bikeColor, bikeNo);
        System.out.println("My Bike color is "+ bikeColor);


    }
}
