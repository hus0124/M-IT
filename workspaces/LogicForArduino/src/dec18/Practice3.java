package dec18;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score = scanner.nextInt();
		
		switch(switchscore(score)) {
		case 1:
			System.out.println("������ ������ A �Դϴ�");
			break;
		case 2:
			System.out.println("������ ������ B �Դϴ�");
			break;
		case 3:
			System.out.println("������ ������ C �Դϴ�");
			break;
		case 4:
			System.out.println("������ ������ D �Դϴ�");
			break;
		case 5:
			System.out.println("������ ������ F �Դϴ�");
			break;
		}

		scanner.close();

	}

	private static int switchscore(int a) {
		if(a>=90)
			return 1;
		else if(a>=80)
			return 2;
		else if(a>=70)
			return 3;
		else if(a>=60)
			return 4;
		else
			return 5;
	}

}
