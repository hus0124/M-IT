/*
��� ���� 
%8d : 8ĭ Ȯ�� �� ������ ����
%-8d : 8ĭ Ȯ�� �� ���� ����
%8.2f : ������ 8�ڸ� �Ǽ��� 2�ڸ� 
%08d : 8ĭ Ȯ�� �� 0���� ä��
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