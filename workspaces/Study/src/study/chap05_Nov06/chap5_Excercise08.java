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
		// �ۼ� ��ġ
		
		for (int i = 0; i < array.length; i++)
		{
			k += array[i].length;		//�������� �Է°���ŭ ���̰� �Ǿ� ī���õȴ�.
			
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
