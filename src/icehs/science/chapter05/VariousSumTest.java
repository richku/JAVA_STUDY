package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sumAll = 0;
		int sumOdd = 0;
		int sumEven = 0;
		
		for (int i =1 ; i <= 1000 ; i++) {
			if( i % 2 == 0) {
				sumEven = sumEven + i;
			}else {
				sumOdd += i;
				//sumOdd = sumOdd + i;
			}
		}
		
		sumAll = sumOdd + sumEven;
		
		System.out.println("1���� 1000������ �� : " + sumAll);
		System.out.println("1���� 1000���� ¦������ �� : " + sumEven);
		System.out.println("1���� 1000���� Ȧ������ �� : " + sumOdd);

	}

}
