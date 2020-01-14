/*
함수에서 매개변수, 반환형에 구조체를 사용하는 방법
반환형 함수 이름(매개변수)

기본 데이터 타입 : int, float -> 반환형, 매개변수 
구조체 : 반환형, 매개변수, 
*/

#include <stdio.h>

typedef struct
{
	int xpos;
	int ypos;
} Point;

Point getCoordinate()
{
	Point in;
	printf("좌표값 입력 (x, y): ");
	scanf("%d %d", &in.xpos, &in.ypos);
	return in;		// 반환형이 구조체 Point
}
void printCoordinate(const Point p)	//구조체 p의 값을 변경 금지
{
	printf("좌표값: (%d, %d)\n", p.xpos, p.ypos);
}

void getCoordi(Point* ptr)
{	
	printf("좌표값 입력 (x, y): ");
	scanf("%d %d", &ptr->xpos, &ptr->ypos);
}
int main_funcstruc(void)
{
	Point p;
	Point p1 = { 20, 30 };
	Point p2 = p1;	//구조체 대입은 한번에 멤버를 모두 대입(xpos, ypos)

	p = getCoordinate(); 
	printCoordinate(p);	//좌표값 출력

	getCoordi(&p);	// call by reference
	printCoordinate(p);	//좌표값 출력

	return 0;
}