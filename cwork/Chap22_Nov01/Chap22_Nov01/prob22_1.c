/*
���� 22-1 [����ü�� ����]

���ڿ� ������ "������ �̸�"�� ���ڿ� ������ "�ֹε�Ϲ�ȣ" �׸��� ���� ������ "�޿�����"�� �����ϴ� 
employee��� �̸��� ����ü�� �����غ���. �׸����� employee ����ü ������ �ϳ� ������ ����, 
���α׷� ����ڰ� �Է��ϴ� ������ �� ������ ä����. �׸��� ���������� ����ü ������ ä���� �����͸� ����� ����.
*/

#include <stdio.h>

struct employee
{
	char name[10];
	char ssn[15];
	int pay;
};

int main_prob221(void)
{
	struct employee new;
	printf("������ �̸� : ");
	scanf("%s", new.name);

	printf("�ֹι�ȣ : ");
	scanf("%s", new.ssn);

	printf("�޿����� : ");
	scanf("%d", &new.pay);
	
	printf("\n\n");
	printf("%s\n", new.name);
	printf("%s\n", new.ssn);
	printf("%d\n", new.pay);
	return 0;
}