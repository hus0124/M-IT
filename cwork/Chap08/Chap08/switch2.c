/*
switch(num) {
case 1:
case 2:
  printf("1�� 2�� ��� �� �� ����\n");
  break;
case 3:
case 4:
  printf("3�� 4�� ��� �� �� ����\n");
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
		printf("1�� 2�� ��� ����\n"); //	break ���� �� ���̽��� ����. 1�� 2 �Է��� ��� ��� �� �޽����� ���´�.
		break;
	case 3:
		printf("3�� ��� ����\n");
		break;
	case 4:
		printf("4�� ��� ����\n");
		break;
	}
	return 0;
}