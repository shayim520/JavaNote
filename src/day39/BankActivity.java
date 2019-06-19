package day39;

public class BankActivity {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.accountHolder = "jhon";
		account.balance = 350000;
		account.showAccountHolder();
		account.showBalance();
		account.add100Dollar();
		account.showBalance();
		account.addDollar(-100);
		account.showBalance();

		

	}

}
