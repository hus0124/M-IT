/*
구조체 초기화
*/

#include <stdio.h>

struct point
{
	int xpos;
	int ypos;

} p1 = { 10, 20 };	//전역변수

struct person
{
	char name[20];
	char phone[20];
	int age;
};

int main_intia(void)
{
	struct point p2 = { 2, 4 };	//xpos = 2  ypos = 4
	
	struct person p3 = { "홍길동", "010-2222-3333", 24 };
	struct person p4 = { "이몽룡" };			// 순서대로 채워야 한다. 맨 앞만 채우고 비우면 나머지는 공백처리
												
	struct person p5 = p3; 

}