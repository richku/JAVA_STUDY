package icehs.science.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.accountName = "ȫ�浿";
		acc.accountNo ="123-456789";
		acc.balance = 10000;
		acc.printAccountInfo();
		acc.deposit(20000);
		acc.withdraw(45000);
		
		
		acc.deposit(-1000);
		acc.withdraw(-1000);


	}

}
