/*
문제 17-1 [이중 포인터 변수의 활용]
다음과 같이 두 개의 int형 포인터 변수와 길이가 5인 int형 배열을
선언한다.
	int * maxPtr;
	int * minPtr;
	int arr[5];

그리고 MaxAndMin이란 이름의 함수를 정의하고 이를 호출하면서 위
의 배열과 두 포인터 변수에 대한 정보를 전달하자. 어떠한 정보를
어떻게 전달할지는 여러분이 결정할 몫이다. 그리고 함수 호출이
완료되면, 포인터 변수 maxPtr에는 가장 큰 값이 저장된 배열요소의
주소 값이, minPtr에는 가장 작은 값이 저장된 배열요소의 주소 값
이 저장되어야 한다.
*/

#include <stdio.h>

// 최대값 최소값의 주소를 가리키도로고 maxPtr minPtr의 값을 변경

void MaxAndMin(int arr[], int len, int** maxP, int** minP)
{
	*maxP = &arr[0];  // 비교 위해 최초값 설정
	*minP = &arr[0];

	for (int i = 1; i < len; i++)	// arr[0]이 최초 비교값이므로 i는 1부터 시작한다. arr[1]부터 시작.
	{
		if (**maxP < arr[i])		//**maxP = 현재의 최대값( data[0] ), 포인터변수를 바꾸기 위해 더블포인터를 이용.
			*maxP = &arr[i];

		if (**minP > arr[i])		//**minP = 현재의 최소값( data[0] ), 포인터변수를 바꾸기 위해 더블포인터를 이용.
			*minP = &arr[i];
			
	}

}

int main_prob17_1(void)
{
	int data[5] = { 10, 5, 7, 3, 6 };

	int* maxPtr;	// 배열 최대값 가리키는 포인터
	int* minPtr;	// 배열 최소값 가리키는 포인터

	MaxAndMin(data, 5, &maxPtr, &minPtr);

	printf("최대값 = %d,  최소값 = %d\n", *maxPtr, *minPtr);

	return 0;
}