package chap03;

public class Exercise3_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5.0;
		double y = 0.0;
		double z = x % y;		//NaN
		double w = x / y;		//Infinite
		
		if(Double.isNaN(z))
		{
			System.out.println("0.0���� ���� �� �����ϴ�(NaN)");
		}
				
		else
		{
			double result = z + 10;
			System.out.println("��� : " + result);
		}

		if(Double.isInfinite(w))
		{
			System.out.println("0.0���� ���� �� �����ϴ�(Infinite)");
		}
		
		else
		{
			double result = w + 10;
			System.out.println("��� : " + result);
		}
	}

}
