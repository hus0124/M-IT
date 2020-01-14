/*
static ���� : ������ �Ǵ� ���ϳ����� �����ϴ� ����
*/

#include <stdio.h>

static int total = 0;			// static ����


int add(int num)
{
	printf("total = %d\n", total);	// ���ϳ������� ���� ����. ���� �ۿ��� �Ұ���.
	static int sum = 0;			//static ����
								// ó���� �Լ� add�� ȣ��ɶ��� ����ǰ� �� ������ ȣ��� ���� ������� �ʰ� ���� ������
	printf("sum = %d\tnum = %d\n", sum, num);
	sum += num;
	return sum;
}

void sub()
{
	// int var3 = sum + 60;		// static ���� sum�� add �Լ������� ������ �����ϴ�. sub �Լ������� ���� �Ұ���.
}

int main_static(void)
{
	int i;
	int result;

	for (i = 1; i <= 10; i++)
	{
		result = add(i);
		sub();
	}
	printf("sum = %d\n", result);
	// print("sum = %d\n", sum);		// static ���� sum�� add �Լ������� ���� ����. �׷��� �� �ܿ��� ���� �Ұ�. 
	
	return 0;
}