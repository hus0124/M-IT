/*
���� 22-1 [����ü�� ����]

���ڿ� ������ "������ �̸�"�� ���ڿ� ������ "�ֹε�Ϲ�ȣ" �׸��� ���� ������ "�޿�����"�� �����ϴ�
employee��� �̸��� ����ü�� �����غ���. �׸����� employee ����ü ������ �ϳ� ������ ����,
���α׷� ����ڰ� �Է��ϴ� ������ �� ������ ä����. �׸��� ���������� ����ü ������ ä���� �����͸� ����� ����.

���� 22-2 [����ü �迭�� ����]
�ռ� ���� 22-1���� ������ employee ����ü�� ������� ���̰� 3�� �迭�� ��������. 
�׸��� �� ���� ������ ���α׷� ����ڷκ��� �Է� �޾Ƽ� �迭�� ������ ����, 
�迭�� ������ �����͸� ������� ����ϴ� ������ �ۼ��� ����.

*/

#include <stdio.h>
#include "define.h" // ������Ϸ� ������ �� ���ο� �ҷ��´�.

#define MAX 3	// ��� ����. preprocessor 

/* �� ������ ������Ϸ� �ҷ��´�.

struct employee
{
	char name[10];
	char ssn[15];
	int pay;
};

*/

int main_prob222(void)
{
	struct employee arr[MAX];
	
	for (int i = 0; i < MAX; i++)
	{
		printf("������ �̸� : ");
		scanf("%s", arr[i].name);
		
		printf("�ֹι�ȣ : ");
		scanf("%s", arr[i].ssn);	// ������ arr �ּ� & �ʿ����
		
		printf("�޿����� : ");
		scanf("%d", &arr[i].pay);	// int�� arr �ּ� & �ʿ�
		printf("\n");
	}

	printf("\n\n");

	for (int i = 0; i < MAX; i++)
	{
		printf("�̸� : %s\n", arr[i].name);
		printf("�ֹι�ȣ : %s\n", arr[i].ssn);
		printf("�޿� : %d\n", arr[i].pay);
		printf("\n");
	}
	return 0;
}