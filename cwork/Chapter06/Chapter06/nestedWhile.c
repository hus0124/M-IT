/*
중첩 while 문

while(조건식) { //바깥
	while(조건식) {// inner while
	}
	}

	구구단 : 2단 ~ 9단(반복문 1) 횟수 index = i
	해당 단 1~9단(반복문 2) 횟수 index = j
	*/

#include <stdio.h>

int main_nestedWhile(void)
{
	int i, j;	//횟수가 있는 반복문에 필요
	// 2~9단 반복문

	i = 2;		//초기치
	while (i < 10)		// 조건식, i <=9
	{
		printf("%d단\n", i);	// 몇 단인지 출력이 된다
		// 해당 단의 1부터 9를 반복해야 한다

		j = 1;	// 초기치
		while (j < 10)		// 조건식
		{// 구구단 출력, 중첩된 inner while 내부
			printf("%d*%d=%2d\n", i, j, i * j);
			j++;			// 증감식
		}
		printf("\n");		//단과 단 사이의 여유 공간 배치
		i++;		// 증감식
	}
	return 0;
}