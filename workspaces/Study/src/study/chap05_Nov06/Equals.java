package study.chap05_Nov06;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		String str3 = new String("ȫ�浿");	//str1 �� �ּ� �ٸ���.
		String str4 = new String("ȫ�浿");	//str3 �� ���� ������ �ּҴ� �� �ٸ���
		
		if(str1==str2)	// �ּ� ��
			System.out.println("str1 �� str2 �� ���� ��ü�� ����");
		else
			System.out.println("str1 �� str2 �� �ٸ� ��ü�� ����");
		
		if(str2==str3)	// �ּ� ��
			System.out.println("str2 �� str3 �� ���� ��ü�� ����");
		else
			System.out.println("str2 �� str3 �� �ٸ� ��ü�� ����");
		
		//��ü�� ������ ��
		
		if(str1.equals(str2))	// �ּ� ��
			System.out.println("str1 �� str2 �� ���� ����(��)");
		else
			System.out.println("str1 �� str2 �� �ٸ� ����(��)");
		
		if(str2.equals(str3))	// �ּ� ��
			System.out.println("str2 �� str3 �� ���� ����(��)");
		else
			System.out.println("str2 �� str3 �� �ٸ� ����(��)");
		
		// new str3 �� str4 ���� ��
		
		if(str3 == str4)	// �ּ� ��
			System.out.println("str3 �� str4 �� ���� �ּ�");
		else
			System.out.println("str3 �� str4 �� �ٸ� �ּ�");
		
		if(str3.equals(str4))	// �ּ� ��
			System.out.println("str3 �� str4 �� ���� ����(��)");
		else
			System.out.println("str3 �� str4 �� �ٸ� ����(��)");

	}

}
