/* ���� 2. ���α׷� ����ڷκ��� �� ���� ������ �Է� �޾Ƽ� ����
    ���� ����ϴ� ���α׷��� �ۼ��� ����.
    ���� ���,	2, 5�� �Է� ������ 2��~5�ܱ��� ���
		6, 3�� �Է� ������ 3��~6�ܱ��� ���
*/

#include <stdio.h>

int main_mission2(void)
{
	int num1, num2;
	printf("�� ���� ������ �Է� �ϼ��� : ");
	scanf("%d %d", &num1, &num2);

	if (num1 > num2)
	{
		for (int i = num2; i <= num1; i++)
		{
			printf("%d��\n", i);
			for (int j = 1; j < 10; j++)
			{
				printf("%d * %d = %2d\n", i, j, i * j);
			}
			printf("\n");
		}
	}
	else
	{
		for (int i = num1; i <= num2; i++)
		{
			printf("%d��\n", i);
			for (int j = 1; j < 10; j++)
			{
			printf("%d * %d = %2d\n", i, j, i * j);
			}
			printf("\n");
		}
	}
	return 0;
}
