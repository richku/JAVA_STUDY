package icehs.science.chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student[] students = {
			new Student("������","STU001","010-1234-5678"),
			new Student("�̼���","STU002","010-2345-6789"),
			new Student("������","STU003","010-9876-5432")
		};
		
		for(int i = 0 ; i < students.length ;i++) {
			students[i].printStudentInfo();
		}
		
		/*
		 * for(Student student : students) { student.printStudentInfo(); }
		 */

	}

}
