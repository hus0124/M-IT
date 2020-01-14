#include <stdio.h>

int main_HowChar(void)

{
	char ch1 = 'B';
	int ch2 = 'F';
	// EOF : 파일에 정보 저장하고 파일 내용 마지막에 입력 End of File -> -1 (int)
	char ch3 = 65;
	int ch4 = 100;
	printf("%c %d\n", ch1, ch1);
	printf("%c %d\n", ch2, ch2);
	printf("%c %d\n", ch3, ch3);
	printf("%c %d\n", ch4, ch4);

	return 0;
}