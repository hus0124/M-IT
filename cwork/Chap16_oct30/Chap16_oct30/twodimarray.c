/*
배열 선언하면서 초기화
*/

#include <stdio.h>

int main_td23(void)
{
	int num;
	int one = 0;

	int arr[4];
	int oarr[5] = { 1, 2, 3 };		//oarr[0]=1 oarr[1]=2 oarr[2]=3 나머지는 0 들어감

	int arr2d[3][4];
	int arrtwo[4][3] = { { 1, 2, 3 }, { 2, 4, 6 }, { 10 }, { 5, 10 } };  // 2차원 배열도 나머진 다 0 들어감

	int tadd[3][3] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
	// { {1,2,3}, {4,5,6,}, {7,8,9}} 와 같은 것.

	int www[][3] = { 1, 2, 3, 4, 5, 6, 7, 8 };  // 자동으로 채워지면서 비어있는 행 크기가 정해지게 된다.
	// int sss[][] = { 2, 4, 6, 8 }; 에러가 난다. 경우의 수가 나뉘기 때문.

	// 역시 에러 난다. int ttt[3][] = { 1, 2, 3, 4, 5, 6, 7, 8 };

	printf("메모리 크기 = %d\n", sizeof(www));

	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			printf("%d\n", www[i][j]);
		}
	}
	return 0;
}