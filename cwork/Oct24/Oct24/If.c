/* ���ǹ� : 
1. if, else if, else

2. switch ��

if(����){ ���� ���� �� ���೻�� }
���� �Ҹ��� �� ���α׷��� if ���� �ǳʶٰ� ��������

*/

#include <stdio.h>

int main_if(void)
{
	/*int num;
	printf("�����Է� : ");
	scanf("%d", &num);

	if (num < 0)
		printf("�Է� ���� 0���� �۴�.\n");
	else if (num > 0)
		printf("�Է� ���� 0���� ũ��.\n");
	else 
		printf("�Է� ���� 0�̴�\n"); */

	int i;
		
	for (i = 0; i < 31; i++)
	{
		if (i % 3 == 0 && i % 5 == 0) // 15�� ���
		{
			printf("%d(15)\n", i);
		}
		else if (i % 3 == 0)		// else if�� 15�� ����� �ƴ� 3�� ��� (15�� ����� ù ��° ���ǿ� ��). ���ԵǱ� ���ϸ� �׳� if
		{
			printf("%d(3)\n",i);
		}
	}
	printf("\n\n");
	
	for (i = 0; i < 31; i++)
	{
		if (i % 3 == 0 && i % 5 == 0) // 15�� ���
		{
			printf("%d(15)\n", i);
		}
		if (i % 3 == 0)		// 3�� ���. 15 ����� ���Ե�. �׳� if�ϱ�
		{
			printf("%d(3)\n", i);
		}
	}
	return 0;
}
