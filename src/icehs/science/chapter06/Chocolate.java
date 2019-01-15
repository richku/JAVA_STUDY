package icehs.science.chapter06;

public class Chocolate {
	String name;
	String type;
	int price;
	
	String getName() {
		return name;
	}
	
	int calculateTotalPrice(int count) {
		return count * price;
	}
	
	int calculateTotalPrice(int count, int discount) {
		int resultPrice = price * (100 - discount) / 100 *count ;
		return resultPrice;
	}
	
	void changeChocolateInfo(String newName, int newPrice){
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}
	void changeChocolateInfo(String newName, String newType, int newPrice) {
		name = newName;
		type = newType;
		price = newPrice;
		printChocolateInfo();
	}
	
	void printChocolateInfo() {
		System.out.println("�̸� : " + name + ", ���� : " + type + ", ���� : " + price);
	}

}
