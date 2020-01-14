/*
switch 조건문

경우의 수에 따라 실행을 할 경우

그러나 다른 조건문보다 제한적이다. 변수가 int char 처럼 딱 떨어지는 명확한 경우에 가능하다

*/

#include <stdio.h>

int main_switch1(void)
{
	int num, num2;
	int menu;
	printf("두 수 입력 : ");
	scanf("%d %d", &num, &num2);
	printf("메뉴 선택 : ");
	scanf("%d", &menu);

	switch (menu)
	{ 
	case 1:
		printf("%d + %d = %d\n", num, num2, num + num2);
		break;
	case 2:
		printf("%d - %d = %d\n", num, num2, num - num2);
		break;
	case 3:
		printf("%d * %d = %d\n", num, num2, num * num2);
		break;
	case 4:
		printf("%d / %d = %d\n", num, num2, num / num2);
		break;
	case 5:
		printf("%d %% %d = %d\n", num, num2, num % num2);
		break;
	default: // other 에 해당하는 기능. 여기서는 case에 해당 안하는 경우를 의미.
		printf("올바른 메뉴를 선택하세요. 메뉴 선택은 1 ~ 5 중 선택합니다.\n");
		break; // 디폴트는 switch 종료라서 break 생략은 가능
	}
	return 0;
}