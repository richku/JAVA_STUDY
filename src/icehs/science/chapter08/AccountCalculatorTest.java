package icehs.science.chapter08;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		Account [] acc = {
				new Account("111-2222-5550", 10000, 4.5),
				new Account("111-2222-5551", 20000, 4.5),
				new Account("111-2222-5552", 30000, 4.5),
				new Account("111-2222-5553", 40000, 4.5),
				new Account("111-2222-5554", 50000, 4.5)
		};
		
		for(int i = 0; i < acc.length ; i++) {
			System.out.println("���¹�ȣ : " + acc[i].getName() + " / �ܾ� : " 
					+ acc[i].getBalance() +"/ ����  : "+ acc[i].getInterestRate() +"%");
		}
		
		System.out.println("������ �����մϴ�.");
		
		for(int i = 0; i < acc.length ; i++) {
			acc[i].setInterestRate(3.7);
		}		
		
		
		for(int i = 0; i < acc.length ; i++) {
			System.out.println("���¹�ȣ : " + acc[i].getName() + "/ ����  : "+ acc[i].getInterestRate() + "% / �ܾ� : " 
					+ (acc[i].getBalance()+ acc[i].calculateInterest()));
		}
	}

}
