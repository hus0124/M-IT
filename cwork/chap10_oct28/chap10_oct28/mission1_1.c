/*
도전 1. 10진수 정수를 입력 받아서 16진수로 출력하는 프로그램을
	작성해 보자.
	(서식문자를 활용)

	%d : 정수형(10진수)
	%x : 16진수
	%o : 8진수
	2진수 : 16진수로 변환하면 4bit
*/

#include <stdio.h>

int main_mission1(void)

{
	int n;
	printf("10진수 정수를 입력하세요 : ");
	scanf("%d", &n);

	printf("0x%x\n", n);	// 16진수 0x 표현까지

	return 0;
}