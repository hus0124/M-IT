package dec18;

public class nestedForPractice {

	public static void main(String[] args) {
		// 주사위 두 개 던져서 7이 되는 경우의 수를 모두 출력하시오.
		// 출력 예 : 주사위 1,6 2,5 등
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if((i+j)==7)
					System.out.print("(" + i + ", " + j + ")");
			}
		}

		
	}

}
