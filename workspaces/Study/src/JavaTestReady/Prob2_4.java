package JavaTestReady;
/*
 * 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 프로그램을 작성하시오. 
 * 단, x와 y는 0보다 크거나 같은 자연수 입니다. (10점)
 */
public class Prob2_4 {

	public static void main(String[] args) {
				
		for(int i=0; i <= 60/4 ; i++){
			for(int j=0; j <= 60/5 ; j++){
				if((4*i + 5*j) == 60){
					System.out.println("(" + i + "," + j + ")");
					
				}
			}

		}
	}
}
