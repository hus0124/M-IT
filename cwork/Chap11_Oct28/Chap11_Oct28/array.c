/*
1���� �迭 ���� ��
������Ÿ�� �迭 �̸�[ ũ�� ]; (ex : int arrDim [ 8 ] )

������ Ÿ�� : int char double long long float short long double
�迭 �̸� : ���� �̸��� ���� �۸��� �Ѵ�.
ũ�� : �ʿ��� ��ŭ ����

*/

#include <stdio.h>

int main_array(void)	// ���������� stack�� ����ǰ� �ʱ�ȭ ���� ������ ������ ���� ����ȴ�.
{
	char carr[10];		// �����Է�, ����� �� "abc" (3ó�� ��������) -> "abc\0" (�����δ� 4) char�� 1 �ڸ��� \0�� ������.
	short sarr[20];
	int narr[30] = { 10, 20 };		// narr[0] = 10, narr[1] = 20, narr[2~29] �� 0�� ����
	double darr[20];		// �����Ⱚ(� ������ ��)

	narr[10] = 20;
	// �迭�� �ݺ��� ��뿡 �����ϴ�.

	for (int i = 0; i < 30; i++)
		narr[i] = 2 * i;
	// sizeof : �޸𸮿��� �� ����Ʈ�� �����ϴ���? 

	printf("narr �޸� ũ�� = %d\n", sizeof(narr));
	
	for (int i = 0; i < 30; i++)
		printf("narr[%d] = %d\n", i, narr[i]);

	return 0;
}