/*
����ü �迭�� ������
�⺻ ������ Ÿ�� : ������ �Ǽ���
�迭 : int arr[10];
������ : int* ptr = &num;

����ü
struct point p[10];               ����ü �迭
struct point* pptr = &p[0];       ����ü ������

*/

#include <stdio.h>

struct point
{
	int xpos;
	int ypos;
};

int main_arraypoint(void)
{
	struct point p[2] = { 2, 4, 6, 8 } ;
	struct point* ptr = p;

	printf("p[0] (%d, %d)\n", p[0].xpos, p[0].ypos);		//������ ����� ����
	printf("p[0] (%d, %d)\n",(*ptr).xpos, (*ptr).ypos);
	printf("p[1] (%d, %d)\n", (ptr + 1)->xpos, (ptr + 1)->ypos);	//�����͸� ����ؼ� ����� ���� [ -> ] ��ȣ ���

	return 0;
}