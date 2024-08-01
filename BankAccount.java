import java.util.Scanner;
public class BankAccount {
	
	int amount=50000;
	void checkBalance() {
		System.out.println("balance in the account is"+amount);
	}
	void deposit(int depositAmt) {
		amount=amount+depositAmt;
		System.out.println("balance in the account after depositing"+amount);
	}
	void withdraw(int withdrawAmt) {
		amount=amount-withdrawAmt;
		System.out.println("balance in the account after withdrawing"+amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BankAccount b=new BankAccount();
		
		int depositAmt=sc.nextInt();
		int withdrawAmt=sc.nextInt();
		b.checkBalance();
		b.deposit(depositAmt);
		b.withdraw(withdrawAmt);
		

	}

}
