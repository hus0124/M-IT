package study_chap04;

/*
 * /*Math.random() 메소드(함수)는, 
 * "0.0 이상에서 1.0 미만 (greater than or equal to 0.0 and less than 1.0)"의 double형 실수 값을 반환합니다. 
 * 즉, 0.0 은 나올 수 있지만 1.0 은 나올 수 없습니다.
 */
public class Exercise4_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true)
		{
			int i = rand();	
			int j = rand();
			
			System.out.println("(" + i + ", " + j + ")");
			
			if(i+j==5)
			{System.out.println("합계 5, 주사위 정지");
			break;
			}				
		}

	}

	private static int rand() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*6 +1);    // 0 이상 1미만 랜덤 실수-> 6배 0이상 ~ 6미만, +1 하면 1 이상 7 미만이 됨.
	}										
}
