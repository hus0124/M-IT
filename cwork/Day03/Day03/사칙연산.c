#include <stdio.h>

int main_wtf(void)

{
	int A, B;
	printf("�ڿ��� A �Է� :");
	scanf("%d", &A);
	printf("�ڿ��� B �Է� :");
	scanf("%d", &B);

	printf("���� ���\n\n");
	printf("���� ��� : %d\n", A + B);
	printf("���� ��� : %d\n", A - B);
	printf("���� ��� : %d\n", A * B);
	printf("���� ��� : %d\n", A / B);
	printf("������ : %d\n", A % B);

	return 0;

}