/*
문제 2. 문제1에서는 포인터 변수 ptr에 저장된 값을 변경시키면서
	배열요소에 접근하라고 하였다. 그런데 이번에는 포인터 변수
	ptr에 저장된 값을 변경시키지 않고, ptr을 대상으로 덧셈연산
	을 하여, 그 결과를 반환하는 주소값을 통해서 모든 배열요소
	에 접근하여 값을 2씩 증가시키는 예제를 작성해보자.
*/

#include <stdio.h>

int main_1312(void)
{
	int arr[5] = { 1, 2, 3, 4, 5 };
	int* ptr = arr;
	for (int i = 0; i < 5; i++)
	{
		*(ptr + i) += 2;
	}
	for (int i = 0; i < 5; i++)
	{
		printf("arr[%d] = %d\n", i, arr[i]);
	}
	return 0;
}