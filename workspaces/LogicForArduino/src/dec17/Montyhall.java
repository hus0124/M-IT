package dec17;

import java.util.Random;

public class Montyhall {

	public static void main(String[] args) {
		Random ran = new Random();
		double normalcount=0;
		double changecount=0;
		int game = 0;	// 항상 0번 선택으로 고정.
		int loop = 10000000;	//1000만번
		
		for(int i=0; i<loop; i++) {
			int montyhall = ran.nextInt(3);	// 0 1 2 중 하나 상품
			if(game==montyhall)
				normalcount++;
		}
		
		System.out.println("안 바꿨을 때 확률 : " + (normalcount/loop)*100 + "%");
				
		for(int i=0; i<loop; i++) {
			int montyhall = ran.nextInt(3);	// 0 1 2 중 하나 상품
			if(montyhall==0) 
				game = ran.nextInt(2)+1; // 1 또는 2 를 열어주면 나머지 하나 선택
			if(montyhall==1)
				game = 1;	// 1번은 안 열어주고 2를 열어줌. 1로 바꿈.
			if(montyhall==2)
				game = 2;	// 2번은 안 열어주고 1을 열어줌. 2로 바꿈.
			if(game==montyhall)
				changecount++;
		}
		
		System.out.println("바꿨을 때 확률 : " + (changecount/loop)*100 + "%");
		
	}
	
}
