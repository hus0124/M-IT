#include <stdio.h>

int main_prob04_4(void)
{
	int num;
	printf("정수 값을 입력하세요 : ");
	scanf("%d", &num);
	num = ~num + 1;
	printf("출력 값 : %d\n\n", num);

	int num2;
	num2 = 3 << 3;			// 왼쪽으로 3비트 이동, 2^3=8배 증가
	num2 = num2 >> 2;		// 오른쪽으로 2비트 이동, 2^2=4배 감소
	printf("3 * 8 / 4 = %d\n\n", num2);

	return 0;
}