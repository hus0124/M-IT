/*
���� 09-2
������ ���α׷� ����ڰ� �Է��ϴ� ���� �����Ͽ� �� �հ踦 ����ϴ� �����̴�.

#include	<stdio.h>
int total = 0;

int AddToTal(int num)
{
	total += num;
	return total;
}

int main(void)
{
	int num, i;
	for(i = 0;i < 3;i++) {
		printf("�Է�%d: ", i+1);
		scanf("%d", &num);
		printf("����: %d\n", AddToTotal(num));
	}
	return 0;
}

���� ���������� �Լ� AddToTotal������ ����� �������� �������� total�� �����Ͽ��µ�, �̸�
static ������ ��ü�غ���. �� static �������� ��ü�������� main�Լ��� ������ ����� �ϸ� ����
����� �����Ͽ��� �Ѵ�.

*/

#include	<stdio.h>
//int total = 0;		// �������� ���

int AddToTotal(int num)
{
	static int total = 0;		//static ���� ����, ó�� ȣ��� �� �ѹ��� �ʱ�ȭ��.
	int var1 = 10;		// �Լ��� ȣ��ɶ����� �����
	total += num;
	return total;
}

int main_prob092(void)
{
	int num, i;
	for (i = 0; i < 3; i++) {
		printf("�Է�%d: ", i + 1);
		scanf("%d", &num);
		printf("����: %d\n", AddToTotal(num));
	}
	return 0;
}