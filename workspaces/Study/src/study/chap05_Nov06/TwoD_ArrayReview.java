package study.chap05_Nov06;

public class TwoD_ArrayReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][] = { {1,2,3}, {4,5} };	// 2행인데 0행은 크기 3열 1행은 크기 2열
		// int arr1[][] = new int[3][4] 이렇게 하면 행마다 열을 따로 만들진 못 함.
		
		System.out.println("arr1의 행의 크기 = " + arr1.length);
		
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println("arr1[" + i + "]의 크기 = " + arr1[i].length);
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
			arr4[i] = new int[i+3];		// arr4의 각 행이 가진 크기. 즉 열을 지정.
		}
		
		int num=1;	// arr4에 값을 저장하는 과정
		for (int i = 0; i < arr4.length; i++)
		{
			for (int j = 0; j < arr4[i].length; j++)
			{
				arr4[i][j] = num++;
			}
		}
		//arr4 값을 출력하는 과정
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
