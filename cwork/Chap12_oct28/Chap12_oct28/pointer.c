/*
������ ����

������ Ÿ�� : ���� �����ϴ� ����
�����ͺ��� : �ּ� �����ϴ� ����
*/

#include <stdio.h>

int main(void)
{
	int num = 10;		//���� �����ϴ� ����
	int* pnum = &num;		// ������ ���� : �ּ� ����( num ������ �ּ�)
	int * p1 = &num;
	int *p2 = &num;			//3���� ��� �����ѵ� int* pnum �̷��� ���� �� ����

	double d1 = 2.45;
	double* dptr = &d1;

	printf("num = %d\n", num);
	printf("num = %d\n", *pnum);		// ������ ���� pnum �� ����Ű�� ���� ����.
	
	printf("d1 = %f\n", d1);			// �ּ� ����� ������ ������ Ÿ�� ����. ���缭 ����� �ؾ��Ѵ�.
	printf("dptr = %f\n", *dptr);

	dptr = &num;	//���� �ٸ� �����̸� ������ ����. ���� ������ ����ؾ� �Ѵ�.

	return 0;

}