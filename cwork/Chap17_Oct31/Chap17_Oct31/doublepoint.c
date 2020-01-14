#include <stdio.h>

void swap3(int** dpa, int** dpb)
{
	printf("ȣ�� ������ : *pa = %p, *pb = %p\n", *dpa, *dpb);

	int* tmp = *dpa;
	*dpa = *dpb;
	*dpb = tmp;
	
	printf("ȣ�� ������ : *pa = %p, *pb = %p\n", *dpa, *dpb);
}

int main_doublepoint(void)
{
	int a = 10, b = 20;
	int* pa = &a;
	int* pb = &b;

	

	printf("������ : *pa = %d, *pb = %d\n", *pa, *pb);
	printf("pa=%p, pb = %p\n", pa, pb);
	swap3(&pa, &pb);	//������ ������ ������ �ּ�. �� ���� �����Ͱ� �ȴ�.

	printf("������ : *pa = %d, *pb = %d\n", *pa, *pb);
	printf("pa=%p, pb = %p\n", pa, pb);
	return 0;
}