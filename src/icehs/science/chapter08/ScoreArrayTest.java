package icehs.science.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int [] scores = {93, 87, 90, 98};
		String[] subjects = {"국어","영어","수학","과학"};
		int sum = 0;
		double average = 0;
		
		for (int i  = 0 ; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(subjects[i] + " : " + scores[i]);
		}
		
		average = (double)sum /scores.length;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		
		
		/*
		 * System.out.println("국어 : " + scores[0]); System.out.println("영어 : " +
		 * scores[1]); System.out.println("수학 : " + scores[2]);
		 * System.out.println("평균 : " + average);
		 */
		


	}

}
