package icehs.science.chapter07;

public class PublishTest2 {

	public static void main(String[] args) {
		Publication.printHeader();
		
		Publication samgooji = new Publication();
		Publication piStory = new Publication();
		
		samgooji.setTitle("��ȭ �ﱹ��");
		samgooji.setPage(300);
		samgooji.setPrice(5000);
		samgooji.printPublicationInfo();
		
		piStory.setTitle("���� �̾߱�");
		piStory.setPrice(8400);
		piStory.setPage(280);
		piStory.printPublicationInfo();
		
		
	}

}
