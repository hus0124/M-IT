#include <stdio.h>

int main_dummy(void)
{
	int asc;
	printf("���� �Է�: ");
	scanf("%d", &asc);
	printf("�ƽ�Ű���� : %c\n", asc);

	char ch;
	printf("�ƽ�Ű ���� �Է�: ");
	scanf("%c", &ch);				// �տ��� �Է��� ���͸� ���̷� ó���ϱ� ���� ����
	scanf("%c", &ch);
	printf("�ƽ�Ű �ڵ� ��: %d\n", ch);

	return 0;

}