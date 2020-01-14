#include <stdio.h>

void swap3(int** dpa, int** dpb)
{
	printf("호출 실행전 : *pa = %p, *pb = %p\n", *dpa, *dpb);

	int* tmp = *dpa;
	*dpa = *dpb;
	*dpb = tmp;
	
	printf("호출 실행후 : *pa = %p, *pb = %p\n", *dpa, *dpb);
}

int main_doublepoint(void)
{
	int a = 10, b = 20;
	int* pa = &a;
	int* pb = &b;

	

	printf("실행전 : *pa = %d, *pb = %d\n", *pa, *pb);
	printf("pa=%p, pb = %p\n", pa, pb);
	swap3(&pa, &pb);	//포인터 변수의 포인터 주소. 즉 더블 포인터가 된다.

	printf("실행후 : *pa = %d, *pb = %d\n", *pa, *pb);
	printf("pa=%p, pb = %p\n", pa, pb);
	return 0;
}