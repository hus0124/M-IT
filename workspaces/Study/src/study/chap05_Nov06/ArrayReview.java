package study.chap05_Nov06;

import java.util.Scanner;

public class ArrayReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1, 2, 3, 4};	// �迭�� ũ�Ⱑ 4
		
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		int arr2[];	// �����ϵ� �ʱ�ȭ �� ��. 
		int num = 1;
		
		arr2 = new int[5];	// 5�� ũ��� �ʱ�ȭ. new �� ��ü ����. �ν��Ͻ�ȭ. �޸� �Ҵ�.
							
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = num++;
		}
		
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		int arr3[] = new int[5];		// �ʱ�ȭ �ϵ� ���� ������ �ϴ� 0 ���� ä����.
		for(int i = 0; i < arr3.length; i++)
		{
			System.out.print(arr3[i] + " ");
		}
         
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�迭�� ũ�� : ");
		int len = scanner.nextInt();		// �迭�� ũ�⸦ �Է� �޵��� ����
		double darr[] = new double[len];	// �Է� ���� ���� ������ �̿�
		System.out.println("�迭 darr�� ũ�� = " + darr.length);
				
		
	}

}
