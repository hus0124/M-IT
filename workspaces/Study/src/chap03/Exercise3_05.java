package chap03;

public class Exercise3_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 356;
		int cutt = value - (value % 100);	// 0.1 같은 실수 곱하면 실수형으로 바뀌면서 결과값이 소수점 튀어나옴
		System.out.println("결과값 = " + cutt);
		
		int cutt2 = value / 100 * 100;
		System.out.println("결과값2 = " + cutt2);
		
		int cutt3 = (int)(value * 0.01)	* 100;
		System.out.println("결과값3 = " + cutt3);
		

	}

}
