/*
switch ���ǹ�

����� ���� ���� ������ �� ���

�׷��� �ٸ� ���ǹ����� �������̴�. ������ int char ó�� �� �������� ��Ȯ�� ��쿡 �����ϴ�

*/

#include <stdio.h>

int main_switch1(void)
{
	int num, num2;
	int menu;
	printf("�� �� �Է� : ");
	scanf("%d %d", &num, &num2);
	printf("�޴� ���� : ");
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
	default: // other �� �ش��ϴ� ���. ���⼭�� case�� �ش� ���ϴ� ��츦 �ǹ�.
		printf("�ùٸ� �޴��� �����ϼ���. �޴� ������ 1 ~ 5 �� �����մϴ�.\n");
		break; // ����Ʈ�� switch ����� break ������ ����
	}
	return 0;
}