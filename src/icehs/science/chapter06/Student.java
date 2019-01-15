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
		System.out.println("학생 이름 : " + studentName);
		System.out.println("학번 : " + studentId);
		System.out.println("국어 성적 : " + korean);
		System.out.println("영어 성적 : " + english);
		System.out.println("수학 성적 : " + math);
	}
	
	void changeStudentId(String newId) {
		studentId = newId;
	}
}
