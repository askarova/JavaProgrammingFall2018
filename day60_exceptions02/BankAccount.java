package day60_exceptions02;

public class BankAccount{
	
	private long cardNumber;
	   private String cardName;

	   public BankAccount(long cardNumber, String cardName) {
	       super();
	       this.cardNumber = cardNumber;
	       this.cardName = cardName;
	   }

	   public long getCardNumber() {
	       return cardNumber;
	   }

	   public void setCardNumber(long cardNumber) {
	       this.cardNumber = cardNumber;
	   }

	   public String getCardName() {
	       return cardName;
	   }

	   public void setCardName(String cardName) {
	       this.cardName = cardName;
	   }

	   public abstract void deposit(int amount);
	   public abstract void withdraw(int amount) throws RuntimeException;

	   @Override
	   public String toString() {
	       return “Card Name: “+cardName+ ” with Card Number: “+cardNumber;
	   }


	}


