package icehs.science.chapter07;

public class PublicationTest {

	public static void main(String[] args) {
		Publication pub1 = new Publication();
		pub1.setTitle("��ȭ�ﱹ��");
		pub1.setPage(300);
		pub1.setPrice(5000);
		
		System.out.println("==== ���ǹ� ������ �����մϴ�.=====");
		pub1.setPage(-1000);
		pub1.setPrice(-5000);
		//pub1.printPublicationInfo();
		
		System.out.println("���ǹ� ���� : " + pub1.getTitle() + "( " + pub1.getPrice() +"��, " + pub1.getPage()+ "page)");
		

	}

}
