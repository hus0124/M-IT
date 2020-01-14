/*다음 수식인 계승(factorial)을 계산하는 프로그램을 작성해보자.

n! = 1 * 2 * 3 * ... * n

프로그램 사용자로부터 n에 해당하는 정수를 입력받는다. 그러면 n의 계승 n!을 계산해서 출력이
이루어져야 한다.

합을 구할 땐 초기치 0이어도 된다. sum = 0; 
근데 곱셈 나눗셈할땐 초기치 1이어야 한다. 

*/

#include <stdio.h>

int main_0742(void)
{
	int n;
	int fac = 1;			//그런데 결과값 크기가 너무 크면 int(4바이트) 로 감당 안 됨. 
	                        //더 큰 범위는 long long(8바이트) 쓸건지 판단필요.

	printf("정수를 입력하세요 : ");
	scanf("%d", &n);

	for (int i = 0; i < n; i++)
	{
		fac *= (n-i);
	}

	printf("%d! = %d\n\n", n, fac);

	return 0;
}