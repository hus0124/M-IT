package study.chap05_Nov06;

public class StringArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] = { "�ڹ�", "C���", "DBMS" };
		String more[] = new String[15];
		
		System.arraycopy(str, 0, more, 0, str.length);	//�ּҰ� ���� ����. �̸��� '���� ����' : �ּҸ� �����.
		
		for (int i = 0; i < more.length; i++)
		{
			System.out.println(more[i]);
		}
		
		for (int i = 0; i < str.length; i++)
		{
			if(str[i] == more[i])
			{
				System.out.println("���� ��ü�� ����");	// ���� ����� �ּ� ���������� ���� ��ü ������.
			}
			else
			{
				System.out.println("�ٸ� ��ü�� ����");
			}
		}
		
		//���� ����. ��ü �����ؼ� ���밪�� ����
		
		for (int i = 0; i<str.length; i++)
		{
			more[i] = new String(str[i]);
		}
		
		for (int i = 0; i < more.length; i++)
		{
			System.out.println(more[i]);
		}
		
		for (int i = 0; i < str.length; i++)
		{
			if(str[i] == more[i])
			{
				System.out.println("���� ��ü�� ����");
			}
			else
			{
				System.out.println("�ٸ� ��ü�� ����");	// ���� ����� �� ��ü�� ���밪�� �����ؼ� �ּҰ� �ٸ�. �ٸ� ��ü ������ ��.
			}
		}
				

	}

}
