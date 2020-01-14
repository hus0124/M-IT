package JavaTestReady;
/*
 * while문과 Math.random() 매소드를 이용하여 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 
 * 눈의 합이 6이 아니면 계속 주사위를 던지고, 눈의 합이 6이면 실행을 멈추는 코드를 작성하시오. 
 * 눈의 합이 6이 되는 조합은 (1, 5), (2, 4), (3, 3), (4, 2), (5, 1) 입니다.
 */
public class Prob2_5 {

	public static void main(String[] args) {
		boolean run = true;
		
		while(run){
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if((num1 + num2)==6){
				run=false;
			}
		}

	}

}
