package LineageSword;

import java.util.Random;
import java.util.Scanner;

public class Lineage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		boolean run1 = true;
		int count=0;
		int swordlevel=0;
		int drng = 1;
		System.out.println("**********집행검 뽑기**********");
		System.out.println("1번부터 20번까지 20개의 박스 중 하나를 선택하세요");
		
		while(run) {
		System.out.print("몇 번 상자를 선택하시겠습니까? : ");
		
		int boxnum = scanner.nextInt();
		
		SwordBox sbox = new SwordBox();
		
			switch(sbox.swordbox(boxnum)) {
			case 0:
				run=false;
				break;
			case 1:
				System.out.println("계속 시도합시다");
				break;
			}
		}	// 여기 루프 빠져나온다는 건 집행검 뽑는다는 뜻	

		while(run1) {
			
		System.out.print("집행검을 강화하시겠습니까? y/n : ");
		String schoice = scanner.nextLine();
			if(schoice.equals("n")) {
				System.out.println("강화를 종료합니다.");
				run1=false;
			}
			if(schoice.equals("y")) {
				System.out.println("강화를 시작합니다.");
				
				Random random = new Random();
				
				int comcom = random.nextInt(2*drng);
				if(count==comcom) {
					System.out.println("강화성공");
					swordlevel++;
					drng*=2;
					System.out.println("집행검 레벨 : " + swordlevel);
					
				}
				else {
					System.out.println("강화실패");
					run1=false;
				}
			}
				
			
		}	// 강화 블럭
		
	}
		
}


