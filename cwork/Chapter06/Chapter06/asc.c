#include <stdio.h>

int main_dummy(void)
{
	int asc;
	printf("숫자 입력: ");
	scanf("%d", &asc);
	printf("아스키문자 : %c\n", asc);

	char ch;
	printf("아스키 문자 입력: ");
	scanf("%c", &ch);				// 앞에서 입력한 엔터를 더미로 처리하기 위한 문장
	scanf("%c", &ch);
	printf("아스키 코드 값: %d\n", ch);

	return 0;

}