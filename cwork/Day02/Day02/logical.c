/*
�������� : && (And) || (Or) ! (Not)
�� ���� ������ �������� �����Ѵ�.
&& : �� �� ���� �� ��
|| : �� �� �ϳ��� ���� �� ��
! : ����, �ݴ� (�� -> ����,  ���� -> ��)
*/

#include <stdio.h>

int main_logical(void)
{
	int age = 25;
	int gender = 1;		// 1�� ����, 0�� ����

	if (age >= 10 && age < 20)		// ���� ������ 10��
		printf("10��\n\n");
	else if (gender == 1 || age > 40)
		printf("�׳�\n\n");
	
	
	return 0;
}

