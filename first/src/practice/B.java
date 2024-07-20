package practice;
public class B {
   private C ref =null;
   public B(C lref){
    this.ref=lref;
   }
   public void pass(){
    
    System.out.println("I am from B");
    ref.pass();
    
}
}
