package objects;

public class DataStucture {

private final static int SIZE = 15;
private int[] arrayOfInts = new int[SIZE];
private EvenIterator evenIterator = this.new EvenIterator();
private OddIterator oddIterator = this.new OddIterator();

 public DataStucture(){
    for(int i = 0; i<SIZE; i++){
        arrayOfInts[i]=i;
    }
 }
 public EvenIterator evenIterator(){
    return evenIterator;
 }
 public OddIterator oddIterator(){
    return oddIterator;
 }
 public Integer sumEven(){
    DataStructureIterator iterator = this.new EvenIterator();
    Integer total = Integer.valueOf(0);
    while (iterator.hasNext()) {
        total=total+iterator.next();
        
    }
    return total;
 }
 public Integer sumOdd(){
    DataStructureIterator iterator = this.new OddIterator();
    Integer total = Integer.valueOf(0);
    while (iterator.hasNext()) {
        total=total+iterator.next();
        
    }
    return total;
 }
 public void printEven() {
        
    
    DataStructureIterator iterator = this.new EvenIterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + " ");
    }
    System.out.println("===============================");
}
interface DataStructureIterator extends java.util.Iterator<Integer> { 
  
} 

private class EvenIterator implements DataStructureIterator{
    private int nextIndex=0;
    @Override
    public boolean hasNext() {
        return (nextIndex <= SIZE -1);
    }

    @Override
    public Integer next() {
        Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
        nextIndex += 2;
        return retValue;

    }
   
    
}
private class OddIterator implements DataStructureIterator{
    private int nextIndex=1;
    @Override
    public boolean hasNext() {
        return (nextIndex < SIZE );
    }

    @Override
    public Integer next() {
        Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
        nextIndex += 2;
        return retValue;
    }
    
}
public static void main(String[] args) {
    DataStucture ds= new DataStucture();
    Object ds1 = new DataStucture();
    DataStucture ds2 = new DataStucture();
    DataStucture ds3 = (DataStucture) ds1;
    
    ds.printEven();
   Integer result =  ds.sumOdd();
    System.out.println(result);
    EvenIterator ei = ds.evenIterator();
    while (ei.hasNext()) {
        
    }



}
}
