/*
���� ���߱� ����

1. �� ���� ���� �ٸ� ���� �߻�(0~9)
���� �߻�, �ߺ� ���� �˻�, �迭[3]

2. ����ڿ��� ���� 3�� �Է� �ް�

3. ��Ʈ����ũ �� �Ǻ�
��ǻ���� ������ : �迭�� ����
����� ������ : �迭�� ����, �ݺ� ����
��Ʈ����ũ �� ���� ����

3��Ʈ����ũ ���� ����

4. �� ������ ���߾����� Ƚ�� : ī���� ����
�ݺ�����
*/

#include <stdio.h>
#include <stdlib.h>	//srand, rand
#include <time.h> // time 

void random(void)
{
	srand((int)time(NULL));
}


int main_miss6(void)
{
	random();

	int arr[10] = { 0,1,2,3,4,5,6,7,8,9 };

	int com[3];
	int user[3];
	int strike, ball;
	int count = 1;

	int value;	// ��ǻ�Ͱ� �߻���Ų ���� �ӽ� ����
	int i, j;
	printf("Start Game!\n");

	for (i = 0; i < 3; i++)	//3�� ���� �߻�
	{
		do
		{
			value = rand() % 10; // ������ 10���� ������ 0���� 9���� ������ ����°� �̿�.
			for (j = 0; j < i; j++)
			{
				if (value == com[j])
					break;	// j < i : ���� ���� ����, j = i : ���ο� �� 
			}
		} while (j < i);
	}									// �ߺ� �˻��ؾ�
	do
	{
		strike = 0;
		ball = 0;
		printf("3���� ���� ���� : ");
		scanf("%d %d %d", &user[0], &user[1], &user[2]);

		for (i = 0; i < 3; i++)		// ��ǻ�� ���� �ݺ�
		{
			for (j = 0; j < 3; j++)	// ����� ���� �ݺ�
			{
				if (com[i] == user[j])
				{
					if (i == j)
						strike++;
					else ball++;
				}
			}
        }
		printf("%d��° ���� ���: %d strike, %d ball !!\n", count, strike, ball);
		count++;
	} while (strike != 3);

	printf("Game Over!");
	return 0;
}