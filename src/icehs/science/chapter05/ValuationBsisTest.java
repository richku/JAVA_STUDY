package icehs.science.chapter05;

public class ValuationBsisTest {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		int number3 = 40;
		int number4 = 50;
		int number5 = 180;
		
		double result = number1 * number2 /2 * 0.6;
		result = result + (number3 + number4) /2 * 0.13;
//		result = result + number5 * 0.27;
		result += number5 * 0.27;
		System.out.println("�� ���� : " + result);
		if (result >=95 && result <= 100) {
			System.out.println("Special Class�Դϴ�.");
		}else if(result >= 90 && result < 95) {
			System.out.println("Gold Class�Դϴ�.");
		}else if(result >= 85 && result < 90) {
			System.out.println("Silver Class�Դϴ�.");
		}else if(result >= 80 && result < 80) {
			System.out.println("Bronze Class�Դϴ�.");
		}else  if (result < 80){
			System.out.println("Member �Դϴ�.");
		}else {
			System.out.println("�Է°��� �߸��Ǿ����ϴ�. �ٽ� �ѹ� Ȯ���غ�����.");
		}

	}

}
