package study.chap05_Nov06;

public class TwodimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = { {1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3, 4, 5} };
		
		for (int i = 0; i < arr1.length; i++)		// arr1의 length는 행 3
		{
			System.out.println("arr1[" + i +"] 의 길이 = " + arr1[i].length);
			for (int j = 0; j < arr1[i].length; j++)	// arr1[i]의 length 는 열
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
			
		}
		
		System.out.println("----------------");

		int arr2[][]= new int[3][];		// 행의 배열 일단 설정
		for (int i = 0; i < 3; i++)		// 3행 일단 설정했으니 i 값은 그에 맞게 조절한다.
		{
			arr2[i] = new int[i+3];		// 각 행이 갖는 열의 배열 설정. arr2[i] = 어떤정수(열의 개수)
		}
		
		int num = 1;
		for (int i = 0; i < arr2.length; i++)	// i는 행 j는 열. 
		{
			for (int j = 0; j < arr2[i].length; j++) // i행의 길이는 곧 열이다.
			{
				arr2[i][j] = num++;
			}
		}
		
		for (int i = 0; i < arr2.length; i++)		// arr2의 length는 행 3
		{
			System.out.println("arr2[" + i +"] 의 길이 = " + arr2[i].length);
			for (int j = 0; j < arr2[i].length; j++)	// arr2[i]의 length 는 열
			{
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		// 3차원 배열
		
	}

}
