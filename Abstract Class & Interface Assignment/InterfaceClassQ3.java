package Diya_Web_assignments;

//BankAccount interface
interface BankAccounts 
{
	void deposit(double amount);

	void withdraw(double amount);
}

class CheckingAccounts implements BankAccounts 
{
	private double balance;

	public CheckingAccounts(double initialBalance)
	{
		this.balance = initialBalance;
	}

	public void deposit(double amount) 
	{
		balance += amount;
		System.out.println("Deposited: $" + amount);
	}

	public void withdraw(double amount) 
	{
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		} else {
			System.out.println("Insufficient funds for withdrawal.");
		}
	}

	public double getBalance()
	{
		return balance;
	}
}

public class InterfaceClassQ3 
{
	public static void main(String[] args) {
		CheckingAccounts checkingAccount = new CheckingAccounts(1000.0);

		// Deposit money into the CheckingAccount
		checkingAccount.deposit(500.0);

		// Withdraw money from the CheckingAccount
		checkingAccount.withdraw(200.0);

		// Attempt to withdraw more money than the balance
		checkingAccount.withdraw(1500.0);

		// Print the final balance
		System.out.println("Final Balance: $" + checkingAccount.getBalance());
	}
}
