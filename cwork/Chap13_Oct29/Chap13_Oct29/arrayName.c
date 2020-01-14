/*
배열과 포인터
배열 : 일정한 크기의 데이터를 선언해서 사용
int arr[3] : 

배열의 이름 : 배열의 처음 요소의 주소를 나타낸다.
arr[i] : arr[0] ... arr[2]
arr[i]의 주소 : &arr[i]

배열과 포인터의 비교

배열의 이름 : 상수 (메모리를 점유하면 고정된 주소값을 가진다.)
              배열 이름은 변경 불가능

포인터 변수 : 변수(가리키는 대상을 변경 가능함)

공통점 : 배열이름과 포인터 변수는 주소를 가진다.
차이점 : 주소값 변경이 가능한가? -> 포인터 변수만 가능

*/

#include <stdio.h>

int main_arrayName(void)
{
	int arr[3] = { 0, 1, 2 };

	printf("arr = %p\n", arr);
	
	for (int i = 0; i < 3; i++)
	{
		printf("arr[%d] = %d, arr[i]의 주소 = %p\n", i, arr[i], &arr[i]);	// 배열에 직접 접근
	}
	
	int* parr = arr;	// 포인터 변수 : 배열 arr의 주소값을 저장한다. arr 자체가 주소라서 & 안 붙임.

	for (int i = 0; i < 3; i++)	// parr 값을 유지하면서 배열에 접근
	{
		printf("*(parr+ %d) = %d, parr + i = %p, parr = %p\n", i, *(parr + i), parr + i, parr);
	}
	
	// arr[i] : *(parr + i) 같은 표현, 서로 호환해서 사용할 수 있다.

	for (int i = 0; i < 3; i++)		// parr 값을 변경해 가면서 배열에 접근
	{
		printf("*parr = %d, parr = %p\n", *parr, parr);
		parr++;
	}
	// for 안쓰고 다른 법

	int* eptr = &arr[2];
	for (; parr <= eptr; parr++)		// parr 값을 변경해 가면서 배열에 접근
	{
		printf("*parr = %d, parr = %p\n", *parr, parr);
		parr++;
	}
	return 0;
}
