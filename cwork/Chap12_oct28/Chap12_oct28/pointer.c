/*
포인터 변수

데이터 타입 : 값을 저장하는 변수
포인터변수 : 주소 저장하는 변수
*/

#include <stdio.h>

int main(void)
{
	int num = 10;		//값을 저장하는 변수
	int* pnum = &num;		// 포인터 변수 : 주소 저장( num 변수의 주소)
	int * p1 = &num;
	int *p2 = &num;			//3가지 방법 가능한데 int* pnum 이렇게 쓰는 걸 권장

	double d1 = 2.45;
	double* dptr = &d1;

	printf("num = %d\n", num);
	printf("num = %d\n", *pnum);		// 포인터 변수 pnum 이 가리키는 곳의 내용.
	
	printf("d1 = %f\n", d1);			// 주소 사용할 때에도 데이터 타입 주의. 맞춰서 입출력 해야한다.
	printf("dptr = %f\n", *dptr);

	dptr = &num;	//서로 다른 유형이면 에러가 난다. 같은 유형을 사용해야 한다.

	return 0;

}