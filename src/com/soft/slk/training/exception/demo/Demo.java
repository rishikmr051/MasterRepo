package com.soft.slk.training.exception.demo;

public class Demo {
	public static void main(String [] args) {
	      Account c = new Account(1000001);
	      System.out.println("Depositing $500...");
	      c.deposit(500.00);
	      
	      try {
	    	  double amountToWithdraw = 100.00;
	         System.out.println("\nWithdrawing $"+amountToWithdraw+"...");
	         c.withdraw(amountToWithdraw);
	         
	         amountToWithdraw = 600.00;
	         System.out.println("\nWithdrawing $"+amountToWithdraw+"...");
	         c.withdraw(600.00);
	      } catch (InsufficientFundsException e) {
	         System.out.println("Sorry, but you are short $" + e.getAmount());
	         e.printStackTrace();
	      }
	   }
}
