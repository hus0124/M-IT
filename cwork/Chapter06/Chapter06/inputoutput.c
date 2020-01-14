/*
데이터 출력과 입력에서 다른 차이를 보이는 서식 문자
float double long double 에서 각각 다르다
*/
// #pragma warning(disable:4996)   4996 에러 무시

#include <stdio.h>

int main_inout(void)
{
	int num;
	printf("10진수 정수 입력 : ");
	scanf("%d", &num);
	printf("%d\t%#o\t%#x\n", num,num,num);

	printf("8진수 정수 입력 : ");
	scanf("%o", &num);
	printf("%d\t%#o\t%#x\n", num, num, num);

	printf("16진수 정수 입력 : ");
	scanf("%x", &num);
	printf("%d\t%#o\t%#x\n", num, num, num);

	double d1;
	float f1;
	printf("float 형태 입력 : ");
	scanf("%f", &f1);
	printf("%f\n",f1);

	printf("double 형태 입력 : ");
	scanf("%lf", &d1);
	printf("%f\n", d1);

	printf("지수 형태 입력 : ");
	scanf("%lf", &d1);
	printf("%f\n", d1);

	return 0;

}