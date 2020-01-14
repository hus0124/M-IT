/*
출력 서식 
%8d : 8칸 확보 후 오른쪽 정렬
%-8d : 8칸 확보 후 왼쪽 정렬
%8.2f : 서수부 8자리 실수부 2자리 
%08d : 8칸 확보 후 0으로 채움
*/
#include <stdio.h>

int main_field(void)

{
	int num = 100;
	printf("%7d\t%-8d\t%06d\n", num, num, num);
	double d1 = 12.345678;
	printf("%4.2f\t, %-5.3f\n", d1, d1);

	int num2 = 10000000;
	printf("%5d\n", num2);

	for (int i = 0; i < 10; i++) {
		printf("2*%d=%4d\n", i, 2 * i);
	}
	return 0;

}