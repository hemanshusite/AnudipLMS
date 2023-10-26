package Diya_Web_assignments;

//Abstract BankAccount class
abstract class BankAccount 
{
	private String accountNumber;
	protected double balance;

	public BankAccount(String accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	abstract void deposit(double amount);

	abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount
{
	public CheckingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited: $" + amount);
	}

	void withdraw(double amount)
	{
		if (balance >= amount) 
		{
			balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		} 
		else 
		{
			System.out.println("Insufficient funds for withdrawal.");
		}
	}
}

public class AbstractClassQ2 
{
	public static void main(String[] args) 
	{
		CheckingAccount checkingAccount = new CheckingAccount("12345", 1000.0);

		// Deposit money into the CheckingAccount
		checkingAccount.deposit(500.0);

		// Withdraw money from the CheckingAccount
		checkingAccount.withdraw(200.0);

		// Attempt to withdraw more money than the balance
		checkingAccount.withdraw(1500.0);

		// Print the final balance
		System.out.println("Final Balance: $" + checkingAccount.balance);
	}
}
