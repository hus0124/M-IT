/*
���������� ������ �� �Ķ���͸� �Է¹޴� ���

int main(int argc, char *argv[]) 
{ 
}
*/

#include <stdio.h>
#include <string.h>

int main_mainargu(int argc, char* argv[])		//argc �Ű����� (�Ķ����) �� ��
										//argv[] : ������ �迭 -> �Ķ������ ��(���ڿ� ������)
{
	int i = 0;
	printf("���޵� ���ڿ��� ��: %d\n", argc);

	for (i = 0; i < argc; i++)
	{
		printf("%d��° �Ķ���� : %s\n", i + 1, argv[i]);
	}

	int a = atoi(argv[1]);		//atoi : asc to integer ���ڿ��� ���� �� ������ �ٲ��ִ� �Լ�.
	int b = atoi(argv[2]);

	printf("��: %d\n", a + b);

	return 0;
}