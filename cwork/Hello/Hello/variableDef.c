#include <stdio.h>

int main_variableDef(void)
{
	int var1 = 1;	// ���� ����� �Բ� �ʱ�ȭ
	int var2;		// ���� ���� ��
	var2 = 20;		// � �������� ����� �� �ʱⰪ�� �Ҵ�
	int var3 = var2 + 30;
	int sum = var3 + var1;

	printf("��� = %d\n", sum);
	return  0;
}
