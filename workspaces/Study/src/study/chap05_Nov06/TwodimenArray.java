package study.chap05_Nov06;

public class TwodimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = { {1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3, 4, 5} };
		
		for (int i = 0; i < arr1.length; i++)		// arr1�� length�� �� 3
		{
			System.out.println("arr1[" + i +"] �� ���� = " + arr1[i].length);
			for (int j = 0; j < arr1[i].length; j++)	// arr1[i]�� length �� ��
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
			
		}
		
		System.out.println("----------------");

		int arr2[][]= new int[3][];		// ���� �迭 �ϴ� ����
		for (int i = 0; i < 3; i++)		// 3�� �ϴ� ���������� i ���� �׿� �°� �����Ѵ�.
		{
			arr2[i] = new int[i+3];		// �� ���� ���� ���� �迭 ����. arr2[i] = �����(���� ����)
		}
		
		int num = 1;
		for (int i = 0; i < arr2.length; i++)	// i�� �� j�� ��. 
		{
			for (int j = 0; j < arr2[i].length; j++) // i���� ���̴� �� ���̴�.
			{
				arr2[i][j] = num++;
			}
		}
		
		for (int i = 0; i < arr2.length; i++)		// arr2�� length�� �� 3
		{
			System.out.println("arr2[" + i +"] �� ���� = " + arr2[i].length);
			for (int j = 0; j < arr2[i].length; j++)	// arr2[i]�� length �� ��
			{
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		// 3���� �迭
		
	}

}
