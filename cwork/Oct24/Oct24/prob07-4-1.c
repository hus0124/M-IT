#include <stdio.h>
int main_0741(void)
{
	int start, end;
	int sum = 0;

	printf("2개의 정수를 입력하세요 : ");
	scanf("%d %d", &start, &end);
		
	for (int i = start; i <= end; i++)
		sum += i;

		printf("합 = %d\n", sum);
	return 0;
}