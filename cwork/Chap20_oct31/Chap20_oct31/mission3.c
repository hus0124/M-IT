/*
난수 발생 방법
int rand(); 0~최대수(RAND_MAX:32267) 중에서 사이의 수 중에 임의의 수를 발생시킨다. short (16bit) 양수

void srand
*/

#include <stdio.h>
#include <stdlib.h>	// rand() 함수 포함하는 라이브러리

int main_miss3(void)
{
	srand((int)time(NULL));

	printf("0~%d 사이의 수 발생\n", RAND_MAX);
	for (int i = 0; i < 5; i++)
		printf("%d\n", rand());
	return 0;
	

	

}

