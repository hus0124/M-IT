#include <stdio.h>
int main_nnm(void)
{
	int num;
	printf("���ڸ� �Է��ϼ��� : ");
	scanf("%d", &num);
	int a = num / 100, b = (num%100)/10, c = num % 10;
	

	printf("   1�� �ڸ��� %d \n", c);

	printf("  10�� �ڸ��� %d \n", b);
	
	printf("100�� �ڸ��� %d \n", a);

	return 0;
}


