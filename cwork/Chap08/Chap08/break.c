/*
반복문의 생략(continue) 과 탈출(braek)

break :	어떤 조건을 만족하면 가장 가까운 반복문 하나 탈출

continue : 조건 만족하면 아래쪽 실행 아니라 위에 조건문으로 돌아감

특정 조건식을 내가 알수 없는 경우 for 를 못 쓰니까 반복해봐야 할 때 쓴다
*/

#include <stdio.h>

int main_break(void)
{
	int num = 0;
	int sum = 0;

	while(1)		//조건 찾을 때까지 무한반복
	{
		sum += num;

		if (sum > 5000)
		{
			break;  // if sum >5000 조건문 종료
		}
		
		num++;

	}
	printf("합 : %d\n", sum);
	printf("num : %d\n", num);
	return 0;
}
