package study_chap04;

public class Exercise4_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y;
		for (x=1; x<11; x++)
		{
			for (y=1; y<11; y++)
			{
				if(4*x + 5*y ==60)
				{
					System.out.println("("+x+", "+y+")");
				}
			}
		}

	}

}
