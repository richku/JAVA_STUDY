package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new Coffee();
		Coffee cafelatte = new Coffee();
		Coffee makiatto = new Coffee();
		
		americano.name ="�Ƹ޸�ī��";
		americano.price = 3500;
		americano.printCoffeeInfo();
		
		cafelatte.name ="ī���";
		cafelatte.price = 4000;
		cafelatte.printCoffeeInfo();
		
		makiatto.name = "�Ƴ��ƶ�";
		makiatto.price = 4500;
		makiatto.printCoffeeInfo();
		
		int totalPrice = americano.price + cafelatte.price + makiatto.price;
		System.out.println("�� �ݾ� : " + totalPrice +"��");
		
		

	}

}
