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
		System.out.printf("������ : %.2f", result);
	}

	private static void mul(int i, int j) {
		int result = i * j;
		System.out.println("���ϱ� : " + result);
		
	}

	private static void sub(int i, int j) {
		int result = i - j;
		System.out.println("��  �� : " + result);
		
	}

	private static void sum(int i, int j) {
		int result = i + j;
		System.out.println("���ϱ� : " + result);
		
	}

}
