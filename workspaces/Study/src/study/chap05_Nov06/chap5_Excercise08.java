package study.chap05_Nov06;

public class chap5_Excercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int k = 0;
		// 작성 위치
		
		for (int i = 0; i < array.length; i++)
		{
			k += array[i].length;		//어디까지나 입력값만큼 길이가 되어 카운팅된다.
			
			for (int j = 0; j < array[i].length; j++)
			{
				sum = sum + array[i][j];
				//k++;
			}
		}
				
		avg = (double)sum / (double)k;
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);

	}

}
