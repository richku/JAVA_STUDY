package icehs.science.chapter06;

public class Student {

	String studentName;
	String studentId;
	int korean;
	int english;
	int math;
	
	int calculateAverage() {
		int average = (korean + english + math) / 3;
		return average;
	}
	
	void printStudentInfo() {
		System.out.println("�л� �̸� : " + studentName);
		System.out.println("�й� : " + studentId);
		System.out.println("���� ���� : " + korean);
		System.out.println("���� ���� : " + english);
		System.out.println("���� ���� : " + math);
	}
	
	void changeStudentId(String newId) {
		studentId = newId;
	}
}
