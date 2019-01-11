package icehs.science.chapter05;

public class BreakSumTest {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		for(  ; i <= 10 ; i++) {
			sum += i;
			if(sum >=30) {
				break;
			}
		}
		System.out.println(i +"번째");
		System.out.println("합계  : " + sum);

	}

}
