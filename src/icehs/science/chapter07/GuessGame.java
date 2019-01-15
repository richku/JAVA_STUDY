package icehs.science.chapter07;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		int number = getUserNumber();

	}

	private static int getUserNumber() {
		Scanner scanner  = new Scanner(System.in);
		return scanner.nextInt();
	}

}
