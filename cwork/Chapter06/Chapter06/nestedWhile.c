/*
��ø while ��

while(���ǽ�) { //�ٱ�
	while(���ǽ�) {// inner while
	}
	}

	������ : 2�� ~ 9��(�ݺ��� 1) Ƚ�� index = i
	�ش� �� 1~9��(�ݺ��� 2) Ƚ�� index = j
	*/

#include <stdio.h>

int main_nestedWhile(void)
{
	int i, j;	//Ƚ���� �ִ� �ݺ����� �ʿ�
	// 2~9�� �ݺ���

	i = 2;		//�ʱ�ġ
	while (i < 10)		// ���ǽ�, i <=9
	{
		printf("%d��\n", i);	// �� ������ ����� �ȴ�
		// �ش� ���� 1���� 9�� �ݺ��ؾ� �Ѵ�

		j = 1;	// �ʱ�ġ
		while (j < 10)		// ���ǽ�
		{// ������ ���, ��ø�� inner while ����
			printf("%d*%d=%2d\n", i, j, i * j);
			j++;			// ������
		}
		printf("\n");		//�ܰ� �� ������ ���� ���� ��ġ
		i++;		// ������
	}
	return 0;
}