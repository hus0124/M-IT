#include <stdio.h>

int main_miss1(void)

{
	int arr[4][4] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
	
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			printf("%3d", arr[i][j]);
		}
		printf("\n");
	}
	printf("\n");

	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			printf("%3d", arr[3 - j][i]);
		}
		printf("\n");
	}
	printf("\n");

	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			printf("%3d", arr[3 - i][3 - j]);
		}
		printf("\n");
	}
	printf("\n");

	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			printf("%3d", arr[j][3 - i]);
		}
		printf("\n");
	}
	return 0;
}