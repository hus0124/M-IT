package dec18;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		switch(switchscore(score)) {
		case 1:
			System.out.println("귀하의 성적은 A 입니다");
			break;
		case 2:
			System.out.println("귀하의 성적은 B 입니다");
			break;
		case 3:
			System.out.println("귀하의 성적은 C 입니다");
			break;
		case 4:
			System.out.println("귀하의 성적은 D 입니다");
			break;
		case 5:
			System.out.println("귀하의 성적은 F 입니다");
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
