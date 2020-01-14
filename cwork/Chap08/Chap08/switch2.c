/*
switch(num) {
case 1:
case 2:
  printf("1과 2의 경우 둘 다 실행\n");
  break;
case 3:
case 4:
  printf("3과 4의 경우 둘 다 실행\n");
  break;
*/

#include <stdio.h>

int main_switch2(void)

{
	int num;
	scanf("%d", &num);
	switch (num)
	{
	case 1:
	case 2:
		printf("1과 2인 경우 실행\n"); //	break 없이 두 케이스가 묶임. 1과 2 입력의 경우 모두 이 메시지가 나온다.
		break;
	case 3:
		printf("3인 경우 실행\n");
		break;
	case 4:
		printf("4인 경우 실행\n");
		break;
	}
	return 0;
}