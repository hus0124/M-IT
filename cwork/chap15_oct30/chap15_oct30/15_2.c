#include <stdio.h>

void convert(int n)	//2로 나누어서 나머지를 계속 저장해야함. 배열도 필요.
{
	int bin[200];	// for 문 다음에 i를 계속 사용해야 함. 사전에 미리 정의.
	int i;
	for (i = 0; n > 0; i++)
	{
		bin[i] = n % 2;

		n /= 2;
	}
	for (i--; i >= 0; i--) // 위에서 i = 3 까지 돌고 i = 4에서 끝. i = 4에서 멈춰 있으니 하나 줄여주고 거꾸로 꺼내야.
	{
		printf("%d", bin[i]);
	}
	printf("\n");
}

int main_15_2(void)
{
	int num;
	printf("10진수 정수 입력: ");
	scanf("%d", &num);

	convert(num);

	return 0;
}
