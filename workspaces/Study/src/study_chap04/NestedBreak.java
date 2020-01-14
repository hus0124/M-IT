package study_chap04;

public class NestedBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loop: for (int i = 2; i < 10; i++)
		{
			for (int j = 1; j < 10; j++)
			{
				if(i > 5 && j > 5)
					break Loop;
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}

	}

}
