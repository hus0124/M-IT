#include <stdio.h>
int main_0741(void)
{
	int start, end;
	int sum = 0;

	printf("2���� ������ �Է��ϼ��� : ");
	scanf("%d %d", &start, &end);
		
	for (int i = start; i <= end; i++)
		sum += i;

		printf("�� = %d\n", sum);
	return 0;
}