package person2;

import java.time.LocalDate;
import java.util.List;
import java.time.Period;


public class Person {
    public enum Sex{
        MALE,FEMALE
    }
    
    String name;
    public String getName() {
        return name;
    }
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name,LocalDate ldate, Sex gender){
        this.name=name;
        this.birthday=ldate;
        this.gender= gender;
    }

    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        int years = Period.between(birthday, currentDate).getYears();
        return years;
    }
    public void printPerson(){
       System.out.println(name + " " + getAge());
    }

    
}
