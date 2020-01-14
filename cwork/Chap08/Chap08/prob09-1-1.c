/*문제 1
세 개의 정수를 인자로 전달받아서 그 중 가장 큰 수를 반환하는 함수와 가장 작은 수를 반환하는
함수를 정의해보자. 그리고 이 함수들을 호출하는 적절한 main 함수도 작성해보자.
*/

#include <stdio.h>

int getMaximumNumber(int num1, int num2, int num3)
{
	if (num1 > num2)
	{
		if (num1 > num3)
		{
			return num1;
		}
		else
		{
		return num3;
		}
	}
	else
	{
		if (num2 > num3)
		{
			return num2;
		}
		else
		{
			return num3;
		}
	}

}

int getMinimumNumber(int num1, int num2, int num3)
{
	int min = num1;		// 초기값
	if (min > num2)
		min = num2;
	if (min > num3)
		min = num3;
	return min;
}

int main_0911(void)
{
	int n1, n2, n3;
	printf("세 정수 입력: ");
	scanf("%d %d %d", &n1, &n2, &n3);

	int max = getMaximumNumber(n1, n2, n3);
	int min = getMinimumNumber(n1, n2, n3);

	printf("최대값 = %d\t최소값=%d\n", max, min);
	return 0;
}