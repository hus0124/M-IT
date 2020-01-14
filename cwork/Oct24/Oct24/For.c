/*
for (int i = 1; i <=10, i++)

초기식 증감식 꼭 써야 하는 것은 아니며 조건식 역시 안쓸 경우 무조건 참으로 무한반복 될 수 있다.
*/
#include <stdio.h>

int main_for(void)
{
	int i;
	int sum = 0;
	// 배열의 초기 주소가 0부터 시작. 그래서 보통 초기치를 0으로 시작
	for (i = 0; i < 11; i++)
	{   
		sum += i;
		
	}
	printf("%d\n", sum);
	return 0;
}