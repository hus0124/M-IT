/*
배열과 포인터
*/

#include <stdio.h>

int main_arpt(void)
{
	int num = 10;					// 변수
	int* ptr = &num;				// 포인터 변수
	printf("num = %d\n", num);		// 변수 num 을 사용해서 출력
	printf("num = %d\n", *ptr);		// 포인터 변수를 통해서 num 을 출력
	 // *ptr : 포인터 변수 ptr에 저장된 주소가 가리키는 변수의 내용
	 // ptr : 포인터 변수의 값. 또 변수 num의 주소

	int arr[4] = { 5, 10, 15, 20 };
	for (int i = 0; i < 4; i++)
	{
		printf("arr[%d]의 값 : %d,  &arr[%d] = %p\n", i, arr[i], i, &arr[i]);
		// arr[i] : 배열 arr의 i번째 값
		// &arr[i] : 배열 arr의 i번째 값의 주소
		
	}
	// 포인터 변수를 사용해서 접근하기
	int* parr = arr;			// arr 자체가 배열의 주소. & 기호 붙일 필요 없다.
	int* p2 = &arr[0];			// arr = arr[0] 같은 값 가진다.
	for (int i = 0; i < 4; i++)
	{
		printf("*(parr + %d)의 값 : %d, parr + %d = %p\n", i, *(parr + i), i, parr + i);
	}
	 // arr[i] 와 *(parr + i) 는 같은 값, 같은 표현.
	 // &arr[i] = parr + i
	return 0;
}