package study_chap04;

/*
 * /*Math.random() �޼ҵ�(�Լ�)��, 
 * "0.0 �̻󿡼� 1.0 �̸� (greater than or equal to 0.0 and less than 1.0)"�� double�� �Ǽ� ���� ��ȯ�մϴ�. 
 * ��, 0.0 �� ���� �� ������ 1.0 �� ���� �� �����ϴ�.
 */
public class Exercise4_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true)
		{
			int i = rand();	
			int j = rand();
			
			System.out.println("(" + i + ", " + j + ")");
			
			if(i+j==5)
			{System.out.println("�հ� 5, �ֻ��� ����");
			break;
			}				
		}

	}

	private static int rand() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*6 +1);    // 0 �̻� 1�̸� ���� �Ǽ�-> 6�� 0�̻� ~ 6�̸�, +1 �ϸ� 1 �̻� 7 �̸��� ��.
	}										
}
