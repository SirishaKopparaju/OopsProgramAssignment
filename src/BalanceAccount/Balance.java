package BalanceAccount;

import java.util.Scanner;

public class Balance extends Account {

	
	// TODO Auto-generated method stub
	public static void calculation()
	{
		int amount=5000;
	int balance;
	Scanner s=new Scanner(System.in);
	System.out.println("please enter the amount you want to debit");
	 
	int debit=s.nextInt();
	if(debit<=5000)
	 {
		 balance=amount-debit;
		 System.out.println("original amount present is \n"+amount);
		 System.out.println("amount debited is\n"+debit);
		 System.out.println("amount present in the account after debiting is \n"+balance);
	 }
	 else 
	 {
		 System.out.println("sorry insufficient balance"); 
		 System.out.println("original amount present is \n"+amount);
	 }

}

}
