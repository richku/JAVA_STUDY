package icehs.science.chapter05;

public class SwitchCaseTest {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		int number3 = 40;
		int number4 = 50;
		int number5 = 80;
		
		double result = number1 * number2 /2 * 0.6;
		result = result + (number3 + number4) /2 * 0.13;
//		result = result + number5 * 0.27;
		result += number5 * 0.27;
		System.out.println("�� ���� : " + (int)result);
		
		switch((int)result/10) {
		case 9 : System.out.println("Special Class�Դϴ�."); break;
		case 8 : System.out.println("Gold Class�Դϴ�."); break;
		case 7 : System.out.println("Silver Class�Դϴ�."); break;
		case 6 : System.out.println("Bronze Class�Դϴ�."); break;
		default : System.out.println("Member Class�Դϴ�.");
		}

	}

}
