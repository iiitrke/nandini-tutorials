
public class MyMain {

    public static void main(String[] args) {
        PoliceMan police = new PoliceMan();

    //     Bike b1 = null;
    // b1.showBikeDetail();
    //      b1 = new Bike("Splendor", "UK17", "Red");
    //     Bike b2 = new Bike(new String("Splendoe2"), new String("UK2"), new String ("Red"));
    //     Bike b3 = new Bike("Honda", "UK3", "Red");
    //    b1 = new Bike("Honda", "UK4", "GREEN");
    //    b1.showBikeDetail();
    //    b2.showBikeDetail();
    //    b3.showBikeDetail();;
        


       Bike b1 = null;
       String bikeModel ="Splendor";
       String bikeColorRed="Red";
       String bikeColorBlack ="Black";
       BikeColor bcobj= new BikeColor("PINK");
    //    b1 = new Bike(bikeModel, "UK17", bikeColorRed);
    //   Bike b2 = new Bike(bikeModel, new String("UK2"), bikeColorRed);
    //   Bike b3 = new Bike(bikeModel, "UK3",bikeColorRed);
    //   Bike b4 = new Bike(bikeModel, "UK3",bikeColorRed);
    //  b1 = new Bike(bikeModel, "UK4", "GREEN");



     b1 = new Bike(bikeModel, "UK17", bikeColorRed);
     Bike b2 = new Bike(bikeModel, new String("UK2"), bcobj);
     Bike b3 = new Bike(bikeModel, "UK3",bcobj);
     Bike b4 = new Bike(bikeModel, "UK3",bcobj);

    //  b1.showBikeDetailObj();
     b2.showBikeDetailObj();
     b3.showBikeDetailObj();
     b4.showBikeDetailObj(); bcobj.setColor(bikeColorRed);
    

     b2.showBikeDetailObj();
     b3.showBikeDetailObj();
     b4.showBikeDetailObj();
    //  bikeColorRed="White";
    //  b1.showBikeDetail();
    //  b2.showBikeDetail();
    //  b3.showBikeDetail();
    //  b4.showBikeDetail();
     


        // Bike honda = new Bike("Honda", "UK1", "Red");
        // Bike honda13 = new Bike("Honda", "UK2", "Red");
        // Bike honda1 = new Bike("Honda", "UK3", "Red");
        // Bike honda2 = new Bike("Honda", "UK4", "GREEN");
        // Bike honda3 = new Bike("Honda", "UK5", "WHIE");
        // Bike honda4 = new Bike("Honda", "UK6", "Red");
        // Bike honda11 = new Bike("Honda", "UK11", "BLUE");
        // Bike honda6 = new Bike("Honda", "UK12", "Red");
        // Bike honda7 = new Bike("Honda", "UK13", "Red");
        // Bike honda8 = new Bike("Honda", "UK14", "Red");
        // Bike honda9 = new Bike("Honda", "UK8", "Red");
        // Bike honda5 = new Bike("Honda", "UK7", "Red");
         
        
        // honda.setBikeColor("RED");
        // honda.showBikeDetail();

        // // police.challan(honda);
        // // police.challan(honda11);
     
    }
}
