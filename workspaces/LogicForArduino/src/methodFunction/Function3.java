package methodFunction;

import java.util.Scanner;

public class Function3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = scan.nextInt();
		switch(oddevencheck(num)) {
		case 0:
			System.out.println("Ȧ��");
			break;
		case 1:
			System.out.println("¦��");
			break;
		}
		scan.close();
	}

	private static int oddevencheck(int num) {
		if(num%2!=0)
			return 0;
		else
			return 1;
	}

}
