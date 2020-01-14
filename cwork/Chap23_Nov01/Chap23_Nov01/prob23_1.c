/*
���� 23-1 [����ü ������ ����]
���� ����ü�� �� ������ ������� ����� ���� ���� �ٲپ��ִ� �Լ��� �����ϰ� �̸� ȣ���ϴ� ������ �ۼ��غ���.

typedef struct point {
	int xpos;
	int ypos;
} Point;

���� �� ������ ���� �� ���� ����ü ������ ����� ���¿���
	Point pos1 = { 2, 4 };	-> { 5, 7 }
	Point pos2 = { 5, 7 };	-> { 2, 4 }

�� �� ����ü ������ �������, Ȥ�� �� ����ü ������ �ּ� ���� ������� SwapPoint��� �̸��� �Լ��� ȣ���ϸ� 
pos1�� xpos, ypos���� ���� 5�� 7��, �׸��� pos2�� xpos, ypos���� ���� 2�� 4�� ����Ǿ�� �Ѵ�.

// call by value
// call by reference

*/

#include <stdio.h>

typedef struct point
{
	int xpos;
	int ypos;
} Point ;

void SwapPoint(Point* p1, Point* p2)
{
	printf("\n\n");
	printf("ȣ�� �� pos1�� ��ǥ : (%d , %d)\n", p1->xpos, p1->ypos);
	printf("ȣ�� �� pos2�� ��ǥ : (%d , %d)\n", p2->xpos, p2->ypos);

	Point tmp = *p1;
	*p1 = *p2;
	*p2 = tmp;

	printf("\n\n");
	printf("ȣ�� �� pos1�� ��ǥ : (%d , %d)\n", p1->xpos, p1->ypos);
	printf("ȣ�� �� pos2�� ��ǥ : (%d , %d)\n", p2->xpos, p2->ypos);
}

int main_chap231(void)
{
	Point pos1 = { 2, 4 };
	Point pos2 = { 5, 7 };

	printf("ȣ�� �� pos1�� ��ǥ : (%d , %d)\n", pos1.xpos, pos1.ypos);
	printf("ȣ�� �� pos2�� ��ǥ : (%d , %d)\n", pos2.xpos, pos2.ypos);
	
	// SwapPoint(pos1, pos2); �̷��� call by value �� ������ ���� �� �ٲ��.

	SwapPoint(&pos1, &pos2);	// call by reference �ּҰ����� ȣ��. ���� �ٲ� �� �ִ�.
	printf("\n\n");
	printf("ȣ�� �� pos1�� ��ǥ : (%d , %d)\n", pos1.xpos, pos1.ypos);
	printf("ȣ�� �� pos2�� ��ǥ : (%d , %d)\n", pos2.xpos, pos2.ypos);
	return 0;
}