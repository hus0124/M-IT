package prob21to30;

import java.util.Scanner;

public class Prob23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] age = new int[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("이름 : ");
			name[i] = scan.next();
			System.out.printf("나이 : ");
			age[i] = scan.nextInt();
		}
		
		scan.close();
		
		for(int i = 0; i < 3; i++) {
			System.out.println(name[i]+"\t"+age[i]);
		}
	}

}
