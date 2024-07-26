package person2;
import java.util.List;

import person2.Person.Sex;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainPerson {
public static void main(String[] args) {
    // Person p1 = new Person("nandini",LocalDate.of(2005,2,15));
    // Person p2 = new Person("erica", LocalDate.of(2012, 8, 13));
    // Person p3 = new Person("meetu",LocalDate.of(1977, 3, 11));
    List<Person> persons = new ArrayList();
  //  System.out.println(p1.getName());

    persons.add(new Person("erica", LocalDate.of(2012, 8, 13),Sex.FEMALE));
    persons.add(new Person("nandini",LocalDate.of(2005,2,15),Sex.MALE));
    persons.add( new Person("meetu",LocalDate.of(1977, 3, 11),Sex.FEMALE));
    // persons.add(p3);
    // persons.add(p3);
    // persons.add(p3);
   // p1=null;
   // System.out.println(p1.getName());
   // p2=null;
    //p3=null;

    CheckPersonEligibleForSelectiveService service = new CheckPersonEligibleForSelectiveService();
    
    System.out.println("printing Criteria ================ ");
    for(Person p : persons){
      //System.out.println(p.getName());  
      //System.out.println(p.getAge());
      boolean test = service.test(p);
      if(test){
        System.out.println(p.getName());  
        System.out.println(p.getAge());
      }
     
    }
    System.out.println("=============================================================");
   Calculation.printPersonsOlderThan(persons, 15);
    System.out.println("=============================================================");
    Calculation.printPersonsWithinAgeRange(persons, 5, 22);
    

}
}
