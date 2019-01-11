package icehs.science.chapter05;

public class ChangeWhileTest {

	public static void main(String[] args) {
		int inx = 1;
		while(inx <= 10) {
			int jnx = 1;
			while(jnx <= inx) {
				System.out.print("*");
				jnx++;
			}
			System.out.println();
			inx++;
		}
	}

}
