package study.chap05_Nov06;

public class Compare {

	public static void main(String[] args) {
		// �⺻ ������ Ÿ���� ����
		// ����, �Ǽ� , ��
		
		int num = 10;		// �⺻ Ÿ�� ������ ���� ��ġ�� stack. ���� ������ ������ �ʱ�ȭ �� ���̴�.
		int var1;			// �ʱ�ȭ���� ������ stack�� ������� �ʴ´�.
		var1 = 20;			// stack�� ����ȴ�. ���� ���ԵǴ� �ʱ�ȭ ����.
		
		if (num==10)
		{
			System.out.println(num);
		}
		
		// ���� Ÿ���� ����
		// �迭, ������(enum), Ŭ���� , �������̽�
		
		String str = "ȫ�浿";	// str�� ���� ����, : ȫ�浿 �̶� ������ heap�� ����ǰ� �� �ּҴ� ���� ���� ���� ���� str�� ����ִ�. 
	    // str = null	 �̷��� �ϸ� ȫ�浿�� ���� ����� �����. �ּҰ� �������ϱ�.
		
		String str2 = "ȫ�浿";	// heap ������ ����� ������ ��ü
		
		if (str==str2)		// �� ���������� �ּҰ��� ���Ѵ�
			System.out.println("������ ��ü�� �����Ѵ�");
		else
			System.out.println("�ٸ� ��ü�� �����Ѵ�");
		
		if (str.equals(str2))		// �� ���������� ������ ���Ѵ�.
			System.out.println("���� ������ ���� ������");
		else
			System.out.println("�ٸ� ������ ���� ������");
		
		System.out.println("str2�� ���ڿ��� ���� = " + str2.length());
		String str3 = null;		//�ƹ��͵� �������� ����
		// str3 = method1(); �̷� ������ �޼ҵ� ����� �޵��� �ߴµ� null ���� �� �� �� �ִ�. �׷��� nullpoint exception
		// ���� ��� Ȩ���������� �����Է� �ϳ� ����ΰ� ���� ġ�� ���.
		
		if (str3 != null)
		    System.out.println("str3�� ���ڿ��� ���� = " + str3.length());
		else	// null �̸� ����ó��
			System.out.println("�����߻�");
		
		
	}

}
