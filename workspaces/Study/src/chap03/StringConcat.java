package chap03;

// concatenation ����, �ڿ� ��� �߰�
public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDK" + 6.0;		// 6.0 �� ���ڿ��� �ڵ� ����ȯ�Ǿ� JDK6.0 ���� ����ȴ�.
		String str2 = str1 + "Ư¡";		// 
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;	//���ڿ��� ���� ���ͼ� �ڿ��� ���ڿ��� ����
		String str4 = 3 + 3.0 + "JDK";	// �ϴ� ���ڰ� ���� ���ͼ� ����ϴٰ� ���ڿ� ������ ����
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = 6 * 2 + "JDK" + 4 * 5; // + �����ڸ��� ���ڿ��� �ٰ� ���ϱ�� �׳� ���ڷ� ���
		String str6 = "JDK" + 4 * 5;
		System.out.println(str5);
		System.out.println(str6);

	}

}
