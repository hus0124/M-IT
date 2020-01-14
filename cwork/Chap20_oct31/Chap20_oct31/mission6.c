/*
숫자 맞추기 게임

1. 세 개의 서로 다른 숫자 발생(0~9)
난수 발생, 중복 여부 검사, 배열[3]

2. 사용자에게 숫자 3개 입력 받고

3. 스트라이크 볼 판별
컴퓨터의 데이터 : 배열에 저장
사용자 데이터 : 배열에 저장, 반복 용이
스트라이크 볼 저장 변수

3스트라이크 게임 오버

4. 몇 번만에 맞추었는지 횟수 : 카운팅 변수
반복실행
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

	int value;	// 컴퓨터가 발생시킨 난수 임시 저장
	int i, j;
	printf("Start Game!\n");

	for (i = 0; i < 3; i++)	//3개 난수 발생
	{
		do
		{
			value = rand() % 10; // 난수를 10으로 나누면 0부터 9까지 나머지 생기는것 이용.
			for (j = 0; j < i; j++)
			{
				if (value == com[j])
					break;	// j < i : 같은 값이 존재, j = i : 새로운 값 
			}
		} while (j < i);
	}									// 중복 검사해야
	do
	{
		strike = 0;
		ball = 0;
		printf("3개의 숫자 선택 : ");
		scanf("%d %d %d", &user[0], &user[1], &user[2]);

		for (i = 0; i < 3; i++)		// 컴퓨터 숫자 반복
		{
			for (j = 0; j < 3; j++)	// 사용자 숫자 반복
			{
				if (com[i] == user[j])
				{
					if (i == j)
						strike++;
					else ball++;
				}
			}
        }
		printf("%d번째 도전 결과: %d strike, %d ball !!\n", count, strike, ball);
		count++;
	} while (strike != 3);

	printf("Game Over!");
	return 0;
}