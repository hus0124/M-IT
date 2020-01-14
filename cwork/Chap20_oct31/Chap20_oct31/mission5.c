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
		printf("컴퓨터는 바위 선택, ");
	else if (sel == 2)
		printf("컴퓨터는 가위 선택, ");
	else
		printf("컴퓨터는 보 선택, ");
	
	return sel;
}

int usersel(void)
{
	int sel;
	printf("바위는 1, 가위는 2, 보는 3: ");
	scanf("%d", &sel);
	
	if (sel == 1)
		printf("당신은 바위 선택, ");
	else if (sel == 2)
		printf("당신은 가위 선택, ");
	else
		printf("당신은 보 선택, ");

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
		   printf("이겼습니다!\n");
		   win++;
		}
			
		else if (whowin(user, com) == 0)
		{
		   printf("비겼습니다!\n");
		   draw++;
		}
		else
		{
			printf("당신이 졌습니다!\n");
			break;
		}
	}
	printf("게임의 결과 : %d승, %d무\n", win, draw);

	return 0;
}