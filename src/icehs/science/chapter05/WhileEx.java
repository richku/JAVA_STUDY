package icehs.science.chapter05;

public class WhileEx {

	public static void main(String[] args) {
		int sum = 0;
		int index = 1;
		
		while(sum < 10) {
			sum += index ;
			//index++; //index = index + 1;
			System.out.println(index++ + " : " + sum);
		}

	}

}
