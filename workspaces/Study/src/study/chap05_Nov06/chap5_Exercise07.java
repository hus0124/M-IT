package study.chap05_Nov06;

public class chap5_Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for (int i = 0; i < array.length; i++)
		{
			if(max < array[i])
			{
				max = array[i];
			}
		}
				
		System.out.println("첫번째 방법 max = " + max);
		
		System.out.println();
		
		for (int num :array)
		{
			if(max < num)
				max = num;
		}
		
		System.out.println("두번째 방법 max = " +max);

	}

}
