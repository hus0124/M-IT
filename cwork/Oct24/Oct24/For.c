/*
for (int i = 1; i <=10, i++)

�ʱ�� ������ �� ��� �ϴ� ���� �ƴϸ� ���ǽ� ���� �Ⱦ� ��� ������ ������ ���ѹݺ� �� �� �ִ�.
*/
#include <stdio.h>

int main_for(void)
{
	int i;
	int sum = 0;
	// �迭�� �ʱ� �ּҰ� 0���� ����. �׷��� ���� �ʱ�ġ�� 0���� ����
	for (i = 0; i < 11; i++)
	{   
		sum += i;
		
	}
	printf("%d\n", sum);
	return 0;
}