package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int score = 92;
		
		if(score >= 90 && score <= 100) {
			System.out.println("100������  ~ 90�� �̻� : A�����Դϴ�.");
		}else if(score >= 80 && score < 90) {
			System.out.println("90���̸�  ~ 80�� �̻� : B�����Դϴ�.");
		}else if(score >= 70 && score < 80) {
			System.out.println("80���̸�  ~ 70�� �̻� : C�����Դϴ�.");
		}else if(score >= 60 && score < 70) {
			System.out.println("70���̸�  ~ 60�� �̻� : D�����Դϴ�.");
		}else {
			System.out.println("60�� �̸� : F�����Դϴ�.");
		}
	

	}

}
