package icehs.science.chapter05;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		int score = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("������ �Է��ϼ���.");
			 score = scanner.nextInt();
		}while(score< 0 || score > 100);
		
		System.out.println(score);
	}

}
