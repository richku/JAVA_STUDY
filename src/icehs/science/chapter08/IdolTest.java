package icehs.science.chapter08;

public class IdolTest {

	public static void main(String[] args) {
		Idol[] idols = {
			new Idol("�ҳ�ô�", "�¿�"),
			new Idol("����Ÿ", "����"),
			new Idol("���", "���巡��"),
			new Idol("��Ʈ", "�����")
		};
		
		/*
		 * System.out.println(idols[0].getGroup() + " : " + idols[0].getName());
		 * System.out.println(idols[1].getGroup() + " : " + idols[1].getName());
		 * System.out.println(idols[2].getGroup() + " : " + idols[2].getName());
		 * System.out.println(idols[3].getGroup() + " : " + idols[3].getName());
		 */
		for(int i = 0 ; i < idols.length ; i++) {
			System.out.println(idols[i].getGroup() + " : " + idols[i].getName());
		}
		
		
	}

}
