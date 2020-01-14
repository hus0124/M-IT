package study.chap05_Nov06;

import java.util.Scanner;

public class chap5_Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;	// 아직 값 안들어가고 null로 초기화.
		Scanner scanner = new Scanner(System.in);		// 문자열, 숫자 다 가능. 이름은 scanner 말고도 가능은 한데 안 헷갈리게...
				
		while(run)
		{			
			System.out.println("--------------------------------------");
			System.out.println("1.학생수 |2.점수입력  |3.점수리스트 |4.분석 |5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
						
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1)
			{
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];		// null로 설정된 배열 scores를 studentNum만큼 크기 초기화하여 메모리 할당.
				
			}
			else if(selectNo == 2)
			{
				for (int i = 0; i < studentNum; i++)
				{
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt();	// 배열 scores 는 초기화되었기 때문에 사용가능. 입력받을 수 있다. 위에서 먼저 설정해줘야 한다.
				}
			}
			else if(selectNo == 3)
			{
				for (int i = 0; i < studentNum; i++)
				{					
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			}
			else if(selectNo == 4)
			{
				int sum = 0;
				int max = 0;
				for (int i = 0; i < studentNum; i++)
				{					
					if (max < scores[i])
					{
						max = scores[i];
					}
				sum = sum + scores[i];					
				}
				double avg = (double)sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			}
			else if(selectNo == 5)
			{
				run = false;	//boolean run = true, while(run)였던 걸 false로 해서 반복문 종료
			}
		}

		System.out.println("프로그램 종료");
	}

}
