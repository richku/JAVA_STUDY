package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int first = 2;
		int second = 3;
		int third = 4;
		int forth = 5;
		int fifth = 23;
		int sixth = 96;
		
		int result = first * second;
		System.out.print(first +" * " + second + " : ");
		if(result > 100) {
			System.out.println("���ڸ� �� �̻��Դϴ�.");
		}else if(result > 10) {
			System.out.println("���ڸ� ���Դϴ�.");
			
		}else if(result >= 0) {
			System.out.println("���ڸ� ���Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}

		result = third * forth;
		System.out.print(third +" * " + forth + " : ");
		if(result > 100) {
			System.out.println("���ڸ� �� �̻��Դϴ�.");
		}else if(result > 10) {
			System.out.println("���ڸ� ���Դϴ�.");
			
		}else if(result >= 0) {
			System.out.println("���ڸ� ���Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}

		result = fifth * sixth;
		System.out.print(fifth +" * " + sixth + " : ");
		if(result > 100) {
			System.out.println("���ڸ� �� �̻��Դϴ�.");
		}else if(result > 10) {
			System.out.println("���ڸ� ���Դϴ�.");
			
		}else if(result >= 0) {
			System.out.println("���ڸ� ���Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
		result = forth * (-1) * third;
		System.out.print(forth +" * " + (-1)*third + " : ");
		if(result > 100) {
			System.out.println("���ڸ� �� �̻��Դϴ�.");
		}else if(result > 10) {
			System.out.println("���ڸ� ���Դϴ�.");
			
		}else if(result >= 0) {
			System.out.println("���ڸ� ���Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}


	}

}
