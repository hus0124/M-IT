#include <stdio.h>

int main_prob04_4(void)
{
	int num;
	printf("���� ���� �Է��ϼ��� : ");
	scanf("%d", &num);
	num = ~num + 1;
	printf("��� �� : %d\n\n", num);

	int num2;
	num2 = 3 << 3;			// �������� 3��Ʈ �̵�, 2^3=8�� ����
	num2 = num2 >> 2;		// ���������� 2��Ʈ �̵�, 2^2=4�� ����
	printf("3 * 8 / 4 = %d\n\n", num2);

	return 0;
}