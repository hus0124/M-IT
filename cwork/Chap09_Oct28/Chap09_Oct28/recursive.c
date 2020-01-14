/*
����Լ� : �Լ������� �ٽ� �ڱ� �ڽ��� ȣ���ϴ� �Լ�
������ �� : ���������� ����Ͽ� �������� �Լ��� ����ǵ��� �ؾ� ��.
���� ���Ǵ� ��� :  ū ������ ���� ������ ��� �ɰ�� Ǫ�� ��� (divide and qonquer)
*/

#include <stdio.h>

/*void recursive(int n)
{
	printf("recursive �Լ��� ȣ���\n");
    if (n > 0)
	recursive(n - 1);		// �̰� ����Լ�. �� �Լ� ������ �ڱ� �ڽ��� �ٽ� ȣ���Ѵ�.
}*/

int factorial(int n)		// n! = n * (n - 1)!
{
	if (n == 1)
		return 1;
	else
	{
		return n * factorial(n - 1); // ����Լ�
	}
}
int main(void)
{
	/*printf("recursive �Լ� ���� ���� ���\n");
	recursive(100);
	printf("recursive �Լ� ���� �Ŀ� ���\n");*/
	printf("%d\n",factorial(6));	// 6! ���
	return 0;
}