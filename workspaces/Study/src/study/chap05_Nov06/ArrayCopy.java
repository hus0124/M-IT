package study.chap05_Nov06;

public class ArrayCopy {
/*
 * �迭 Array �� ���� : �� �� ũ�⸦ ���ؼ� �����ϸ� ũ�� ���� �Ұ�. �� �ʿ��ϸ� ū �迭 ���� ����� ���� �迭�κ��� �ּҸ� ���� ����..
 * System.arryCopy() ��� �޼ҵ� ���.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {2, 4, 6, 8};	// ���� 4�� ����. ũ�� ����, ����Ұ�.
		int arr2[] = new int[10];	// ũ�� �� ū �迭 ���� ����.
		
		//����.1 �ݺ��� ����ؼ� ����.
		
		/*for (int i = 0; i < arr1.length; i++)
		{
			arr2[i] = arr1[i];
		}*/
		
		arr2[4] = 10;

		//����2. �Լ� ���
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); // arraycopy(�����迭, ��������ġ, ��������迭, ���������ġ, �����迭����) 
		
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
		
		

	}

}
