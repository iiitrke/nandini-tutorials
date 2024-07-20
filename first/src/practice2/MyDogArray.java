public class MyDogArray {
    public static void main(String[] args) {
     Pizza pizzas[]=new Pizza[3];
     Scanner scanner = new Scanner(System.in);
     for(int i=0; i<pizzas.length; i++){
      System.out.println("Enter pizza crust");
      String crust=scanner.nextLine();
      System.out.println("Enter pizza topping");
      String toppings = scanner.nextLine();
      String sauce = scanner.nextLine();
      System.out.println("Enter sauce");
      String sauce=scanner.nextLine();
      Pizza pizza= new Pizza(crust,toppings,sauce);
      pizzas[i]=new Pizza(crust,toppings,sauce);
    }
    for(int i=0; i<pizzas.length; i++){
      System.out.println(pizzas[i].getcrust() + pizzas[i].toppings() + pizzas[i].sauce());
  }
        
        
    }
}
