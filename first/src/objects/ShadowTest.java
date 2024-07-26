package objects;

public class ShadowTest {
 public int x=0;

 class FirstLevel{
    public int x=1;
         public void methoidInFirstLevel(int x){
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
         }
 }

 public static void main(String[] args) {
    ShadowTest st = new ShadowTest();
    ShadowTest.FirstLevel ft= st.new FirstLevel();
    ft.methoidInFirstLevel(23);
 }
}
