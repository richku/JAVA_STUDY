package icehs.science.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int firstNum = 20;
		int secondNum = 7;
		
		int plusResult = firstNum + secondNum;
		int minusResult = firstNum - secondNum;
		int multipleResult = firstNum * secondNum;
		int divideResult = firstNum / secondNum;
		int remainderResult = firstNum % secondNum;
		
		System.out.println("���� ���  : " + plusResult);
		System.out.println("���� ���  : " + minusResult);
		System.out.println("���� ���  : " + multipleResult);
		System.out.println("������ ��� : " + divideResult);
		System.out.println("������  : " + remainderResult );

	}

}
