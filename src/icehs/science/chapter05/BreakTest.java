package icehs.science.chapter05;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("���� ���ڸ� �Է��ϼ���. 0�� �Է��ϸ� ������");
			int num = scanner.nextInt();
			if(num == 0) {
				break;
			}else {
				sum += num;
			}
		}
		System.out.println("�հ� : " + sum);

	}

}
