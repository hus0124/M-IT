#include <stdio.h>

int main_554(void)

{
	printf("literal int size: %d\n", sizeof(7));
	printf("literal double size: %d\n", sizeof(7.14));
	printf("literal char size: %d\n", sizeof('A'));

	int num = 30;		// 30은 프로그램 중 사용하는 상수 자료이므로 어딘가 저장된다. 변경불가.
	int sum = 20 + 40;	// 20과 40도 int 형태의 리터럴 상수 

	printf("%d\n", sizeof(20));
	printf("%d\n", sizeof(3.4));
	printf("%d\n", sizeof(3.4f));

	return 0;
}