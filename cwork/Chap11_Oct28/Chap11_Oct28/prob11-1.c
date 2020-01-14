/*
문제 1. 길이가 5인 int형 배열을 선언해서 프로그램 사용자로부터
	총 5개의 정수를 입력 받자. 그리고 입력이 끝나면 다음의 내용
	을 출력하도록 예제를 작성해 보자.
	- 입력된 정수 중에서 최대값
	- 입력된 정수 중에서 최소값
	- 입력된 정수의 합

	1. 입력을 먼저 받고
	[힌트] scanf("%d", &arr[i]);
	2. 최대값과 최소값, 합을 계산
*/

#include <stdio.h>

int main_prob11_1(void)

{
	int arr[5];	// int형 배열 5개
	int max; 
	int min;
	int sum;

	for (int i = 0; i < 5; i++)	// 데이터 5개 입력 arr[0] ~ arr[4]까지 5개
	{
		scanf("%d", &arr[i]);
	}
	//처음 수 arr[0]
	max = min = sum = arr[0];
	// 나머지 arr[1] ~ arr[4]을 반복문으로 처리하려는 의도

	for (int i = 1; i < 5; i++)	 // 새로운 최대 최소값과 합계 구하기 
	{
		if (max < arr[i])
			max = arr[i];

		if (min > arr[i])
			min = arr[i];
		sum += arr[i];
	}
	printf("최대값 = %d\n", max);
	printf("최소값 = %d\n", min);
	printf("합계 = %d\n", sum);
	return 0;
}
