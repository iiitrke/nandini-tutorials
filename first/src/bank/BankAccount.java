package bank;

public class BankAccount {
    private String accountHolder;
    private String accountNum;
    private double balance;

    public BankAccount(String accountHolder, String accountNum, double balance){
        this.accountHolder=accountHolder;
        this.accountNum=accountNum;
        this.balance=balance;
    }

    public void deposit(double amount){
        if (amount >0 ) {
            balance=balance+amount;
            System.out.println(amount+ " has been transferred to your account");
        }else{
            System.out.println("Invalid amount");
        }
    }
    
    public void withdrawl(double amount){
        if(amount>0 || amount<=balance){
            balance=balance-amount;
            System.out.println(amount +  " transaction has been processed");
        }else{
             System.out.println("Not enough balance");
        }
    }

    public void transfer(double amount){
        if(amount>0 || amount<=balance){
            balance=balance-amount;
            System.out.println(amount +  " transaction has been processed");
        }else{
             System.out.println("Not enough balance");
        }
    }

    public void getInfo(){
        System.out.print("Account Number : " + accountNum);
        System.out.print("Account Holder  : " + accountHolder);
        System.out.print("Balance  : " + balance);
    }
}
