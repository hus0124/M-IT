#include <stdio.h>

int main_05_1_1(void)
{
	int x1, y1;		//�»�� ��ǥ
	int x2, y2;		//���ϴ� ��ǥ

	printf("�»�� ��ǥ���� �Է��ϼ��� : ");
	scanf("%d %d", &x1, &y1);

	printf("���ϴ� ��ǥ���� �Է��ϼ��� : ");
	scanf("%d %d", &x2, &y2);

	int width = x2 - x1;
	int height = y2 - y1;
	
	printf("���� = %d\n", width * height);

	return 0;

}