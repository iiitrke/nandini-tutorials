package practice;
public class A {
    //private C myC = new C();
    private B myB= null;
    public A(B lref){
        this.myB=lref;
    }
    public void pass(){
        
     System.out.println("I am from A");
    // ref.pass(myC);
     myB.pass();
    }
    public static void main(String[] args) {
        C myC= new C();
       // myC=null;
        B myB= new B(myC);
        A myA= new A(myB);
        myB=null;
        
        // B myB= new B();
        myA.pass();
        myA.pass();
        myA.pass();
        myA.pass();
    }
}
