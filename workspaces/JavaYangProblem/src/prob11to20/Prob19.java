package prob11to20;

public class Prob19 {

	public static void main(String[] args) {
		
		sum(3,5);
		sub(7,2);
		mul(4,5);
		div(7,3);

	}

	private static void div(int i, int j) {
		float result = (float)i/j;
		System.out.printf("나누기 : %.2f", result);
	}

	private static void mul(int i, int j) {
		int result = i * j;
		System.out.println("곱하기 : " + result);
		
	}

	private static void sub(int i, int j) {
		int result = i - j;
		System.out.println("빼  기 : " + result);
		
	}

	private static void sum(int i, int j) {
		int result = i + j;
		System.out.println("더하기 : " + result);
		
	}

}
