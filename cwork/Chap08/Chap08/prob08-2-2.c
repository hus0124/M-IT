/*
문제 2. 다음 식을 만족하는 모든 A와 Z를 구하는 프로그램을 작성
	해보자.

	A Z
  + Z A
 ------
	9 9
*/

#include <stdio.h>

int main_0822(void)
{
	/*int A, Z;

	for (A = 0; A < 10; A++)
	{
		for (Z = 0; Z < 10; Z++)
		{
			if (A + Z == 9)
			{
				printf("%d %d\n", A, Z);
			}

		}
	}
	*/

	int A, Z;

	for (A = 0; A < 10; A++)
	{
		for (Z = 0; Z < 10; Z++)
		{  
			if (A == Z)
			{
				continue;			// 근데 정수라서 A = Z 이면 9 안 나오니 사실 의미는 없음
			}
			if ((A*10 + Z + Z*10 +A) == 99)
			{
				printf("A=%d, Z=%d\n", A, Z);
				printf("%d%d + %d%d = 99\n\n", A, Z, Z, A);
				break;				// A + Z = 9 아닌 경우는 수행하지 않도록 break 걸어서 효율을 높임
			}
		}
	}
	return 0; 
}