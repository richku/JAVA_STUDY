package icehs.science.chapter06;

public class Car {
	int oilAmount;
	double distance;
	
	void addOil(int amount) {
		System.out.println("�ֹ��� : " + amount +"L �����մϴ�.");
		oilAmount += amount;
		printCarInfo();
	}
	
	void driveCar(String start, String end, double dist) {
		System.out.println(start +"���� " + end + "����" + dist +"km �����Ͽ����ϴ�.");
		oilAmount = (int)(oilAmount - (dist / 20));
		distance += dist;
		printCarInfo();
	}
	
	void ableDriveDistance() {
		double ableDist = oilAmount * 20;
		System.out.println("���� ������ �Ÿ��� �� " + ableDist +"km �Դϴ�.");
	}
	
	void printCarInfo() {
		System.out.println("[ICE ī~] ���� �⸧�� : " + oilAmount + "L, �� ����Ÿ� : " + distance +"km");
	}
}
