/*
���� �߻� ���
int rand(); 0~�ִ��(RAND_MAX:32267) �߿��� ������ �� �߿� ������ ���� �߻���Ų��. short (16bit) ���

void srand
*/

#include <stdio.h>
#include <stdlib.h>	// rand() �Լ� �����ϴ� ���̺귯��

int main_miss3(void)
{
	srand((int)time(NULL));

	printf("0~%d ������ �� �߻�\n", RAND_MAX);
	for (int i = 0; i < 5; i++)
		printf("%d\n", rand());
	return 0;
	

	

}

