#include <stdio.h>

struct point
{
	int x;
	int y;
};

struct circle
{
	struct point center;
	double radius;
} c1;

struct circle2
{
	struct point* center;
	double radius;
} c2;

int main_nestedstruc(void)
{
	struct point p1 = { 10, 20 };
	c1.center.x = 30;
	c1.center.y = 40;
	c1.radius = 20.5;

	c2.radius = 5.0;
	c2.center = &p1;

	printf("중심점 좌표 : (%d, %d), 반지름 : %f\n", c1.center.x, c1.center.y, c1.radius);
	printf("중심점 좌표 : (%d, %d), 반지름 : %f\n", c2.center->x, c2.center->y, c2.radius);
	return 0;
}