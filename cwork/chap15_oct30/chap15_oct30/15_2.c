#include <stdio.h>

void convert(int n)	//2�� ����� �������� ��� �����ؾ���. �迭�� �ʿ�.
{
	int bin[200];	// for �� ������ i�� ��� ����ؾ� ��. ������ �̸� ����.
	int i;
	for (i = 0; n > 0; i++)
	{
		bin[i] = n % 2;

		n /= 2;
	}
	for (i--; i >= 0; i--) // ������ i = 3 ���� ���� i = 4���� ��. i = 4���� ���� ������ �ϳ� �ٿ��ְ� �Ųٷ� ������.
	{
		printf("%d", bin[i]);
	}
	printf("\n");
}

int main_15_2(void)
{
	int num;
	printf("10���� ���� �Է�: ");
	scanf("%d", &num);

	convert(num);

	return 0;
}
