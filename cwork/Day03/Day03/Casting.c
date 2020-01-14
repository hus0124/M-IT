/*
자동형변환 : 대입 과정에서 좌변 우변이 다를 경우 자동적으로 발동
*/

#include <stdio.h>

int main_casting(void)
{
	int num = 10;
	double d1 = 20;		// 우변은 int 좌변은 double 이므로 더블로 자동형변환 (큰 쪽으로 변환, 오차 있으나 작동은 가능)
	printf("d1=%f\n", d1);

	int a = 3.14;		// 우변은 double 좌변은 int 이므로 소수점이하 손실
	printf("%d\n", a);
	int b = 5 / 2;		// 2.5인데 int 로 형변환되면 2.5가 아니라 2로 나옴. 정수 / 정수 = 정수 나와버림.
	int c = (double)5 / 2;	//	강제타입변환 (double). 결과값은 더블로 2.5 그러나 좌변이 int라서 2...
    printf("%f\n", (double)5 / 2);
	printf("c=%d\n", c);



	return 0;

}