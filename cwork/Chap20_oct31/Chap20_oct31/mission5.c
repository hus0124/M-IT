#include <stdio.h>
#include <stdlib.h>
#include <time.h>


void random(void)
{
	srand((int)time(NULL));
}

int comsel(void)
{
	int sel = rand() % 3 + 1;

	if (sel == 1)
		printf("��ǻ�ʹ� ���� ����, ");
	else if (sel == 2)
		printf("��ǻ�ʹ� ���� ����, ");
	else
		printf("��ǻ�ʹ� �� ����, ");
	
	return sel;
}

int usersel(void)
{
	int sel;
	printf("������ 1, ������ 2, ���� 3: ");
	scanf("%d", &sel);
	
	if (sel == 1)
		printf("����� ���� ����, ");
	else if (sel == 2)
		printf("����� ���� ����, ");
	else
		printf("����� �� ����, ");

	return sel;
}

int whowin(int n1, int n2)
{
	if (n1 == n2)
		return 0;
	else if ((n1 + 1) % 3 == n2 % 3)
		return 1;
	else
		return -1;
}

int main_miss5(void)
{
	random(); 

	int user, com;
	int win = 0, draw = 0;

	while (1)
	{
		user = usersel();
		com = comsel();

		if (whowin(user, com) == 1)
		{
		   printf("�̰���ϴ�!\n");
		   win++;
		}
			
		else if (whowin(user, com) == 0)
		{
		   printf("�����ϴ�!\n");
		   draw++;
		}
		else
		{
			printf("����� �����ϴ�!\n");
			break;
		}
	}
	printf("������ ��� : %d��, %d��\n", win, draw);

	return 0;
}