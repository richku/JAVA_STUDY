package icehs.science.chapter06;

public class Account {
	String accountName;
	String accountNo;
	int balance;
	
	void deposit(int money) {
		System.out.println(money +" 원 입금합니다.");
		if (money < 0) {
			System.out.println("금액은 음수를 입력할 수 없습니다.");
		} else {
			balance += money;
			printBalance();
		}
	}
	
	int withdraw(int money) {
		System.out.println(money +" 원 출금합니다.");
		if (money < 0) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
			return 0;
		}else if(money > balance) {
			System.out.println("[에러]잔액이 부족합니다.");
			return 0;
		}else {

			balance -= money; //balance= balance - money;
			printBalance();
			return money;
		}
		
	}
	
	void printAccountInfo() {
		System.out.println("계좌 : " + accountNo + "( 예금주 : " + accountName + " )");
		printBalance();
	}
	
	void printBalance() {
		System.out.println("잔액 : " + balance +"원");
	}
}
