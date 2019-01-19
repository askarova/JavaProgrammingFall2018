package day60_exceptions02;

public class CheckingAccount extends BankAccount{

		   private int balance;

		   public CheckingAccount(long cardNum, String cardName, int balance) {
		       super(cardNum, cardName);
		       this.balance = balance;
		   }

		   public int getBalance() {
		       return balance;
		   }

		   public void setBalance(int balance) {
		       this.balance = balance;
		   }


		   @Override
		   public String toString() {
		       return  getCardName() + ” CheckingAccount [balance= ” + balance +   ” | card number is “+ getCardNumber()+”  ]“;
		   }

		   @Override
		   public void deposit(int num1){

		       this.balance += num1 ;

		   }

		   @Override
		   public void withdraw(int num2) throws RuntimeException {

		       this.balance -= num2 ;
		       if(this.balance<0){
		           throw new RuntimeException(“YOUR BALANCE DROPPED TO BELOW 0”) ;
		       }

		   }

		}

