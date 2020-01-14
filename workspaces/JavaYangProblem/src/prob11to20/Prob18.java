package prob11to20;

public class Prob18 {

	public static void main(String[] args) {
		
//		loop:
//		for(;;) {
			
			for(int i = 0; i < 5; i++) {
				
				for(int j = 1; j <= 2*i+1; j++) {
					System.out.printf("%d", j);
				}
				System.out.println();
			}
			
			for(int i = 0; i < 4; i++) {
				for(int j=1; j <= 7 - 2*i; j++) {
					System.out.printf("%d", j);
				}
				System.out.println();
//			}
//			break loop;
		}
	}

}
