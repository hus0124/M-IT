/*
���� 23-2 [�پ��� ������ ����ü ����]
�� ����� x, y ��ǥ�� [0, 0], �� �ϴ��� x, y ��ǥ�� [100, 100]�� ��ǥ������ ���簢�� ������ ǥ���ϴ� ����ü Rectangle�� �����ϵ�, 
���� ����ü�� ������� �����غ���.

typedef struct point {
	int xpos;
	int ypos;
} Point;

�׸��� Rectangle ����ü ������ ���ڷ� ���޹޾Ƽ� �ش� ���簢���� ���̸� ����ؼ� ����ϴ� �Լ��� 
���簢���� �̷�� �� ���� ��ǥ������ ����ϴ� �Լ��� ���� �����غ���. 
�� ��ǥ���󿡼� ���簢���� ǥ���ϱ� ���ؼ� �ʿ��� ���� ������ 4���� �ƴ� 2���̴�, 
���簢���� �ǹ��ϴ� Rectangle ���������� �� ���� ������ �����ؾ� �Ѵ�.

*/

#include <stdio.h>

typedef struct point
{
	int xpos, ypos;
}Point;

typedef struct rectangle
{
	Point tl;	// ���� ��� ��ǥ
	Point dr;	// ������ �ϴ� ��ǥ
}Rectangle;

void area(Rectangle r)	// ���� ǥ�� r.dr.xpos ������ ����(.) �̰� ���� �ּ��̸� (->) �� ����
{
	int result;
	result = (r.dr.xpos - r.tl.xpos) * (r.dr.ypos - r.tl.ypos);
    printf("���� = %d\n\n", result);
}

void fourpoint(Rectangle r)
{
	printf("�� ���� ��ǥ ����(x, y)\n");
	printf("(%3d, %3d)\n", r.tl.xpos, r.tl.ypos);
	printf("(%3d, %3d)\n", r.dr.xpos - r.tl.xpos, r.tl.ypos);
	printf("(%3d, %3d)\n", r.tl.xpos, r.dr.ypos - r.tl.ypos);
	printf("(%3d, %3d)\n", r.dr.xpos, r.dr.ypos);
}

int main_prob232(void)
{   
	Point p1 = { 0, 0 };
	Point p2 = { 100, 100 };
	Rectangle r1 = { p1, p2 };	//p1�� tl , p2�� dr �ȴ�
	
	area(r1);
	fourpoint(r1);

	return 0;
}


/*
#include <stdlib.h>  abs(num)
#include <math.h>   fabs(num)
*/