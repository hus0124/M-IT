package prob11to20;

public class Prob20 {

	public static void main(String[] args) {
		output(10,"#");

	}

	private static void output(int i, String string) {
		for(int j = 1; j <= i; j++) {
			System.out.printf("%s ", string);
		}
		
	}

}
