package icehs.science.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int [] scores = {93, 87, 90, 98};
		String[] subjects = {"����","����","����","����"};
		int sum = 0;
		double average = 0;
		
		for (int i  = 0 ; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(subjects[i] + " : " + scores[i]);
		}
		
		average = (double)sum /scores.length;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + average);
		
		
		/*
		 * System.out.println("���� : " + scores[0]); System.out.println("���� : " +
		 * scores[1]); System.out.println("���� : " + scores[2]);
		 * System.out.println("��� : " + average);
		 */
		


	}

}
