package icehs.science.chapter07;

public class ItBook {
	public static int NO_OF_OBJECT = 0;
	private String title;
	private int price;
	private double discountRate;
	
	public ItBook(String title, int price, double discountRate) {
		this.NO_OF_OBJECT += 1;
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void printItBookInfo(){
		System.out.println("���� : " + this.title + ", ���� : " + this.price + " ��, ������ : " + this.discountRate + " , ���ΰ� : " +
				(int)(this.price * (100 - this.discountRate)/100) +" ��");
	}

}
