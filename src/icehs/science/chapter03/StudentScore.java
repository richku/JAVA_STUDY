package icehs.science.chapter03;

public class StudentScore {

	public static void main(String[] args) {
		double mathScore = 94.7;
		double engScore = 83.2;
		double korScore = 87.1;
		
		int intMathScore = (int)mathScore;
		int intEngScore = (int)engScore;
		int intKorScore = (int)korScore;
		
		System.out.println("���� : " + intMathScore);
		System.out.println("���� : " + intEngScore);
		System.out.println("���� : " + intKorScore);
		//System.out.println("���� : " + (int)korScore);

	}

}
