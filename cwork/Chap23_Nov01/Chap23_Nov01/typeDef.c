/*
typedef : 사용자가 정의한 데이터 유형
*/

#include <stdio.h>
typedef int INT;
typedef unsigned int uint;
typedef int* PINT;

typedef struct point
{
	int xpos;
	int ypos;
} Point;

typedef struct circle  // 이름 circle 생략가능
{
	Point center; 
	double radius;
} Circle;

typedef struct
{
	Point* center;
	double radius;
} Circle2;

typedef struct
{
	Point tl;
	Point br;

} Rectangle;

int main_typedef(void)
{
	INT num;
	uint var1;
	PINT ptr = &num;
	Point p1;
	Circle c1;

	p1.xpos = 10;
	p1.ypos = 10;

	c1.center.xpos = 30;
	c1.center.ypos = 40;
	c1.radius = 30.0;

	return 0;
}