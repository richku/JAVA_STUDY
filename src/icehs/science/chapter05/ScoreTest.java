package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		double average = 0;
		
		System.out.print("���� �л�����? ");
		int studentNo = scanner.nextInt();
		
		for (int i = 1; i <=studentNo ;i++) {
			System.out.print(i +"�� ����: ");
			int score = scanner.nextInt();
			sum += score; //sum = sum + score;
		}
		average = (double)sum /studentNo;
		System.out.println("=========================");
		System.out.println(studentNo + "���� ���� : " + sum +"��");
		System.out.println(studentNo + "���� ��� : " + average +"��");
		System.out.println("=========================");
		

	}

}
