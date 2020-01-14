/* 
양의 수에 대한 음수를 구하는 방법
2의 보수를 구한다.
1의 보수 + 1
1의 보수 : num -> ~num 으로 바꾼다
*/

#include <stdio.h>

int main_operationnagative(void)
{
	int num1 = 15;
	int num2 = ~num1 + 1;
	printf("NOT 연산 후 보수 결과 : %d\n", num2);
	printf("16진수 출력 0x%x\n", num1);

		int num = 0xffffffff;
		printf("16진수 출력 0x%x\n", num);
		num = num & 0xfefefefe;		//e: 14(1110) 비트 0으로 masking 시킨다. 그 비트를 0으로 만들어버림(And 에서 0 이니까)
		printf("16진수 출력 0x%x\n", num);
		num = num | 0x01010000;		// 비트 1 로 masking 시킨다. (Or 에서 1 하나면 무조건 1)
		printf("16진수 출력 0x%x\n", num);
		num = 0x01;
		printf("16진수 출력 0x%x\n", num);
		num <<= 4;	// 왼쪽으로 4비트 이동 (왼쪽으로 1비트 이동 -> * 2 효과)
		printf("16진수 출력 0x%x\n", num);
		num >>= 2;	// 오른쪽으로 2비트 이동 (오른쪽으로 1비트 이동-> /2 효과)
		printf("16진수 출력 0x%x\n", num);
		// 16이 2^4  오른쪽으로 2비트 이동, 4배 감소해서 4

		int num3 = 16;
		printf("0x%x\n", num3);
			return 0;
}