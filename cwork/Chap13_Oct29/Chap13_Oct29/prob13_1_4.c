/*
문제 4. 길이가 6인 int형 배열 arr을 선언하고 이를 1, 2, 3, 4,
	5, 6으로 초기화한 다음, 배열에 저장된 값의 순서가 6, 5, 4,
	3, 2, 1이 되도록 변경하는 예제를 작성해보자. 단 배열의 앞
	과 뒤를 가리키는 포인터 변수 2개를 선언해서 이를 활용하여
	저장된 값의 순서를 바꿔야 한다.
*/

#include <stdio.h>

int main_1314(void)
{
	int arr[6] = { 1,2,3,4,5,6 };		// array 0부터 시작해서 5까지
	int* sptr = arr;					// 1값
	int* eptr = &arr[5];				// 6값
	
	for (int i = 0; i < 6 / 2; i++)
	{
		int tmp = *sptr;		// tmp에 1 들어감   
		*sptr++ = *eptr;	    // *sptr = 6     ++  -- 는 왼쪽에 있어야 한다. 그래야 순서대로 증가/감소하며 포인트 위치 바뀜
		*eptr-- = tmp;			// *eptr = 1
	}
	for (int i = 0; i < 6; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
	return 0;
}