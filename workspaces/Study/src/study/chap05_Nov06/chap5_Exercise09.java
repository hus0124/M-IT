package study.chap05_Nov06;

import java.util.Scanner;

public class chap5_Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;	// ���� �� �ȵ��� null�� �ʱ�ȭ.
		Scanner scanner = new Scanner(System.in);		// ���ڿ�, ���� �� ����. �̸��� scanner ������ ������ �ѵ� �� �򰥸���...
				
		while(run)
		{			
			System.out.println("--------------------------------------");
			System.out.println("1.�л��� |2.�����Է�  |3.��������Ʈ |4.�м� |5.����");
			System.out.println("--------------------------------------");
			System.out.print("����> ");
						
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1)
			{
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];		// null�� ������ �迭 scores�� studentNum��ŭ ũ�� �ʱ�ȭ�Ͽ� �޸� �Ҵ�.
				
			}
			else if(selectNo == 2)
			{
				for (int i = 0; i < studentNum; i++)
				{
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt();	// �迭 scores �� �ʱ�ȭ�Ǿ��� ������ ��밡��. �Է¹��� �� �ִ�. ������ ���� ��������� �Ѵ�.
				}
			}
			else if(selectNo == 3)
			{
				for (int i = 0; i < studentNum; i++)
				{					
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			}
			else if(selectNo == 4)
			{
				int sum = 0;
				int max = 0;
				for (int i = 0; i < studentNum; i++)
				{					
					if (max < scores[i])
					{
						max = scores[i];
					}
				sum = sum + scores[i];					
				}
				double avg = (double)sum / studentNum;
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
			}
			else if(selectNo == 5)
			{
				run = false;	//boolean run = true, while(run)���� �� false�� �ؼ� �ݺ��� ����
			}
		}

		System.out.println("���α׷� ����");
	}

}