package icehs.science.chapter07;

public class PublishTest2 {

	public static void main(String[] args) {
		Publication.printHeader();
		
		Publication samgooji = new Publication();
		Publication piStory = new Publication();
		
		samgooji.setTitle("만화 삼국지");
		samgooji.setPage(300);
		samgooji.setPrice(5000);
		samgooji.printPublicationInfo();
		
		piStory.setTitle("파이 이야기");
		piStory.setPrice(8400);
		piStory.setPage(280);
		piStory.printPublicationInfo();
		
		
	}

}
