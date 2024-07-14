public class Operators {
    public static void main(String[] args) {

        ICar cars[] = new ICar[5];
        cars[0] = new Halix();
        cars[1] = new Honda();
        cars[2] = new Halix();
        cars[3] = new Honda();
        cars[4] = new Halix();

       
        for (ICar car : cars) {
           
            if (car instanceof Honda) {
                System.out.println("Greate You are having HONDA car");
            } else if (car instanceof Halix) {
               Halix mycar = (Halix) car;
              
                System.out.println("You are having Halix Car");
                mycar.jump();

            }
        }
        System.out.println("===============");
        System.out.println("INSTANCEOF");
        Integer i = 5;
        String k = "MyStrdddding";
        int j = i;

        Object obj = i;

        if (obj instanceof Integer) {
            System.out.println("Value is :" + ((Integer) obj).toString());
        }

        if (obj instanceof String)
            System.out.println("Value :" + obj.toString());
        System.out.println("FINISH INSTANCE OF");

        System.out.println("+++++++++++++");

        int x = 5;
        int y=0;
        y=x--;
        System.out.println(y); // print 5 then increment x=6
        System.out.println(x); // print 6
        System.out.println(++x); // increment first 7, then print 7
        System.out.println(x);

        System.out.println(x += 5);
        System.out.println(x);
        x = 2;
        String result = (x > 5) ? "Greater" : "Less";
        System.out.println(result);
    }

}
