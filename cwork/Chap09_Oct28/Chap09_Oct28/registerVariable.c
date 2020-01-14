/*
register ���� 
CPU ���� �����ϴ� �������� �߿� �ϳ��� ���
���� ����ӵ��� ���� �Լ��� �ʿ��� �� ����Ѵ�
*/

#include <stdio.h>

int accumulate(int n)
{
	register int sum = 0;		// register ����. �ӵ� ����. ���� ���� ���� ����.
								// ���� ���Ǵ� �Լ����� ���� ������ ������ �� �ʿ�.
	for (int i = 1; i <= n; i++)
		sum += i;
		return sum;
}

int main_register(void)
{
	// 1���� 10���� ���� ���Ѵٸ�
	int result = accumulate(10);
	printf("��� = %d\n", result);
	return 0;
}