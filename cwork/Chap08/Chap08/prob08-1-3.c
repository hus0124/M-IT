/*
���� 3. �л��� ��ü ��������� ���� ������ ����ϴ� ���α׷���
    �ۼ�����. �л��� ������ 90�� �̻��̸� A, 80�� �̻��̸� B,
    70�� �̻��̸� C, 50�� �̻��̸� D �׸��� �� �̸��̸� F��!
    ���α׷� ���� �� ������� ����, ����, ���� ������ �Է� ��
    �´�. �׸���� ����� ���� ���� �׿� ������ ������ ����ϸ�
    �ȴ�.*/

#include <stdio.h>

int main_0813(void)
{
	int kor, eng, math;
	printf("���������� �Է��ϼ��� : ");
	scanf("%d", &kor);
	printf("���������� �Է��ϼ��� : ");
	scanf("%d", &eng);
	printf("���������� �Է��ϼ��� : ");
	scanf("%d", &math);

	double avg = (kor + eng + math) / (double)3;

	if (avg >= 90)
	{
		printf("���� : A");
	}
	else if (avg >= 80)
	{
		printf("���� : B");
	}
	else if (avg >= 70)
	{
		printf("���� : C");
	}
	else if (avg >= 50)
	{
		printf("���� : D");
	}
	else
	{
		printf("���� : F");
	}
	return 0;
}