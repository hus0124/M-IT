package methodFunction;

import java.util.Scanner;

public class Function1 {

	public static void main(String[] args) {
		//n부터 m까지 더해서 출력.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 정수 n : ");
		int n = scan.nextInt();
		System.out.print("두 번째 정수 m : ");
		int m = scan.nextInt();
		
		int value = add(n,m);
		System.out.println(value);
		scan.close();
	}

	static int add (int n, int m) {
		int sum = 0;
		if(n > m) {
			for(int i = m; i <= n; i++) {
			sum += i;
			}
		}
		else if(n < m) {
			for(int i = n; i <= m; i++) {
				sum += i;
			}
		}
		else
			sum = 2*n;
		return sum;
	}
}
