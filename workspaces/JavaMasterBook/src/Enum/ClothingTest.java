package Enum;

public class ClothingTest {

	public static void main(String[] args) {
		ClothingInfo_ENUM obj1 = new ClothingInfo_ENUM("20191204", "�е�", "��100%", Season.WINTER);
		System.out.println("��ǰ�ڵ� : " + obj1.code);
		System.out.println("��ǰ�� : " + obj1.name);
		System.out.println("���� : " + obj1.material);
		System.out.println("�������� : " + obj1.season);
		
	}

}
