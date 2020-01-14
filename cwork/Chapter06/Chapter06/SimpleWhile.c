/*
반복문 : 웬만하면 중괄호 습관 들이기 
		 실행문은 탭으로 들여쓰기
파이썬의 경우 반복문이 중괄호가 없고 4칸 이상 들여쓰기 해야 함

for 문
for(i=0; i<8; i++)
   (초기치; 조건; 증감식)
*/

#include <stdio.h>

int main_simplewhile(void)
{
	int num = 0;
	while (num < 5)
	{
		printf("Hello World! %d\n", num);
		num++;

	}
	return 0;
}