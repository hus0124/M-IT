package study.chap05_Nov06;

public class TwoD_ArrayReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][] = { {1,2,3}, {4,5} };	// 2���ε� 0���� ũ�� 3�� 1���� ũ�� 2��
		// int arr1[][] = new int[3][4] �̷��� �ϸ� �ึ�� ���� ���� ������ �� ��.
		
		System.out.println("arr1�� ���� ũ�� = " + arr1.length);
		
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println("arr1[" + i + "]�� ũ�� = " + arr1[i].length);
			for (int j = 0; j < arr1[i].length; j++)
			{
				
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println();
		
		int arr4[][] = new int[3][];
		for(int i = 0; i < arr4.length; i++)
		{
			arr4[i] = new int[i+3];		// arr4�� �� ���� ���� ũ��. �� ���� ����.
		}
		
		int num=1;	// arr4�� ���� �����ϴ� ����
		for (int i = 0; i < arr4.length; i++)
		{
			for (int j = 0; j < arr4[i].length; j++)
			{
				arr4[i][j] = num++;
			}
		}
		//arr4 ���� ����ϴ� ����
		for (int i = 0; i < arr4.length; i++)
		{
			for (int j = 0; j < arr4[i].length; j++)
			{
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}

	}

}
