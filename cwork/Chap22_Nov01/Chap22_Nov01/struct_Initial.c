/*
����ü �ʱ�ȭ
*/

#include <stdio.h>

struct point
{
	int xpos;
	int ypos;

} p1 = { 10, 20 };	//��������

struct person
{
	char name[20];
	char phone[20];
	int age;
};

int main_intia(void)
{
	struct point p2 = { 2, 4 };	//xpos = 2  ypos = 4
	
	struct person p3 = { "ȫ�浿", "010-2222-3333", 24 };
	struct person p4 = { "�̸���" };			// ������� ä���� �Ѵ�. �� �ո� ä��� ���� �������� ����ó��
												
	struct person p5 = p3; 

}