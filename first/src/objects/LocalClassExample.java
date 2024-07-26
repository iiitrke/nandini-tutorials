package objects;
public class LocalClassExample {
    
    static String regularExpression =" [^0-9]";
    public static void validatePhoneNum(String phoneNum1, String phoneNum2){
        final int numberLength = 10;
     
 class PhoneNumber{
    String formattedPhoneNumber = null;
    PhoneNumber(String phoneNumber){
        String currentNumber = phoneNumber.replaceAll(
        regularExpression, "");
          if (currentNumber.length() == numberLength)
             formattedPhoneNumber = currentNumber;
          else
              formattedPhoneNumber = null;
      }
      public String getNum(){
        return formattedPhoneNumber;
      }
      public void pringOriginalNums(){
        System.out.println("original numbers are " + phoneNum1 +" "+ phoneNum2 );
      }
      
    }
    PhoneNumber myNum1 = new PhoneNumber(phoneNum1);
    PhoneNumber myNum2 = new PhoneNumber(phoneNum2);

    if (myNum1.getNum() == null) {
        System.out.println("first num is invalid");
    } else {
        System.out.println("First num is " + myNum1.getNum());
    }
    if (myNum2.getNum() == null) {
        System.out.println("Seconf num is invalid");
    } else {
        System.out.println("Second num is " + myNum2.getNum());
    }
 }
 public static void main(String[] args) {
    validatePhoneNum("8630686425", "945892501");
    
 }
}

