package dec18;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int[] userArr = new int[10];
		double sum = 0;
		Scanner scanner = new Scanner(System.in);
				
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + "ȸ �� : ������ �Է��ϼ��� = ");
			userArr[i] = scanner.nextInt();
			System.out.println();
		}
		
		for(int num: userArr) {
			sum+=num;
		}

		System.out.println(Arrays.toString(userArr));
		System.out.println("�Է°��� ��� = " + sum/10);
		scanner.close();
	}

}
