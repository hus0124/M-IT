/*
�ݺ����� ����(continue) �� Ż��(braek)

break :	� ������ �����ϸ� ���� ����� �ݺ��� �ϳ� Ż��

continue : ���� �����ϸ� �Ʒ��� ���� �ƴ϶� ���� ���ǹ����� ���ư�

Ư�� ���ǽ��� ���� �˼� ���� ��� for �� �� ���ϱ� �ݺ��غ��� �� �� ����
*/

#include <stdio.h>

int main_break(void)
{
	int num = 0;
	int sum = 0;

	while(1)		//���� ã�� ������ ���ѹݺ�
	{
		sum += num;

		if (sum > 5000)
		{
			break;  // if sum >5000 ���ǹ� ����
		}
		
		num++;

	}
	printf("�� : %d\n", sum);
	printf("num : %d\n", num);
	return 0;
}
