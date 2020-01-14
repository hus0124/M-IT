#include <stdio.h>

int main_wtf(void)

{
	int A, B;
	printf("자연수 A 입력 :");
	scanf("%d", &A);
	printf("자연수 B 입력 :");
	scanf("%d", &B);

	printf("연산 결과\n\n");
	printf("덧셈 결과 : %d\n", A + B);
	printf("뺄셈 결과 : %d\n", A - B);
	printf("곱셈 결과 : %d\n", A * B);
	printf("나눔 결과 : %d\n", A / B);
	printf("나머지 : %d\n", A % B);

	return 0;

}