package dog;

public class Dog {

    private String name;
    private String breed;
    private String dogColor;
 
    public Dog(String name, String breed, String dogColor){
        this.name=name;
        this.breed=breed;
        this.dogColor=dogColor;
    }
    public void dogDetail(){
        System.out.println("Name : "+ this.name+ " Breed : " + this.breed+ " Dog Color : " + this.dogColor);
    }
    public void bark(){
        System.out.println(this.name+": boww boww ");
    }

    public void walking(){
        System.out.println(this.name+"  is walking ");
    }

}
