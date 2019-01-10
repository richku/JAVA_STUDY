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
		
		System.out.println("µ¡¼À °á°ú  : " + plusResult);
		System.out.println("»¬¼À °á°ú  : " + minusResult);
		System.out.println("°ö¼À °á°ú  : " + multipleResult);
		System.out.println("³ª´°¼À °á°ú : " + divideResult);
		System.out.println("³ª¸ÓÁö  : " + remainderResult );

	}

}
