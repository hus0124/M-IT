/*
문제 23-2 [다양한 형태의 구조체 정의]
좌 상단의 x, y 좌표가 [0, 0], 우 하단의 x, y 좌표가 [100, 100]인 좌표평면상의 직사각형 정보를 표현하는 구조체 Rectangle을 정의하되, 
다음 구조체를 기반으로 정의해보자.

typedef struct point {
	int xpos;
	int ypos;
} Point;

그리고 Rectangle 구조체 변수를 인자로 전달받아서 해당 직사각형의 넓이를 계산해서 출력하는 함수와 
직사각형을 이루는 네 점의 좌표정보를 출력하는 함수를 각각 정의해보자. 
단 좌표평면상에서 직사각형을 표현하기 위해서 필요한 점의 갯수는 4개가 아닌 2개이니, 
직사각형을 의미하는 Rectangle 변수내에는 두 점의 정보만 존재해야 한다.

*/

#include <stdio.h>

typedef struct point
{
	int xpos, ypos;
}Point;

typedef struct rectangle
{
	Point tl;	// 왼쪽 상단 좌표
	Point dr;	// 오른쪽 하단 좌표
}Rectangle;

void area(Rectangle r)	// 변수 표시 r.dr.xpos 점으로 구분(.) 이게 만일 주소이면 (->) 로 구분
{
	int result;
	result = (r.dr.xpos - r.tl.xpos) * (r.dr.ypos - r.tl.ypos);
    printf("넓이 = %d\n\n", result);
}

void fourpoint(Rectangle r)
{
	printf("네 점의 좌표 정보(x, y)\n");
	printf("(%3d, %3d)\n", r.tl.xpos, r.tl.ypos);
	printf("(%3d, %3d)\n", r.dr.xpos - r.tl.xpos, r.tl.ypos);
	printf("(%3d, %3d)\n", r.tl.xpos, r.dr.ypos - r.tl.ypos);
	printf("(%3d, %3d)\n", r.dr.xpos, r.dr.ypos);
}

int main_prob232(void)
{   
	Point p1 = { 0, 0 };
	Point p2 = { 100, 100 };
	Rectangle r1 = { p1, p2 };	//p1이 tl , p2가 dr 된다
	
	area(r1);
	fourpoint(r1);

	return 0;
}


/*
#include <stdlib.h>  abs(num)
#include <math.h>   fabs(num)
*/