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
			System.out.println("0.0으로 나눌 수 없습니다(NaN)");
		}
				
		else
		{
			double result = z + 10;
			System.out.println("결과 : " + result);
		}

		if(Double.isInfinite(w))
		{
			System.out.println("0.0으로 나눌 수 없습니다(Infinite)");
		}
		
		else
		{
			double result = w + 10;
			System.out.println("결과 : " + result);
		}
	}

}
