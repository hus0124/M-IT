package chap03;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String : ���̺귯�� Ŭ����
		// C����� ����ü�� ����� ���� Ŭ����
		// str : ������ ������ c��� char* ptr = "ȫ�浿" �ڹٴ� ���� ������ ����.
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";	// �� ���� ������ �����̹Ƿ� �ּ� �ϳ�
		
		String str3 = new String("ȫ�浿");	// ������ �����ϳ� new �� ��ü ���� ����� ���� ���� �����.
		if(str1 == str2)	// �ּҸ� ���� ��.
		{ 
			System.out.println("������ (���� ��ü) ���̴�");
		}
		else
		{
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		if(str2 == str3)
		{ 
			System.out.println("������ (���� ��ü) ���̴�");
		}
		else
		{
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		// �ּҰ� �ƴ϶� ������ ���� ���� �ִ�. equals() �޼ҵ带 ����Ѵ�.
		if(str1.equals(str2))
		{
			System.out.println("���� �����Դϴ�");
		}
		else
		{
			System.out.println("�ٸ� �����Դϴ�.");
		}
		
		if(str2.equals(str3))
		{
			System.out.println("���� �����Դϴ�");
		}
		else
		{
			System.out.println("�ٸ� �����Դϴ�.");
		}

	}

}
