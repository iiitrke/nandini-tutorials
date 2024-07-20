package bank;

public class SavingAccount extends BankAccount {
         private double addInterest=0.03; 
        public SavingAccount(String accountHolder, String accountNum, double balance){
            super(accountHolder, accountNum, balance);
        }
         
        public void intrest(double balance){
            addInterest=0.03;
            balance+=balance*addInterest;
        }
        public String getBalance(){
            return super.toString();
        }
}
