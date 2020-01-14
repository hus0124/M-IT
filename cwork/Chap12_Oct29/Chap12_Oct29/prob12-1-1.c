/*
���� 12-1 [�������� ����]
���� 1 �Ʒ��� ���� ���� �� ������ ������ ������ ���踦 �׷���
	�����غ���. ���� ����� ����� ������ ����.
	int main(void) {
	int num = 10;
	int * ptr1 = &num;
	int * ptr2 = ptr1;

	(*ptr1)++;
	(*ptr2)++;
	printf("%d\n", num);
	return 0;
	}
	*/

#include <stdio.h>

int main_prob1211(void) 
{
	int num = 10;
	int* ptr1 = &num;
	int* ptr2 = ptr1;

	printf("ptr1 = %p, *ptr1 = %d\n", ptr1, *ptr1);

	(*ptr1)++;		// ������ ���� ptr1�� ����Ű�� ������ ���� ����
    (*ptr2)++;      // ��ȣ ���� *ptr2++ �ϸ� �ƹ��͵� ���� �ʰ� �ּҰ��� ������.    
	
	printf("%d\n", num);
	printf("ptr1 = %p\tptr1 = %d\n", ptr1, *ptr1);		// %p : �ּ���� ����																		
	printf("ptr2 = %p\tptr2 = %d\n", ptr2, *ptr2);
	return 0;
}