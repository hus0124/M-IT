/*
void ������
void* ������ ������ ������� ��� �ּҵ��� ���常 �����ϴ�. 
���� : ������ ������ �𸣹Ƿ� ���������� ����� �� ����.
������ : �ּҿ� ������ ������ �˾ƾ� �Ѵ�. 
�׷��� ��� ������ ���������� Ȯ���� �� ������ ���� �� ��ȯ

int sum = 100
int count = 2
double avg = (double) sum / count -> () ��ȣ �ȿ� ������ �� �Ἥ ���� ����ȯ

void* vptr -> (int *) vptr ->���� ����ȯ���� ������ ������ �� �� �ְ� �ȴ�. �̷��� ������ �����ϴ�. 


*/

#include <stdio.h>

int main_voidP(void)
{
	int num = 10;
	printf("num = %d\n", num);
	void* ptr = &num;
//	printf("num = %d\n", *ptr);
	printf("num = %d\n", *(int*)ptr);  // ���� ����ȯ int �����ͷ� �ٲ�. 
	
	return 0;
}