/*
공용체
*/

#include <stdio.h>

typedef struct
{
	int mem1, mem2; //각각 4바이트
	double mem3;	//8바이트
} Struct;

typedef union
{
	struct ddd
	{
		short high;	//2 바이트
		short low;	//2 바이트
	};
	
	int mem3; // 4바이트 = high 2 + low 2
} Union2;		// 공용체의 크기는 가장 큰 데이터에 기준.  만일 4 + 8 = 12가 잡히면 mem3 는 12 중 8바이트.

typedef struct bbb
{
	char a;		// 1바이트
	char dummy[3];
	int num;	// 4바이트
}BBB;	// 근데 이걸 출력해보면 8바이트이다. int 4바이트에 맞추어 char 에도 4 바이트 할당. 사이에 char dummy[3]이 있는거다.


int main(void) 
{
	/*printf("구조체 structure 의 메모리 크기 = %d\n", sizeof(Struct)); // 4 + 4 + 8 = 16
	printf("공용체 union 의 메모리 크기 = %d\n", sizeof(Union));	  // 8 = ( 4 + 4)	
	printf("\n");

	printf("%d\n", sizeof(BBB));
	*/
	Union2 u2;
	u2.mem3 = 0x00111100;		// mem3 는 더블형
	printf("int mem3 = %x\n", u2.mem3);
	printf("high = %x, low = %x\n", u2.ddd.high, u2.ddd.low);
	
	return 0;
}