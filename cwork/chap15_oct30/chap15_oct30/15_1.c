#include <stdio.h>

void function1(int arr[], int len)
{
	printf("홀수 출력: ");
	for (int i = 0; i < 10; i++)
	{
		if (arr[i] % 2 != 0)
			printf("%d ", arr[i]);
	}
	printf("\n");
}
	
void function2(int arr[], int len)
{
	printf("짝수 출력: ");
	for (int i = 0; i < 10; i++)
	{
		if (arr[i] % 2 == 0)
		printf("%d ", arr[i]);
	}
	printf("\n");
}

int main_15_1(void)
{
	int arr[10];
	
	for (int i = 0; i < 10; i++)
	{
		printf("입력 : ");
		scanf("%d", &arr[i]);
	}

	function1(arr, 10);
	function2(arr, 10);

	return 0;
}