/*
���� 2. �� ���� ������ �Է� �޾Ƽ� �� ���� ���� ����ϴ� ���α�
	���� �ۼ��� ����. �� ������ ū ������ ���� ���� �� �����
	����ؾ� �Ѵ�.
*/

#include <stdio.h>

int main_0812(void)
{
	int num1, num2;
	printf("�� ���� ������ �Է��ϼ��� : ");
	scanf("%d %d", &num1, &num2);

	if (num1 > num2)
	{
		printf("�� ������ �� = %d", num1 - num2);
	}
	else if (num1 < num2)
	{
		printf("�� ������ �� = %d", num2 - num1);
	}

	else printf("�� ������ �� = 0");
		
	return 0;
}