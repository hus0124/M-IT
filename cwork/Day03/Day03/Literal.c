#include <stdio.h>

int main_554(void)

{
	printf("literal int size: %d\n", sizeof(7));
	printf("literal double size: %d\n", sizeof(7.14));
	printf("literal char size: %d\n", sizeof('A'));

	int num = 30;		// 30�� ���α׷� �� ����ϴ� ��� �ڷ��̹Ƿ� ��� ����ȴ�. ����Ұ�.
	int sum = 20 + 40;	// 20�� 40�� int ������ ���ͷ� ��� 

	printf("%d\n", sizeof(20));
	printf("%d\n", sizeof(3.4));
	printf("%d\n", sizeof(3.4f));

	return 0;
}