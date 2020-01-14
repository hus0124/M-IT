#include <stdio.h>

int main(void)
{
	int arr[10];
	int num;
	int* fptr = &arr[0];	// 배열의 처음부터 
	int* bptr = &arr[9];	// 배열의 뒤에서부터
	int front = 0;
	int back = 9;

	printf("총 10개의 숫자 입력\n");

	for (int i = 0; i < 10; i++)
	{
		printf("입력 : ");
		scanf("%d", &num);
		
		if (num % 2 == 0)
			*bptr-- = num;
		// arr[back--] = num;
		else
			*fptr++ = num;
		// arr[front++] = num;
	}
	printf("배열 요소의 출력 : ");
	for (int i = 0; i < 10; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
	return 0;
}