package icehs.science.chapter07;

public class SimpleCalculator {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		
		SimpleCalculator.printTitle();
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
		SimpleCalculator.printTail();
		
	}
	
	public static void printTitle() {
		System.out.println("=====���� ���α׷��� �����մϴ�.=====");
	}
	
	public static void printTail() {
		System.out.println("========== Bye~ Bye~ ==========");
	}
}
