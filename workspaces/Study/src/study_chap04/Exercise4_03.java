package study_chap04;

public class Exercise4_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for (int i = 1; i < 101; i++)
		{
			if(i % 3 == 0)
			{
			sum+=i;
			}
		}
		
		System.out.println("3�� ����� �� = " + sum);
		

	}

}
