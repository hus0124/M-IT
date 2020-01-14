/*
도전 3. 두 개의 정수를 입력 받아서 최대 공약수(GCD)를 구하는
	프로그램을 작성해 보자.


입력으로 두 수 m,n(m>n)이 들어온다.
n이 0이라면, m을 출력하고 알고리즘을 종료한다.
m이 n으로 나누어 떨어지면, n을 출력하고 알고리즘을 종료한다.
그렇지 않으면, m을 n으로 나눈 나머지를 새롭게 m에 대입하고, m과 n을 바꾸고 3번으로 돌아온다.
위 과정은 “n, m에 대해서 나머지 연산을 실시할 수 있다”라는 조건에만 의존하므로, 
정수환뿐 아니라, 임의의 유클리드 정역에 대해도 똑같은 과정을 거치면 공약인자가 구해진다. 


*/

#include <stdio.h>
int GCD(int large, int small)
{
	if (small == 0)
		return large;
	else
		return GCD(small, large % small);
}

int main_mission3(void)
{
	int num1, num2;
	printf("두 개의 정수를 입력 : ");
	scanf("%d %d", &num1, &num2);

	if (num1 > num2)		//num1(큰 수 ->작은수) num2(작은수 ->큰수)
	{
		int tmp = num1;
		num1 = num2;
		num2 = tmp;			//큰 수 작은 수 서로 변환 과정

	}
	printf("최대공약수 = %d\n", GCD(num2, num1));
	
	return 0;
}