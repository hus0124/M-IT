#include <stdio.h>
int main_nnm(void)
{
	int num;
	printf("숫자를 입력하세요 : ");
	scanf("%d", &num);
	int a = num / 100, b = (num%100)/10, c = num % 10;
	

	printf("   1의 자리수 %d \n", c);

	printf("  10의 자리수 %d \n", b);
	
	printf("100의 자리수 %d \n", a);

	return 0;
}


